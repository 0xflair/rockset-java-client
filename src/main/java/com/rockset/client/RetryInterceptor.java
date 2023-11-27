package com.rockset.client;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class RetryInterceptor implements Interceptor {
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

        for (int attempt = 0; attempt < maxRetries; attempt++) {
            System.out.println("Attempt " + attempt + " to send request: " + request.url());
            try {
                Response response = chain.proceed(request);
                if (response.isSuccessful()) {
                    return response;
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
