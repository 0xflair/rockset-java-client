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

        Response response = chain.proceed(request);

        if (response.isSuccessful()) {
            return response;
        }

        for (int attempt = 0; attempt < maxRetries; attempt++) {
            LOG.info("Sending rockset attempt " + attempt + " to send request: " + request.url());
            try {
                response.close();
            } catch (Exception e) {
            }

            try {
                request = request.newBuilder().build();
                response = chain.proceed(request);

                if (response.isSuccessful()) {
                    return response;
                } else {
                    lastException = new IOException("Response was not successful: " + response.code() + " "
                            + response.message() + " " + response.body().string());
                    LOG.warn(
                            "Retrying rockset attempt " + attempt + " failed with response: "
                                    + response.code() + " "
                                    + response.message() + " " + response.body().string());
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
