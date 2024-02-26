package com.rockset.client;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RetryInterceptor implements Interceptor {
    private static final Logger LOG = LoggerFactory.getLogger(RetryInterceptor.class);

    private int maxRetries;
    private long delayMillis;

    public RetryInterceptor(int maxRetries, long delayMillis) {
        this.maxRetries = maxRetries;
        this.delayMillis = delayMillis;
    }

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        IOException lastException = null;

        Response response = null;

        try {
            response = chain.proceed(request);

            if (response.isSuccessful()) {
                return response;
            }
        } catch (Exception e) {
            LOG.warn("First failed rockset attempt to send request {} with {}", request.url(), e);
            lastException = new IOException("Failed to send request", e);
        }

        for (int attempt = 0; attempt < maxRetries; attempt++) {
            LOG.warn("Sending rockset attempt " + attempt + " to send request: " + request.url());
            if (response != null){
                try {
                    response.close();
                } catch (Exception e) {
                }
            }

            try {
                request = request.newBuilder().build();
                response = chain.proceed(request);

                if (response.isSuccessful()) {
                    return response;
                } else {
                    String message = "Response was not successful: ";
                    try {
                        message += "" + response.code() + " " + response.message() + " " + response.body().string();
                    } catch (Exception e) {
                        message += response.message();
                    }
                    lastException = new IOException(message);
                    LOG.warn(
                            "Retrying rockset attempt " + attempt + " failed with: " + message);
                    try {
                        Thread.sleep(delayMillis);
                    } catch (InterruptedException ie) {
                        Thread.currentThread().interrupt();
                        throw new IOException("Interrupted during retry", ie);
                    }
                }
            } catch (IOException e) {
                lastException = e;
                try {
                    Thread.sleep(delayMillis);
                } catch (InterruptedException ie) {
                    Thread.currentThread().interrupt();
                    throw new IOException("Interrupted during retry", ie);
                }
            }
        }

        throw lastException != null ? lastException : new IOException("Unknown network exception");
    }
}
