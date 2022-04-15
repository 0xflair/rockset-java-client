/*
 * REST API
 * Rockset's REST API allows for creating and managing all resources in Rockset. Each supported endpoint is documented below.  All requests must be authorized with a Rockset API key, which can be created in the [Rockset console](https://console.rockset.com). The API key must be provided as `ApiKey <api_key>` in the `Authorization` request header. For example: ``` Authorization: ApiKey aB35kDjg93J5nsf4GjwMeErAVd832F7ad4vhsW1S02kfZiab42sTsfW5Sxt25asT ```  All endpoints are only accessible via https.  Build something awesome!
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.rockset.client.api;

import com.rockset.client.ApiCallback;
import com.rockset.client.ApiClient;
import com.rockset.client.ApiResponse;
import com.rockset.client.Configuration;
import com.rockset.client.Pair;
import com.rockset.client.ProgressRequestBody;
import com.rockset.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.rockset.client.model.CreateApiKeyRequest;
import com.rockset.client.model.CreateApiKeyResponse;
import com.rockset.client.model.DeleteApiKeyResponse;
import com.rockset.client.model.ErrorModel;
import com.rockset.client.model.GetApiKeyResponse;
import com.rockset.client.model.ListApiKeysResponse;
import com.rockset.client.model.UpdateApiKeyRequest;
import com.rockset.client.model.UpdateApiKeyResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApiKeysApi {
    private ApiClient apiClient;

    public ApiKeysApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ApiKeysApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for create
     * @param body JSON object (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws Exception If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call createCall(CreateApiKeyRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/v1/orgs/self/users/self/apikeys";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call createValidateBeforeCall(CreateApiKeyRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new Exception("Missing the required parameter 'body' when calling create(Async)");
        }
        

        com.squareup.okhttp.Call call = createCall(body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Create API Key
     * Create a new API key for the authenticated user.
     * @param body JSON object (required)
     * @return CreateApiKeyResponse
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public CreateApiKeyResponse create(CreateApiKeyRequest body) throws Exception {
        ApiResponse<CreateApiKeyResponse> resp = createWithHttpInfo(body);
        return resp.getData();
    }

    /**
     * Create API Key
     * Create a new API key for the authenticated user.
     * @param body JSON object (required)
     * @return ApiResponse&lt;CreateApiKeyResponse&gt;
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<CreateApiKeyResponse> createWithHttpInfo(CreateApiKeyRequest body) throws Exception {
        com.squareup.okhttp.Call call = createValidateBeforeCall(body, null, null);
        Type localVarReturnType = new TypeToken<CreateApiKeyResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Create API Key (asynchronously)
     * Create a new API key for the authenticated user.
     * @param body JSON object (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws Exception If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call createAsync(CreateApiKeyRequest body, final ApiCallback<CreateApiKeyResponse> callback) throws Exception {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = createValidateBeforeCall(body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<CreateApiKeyResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for delete
     * @param name Name of the API key. (required)
     * @param user Email of the API key owner. Use &#x60;self&#x60; to specify the currently authenticated user. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws Exception If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call deleteCall(String name, String user, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/orgs/self/users/{user}/apikeys/{name}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "user" + "\\}", apiClient.escapeString(user.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call deleteValidateBeforeCall(String name, String user, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new Exception("Missing the required parameter 'name' when calling delete(Async)");
        }
        
        // verify the required parameter 'user' is set
        if (user == null) {
            throw new Exception("Missing the required parameter 'user' when calling delete(Async)");
        }
        

        com.squareup.okhttp.Call call = deleteCall(name, user, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Delete API Key
     * Delete an API key for any user in your organization.
     * @param name Name of the API key. (required)
     * @param user Email of the API key owner. Use &#x60;self&#x60; to specify the currently authenticated user. (required)
     * @return DeleteApiKeyResponse
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public DeleteApiKeyResponse delete(String name, String user) throws Exception {
        ApiResponse<DeleteApiKeyResponse> resp = deleteWithHttpInfo(name, user);
        return resp.getData();
    }

    /**
     * Delete API Key
     * Delete an API key for any user in your organization.
     * @param name Name of the API key. (required)
     * @param user Email of the API key owner. Use &#x60;self&#x60; to specify the currently authenticated user. (required)
     * @return ApiResponse&lt;DeleteApiKeyResponse&gt;
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<DeleteApiKeyResponse> deleteWithHttpInfo(String name, String user) throws Exception {
        com.squareup.okhttp.Call call = deleteValidateBeforeCall(name, user, null, null);
        Type localVarReturnType = new TypeToken<DeleteApiKeyResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Delete API Key (asynchronously)
     * Delete an API key for any user in your organization.
     * @param name Name of the API key. (required)
     * @param user Email of the API key owner. Use &#x60;self&#x60; to specify the currently authenticated user. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws Exception If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call deleteAsync(String name, String user, final ApiCallback<DeleteApiKeyResponse> callback) throws Exception {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = deleteValidateBeforeCall(name, user, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<DeleteApiKeyResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for get
     * @param user Email of the API key owner. Use &#x60;self&#x60; to specify the currently authenticated user. (required)
     * @param name Name of the API key. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws Exception If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCall(String user, String name, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/orgs/self/users/{user}/apikeys/{name}"
            .replaceAll("\\{" + "user" + "\\}", apiClient.escapeString(user.toString()))
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getValidateBeforeCall(String user, String name, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        
        // verify the required parameter 'user' is set
        if (user == null) {
            throw new Exception("Missing the required parameter 'user' when calling get(Async)");
        }
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new Exception("Missing the required parameter 'name' when calling get(Async)");
        }
        

        com.squareup.okhttp.Call call = getCall(user, name, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieve API Key
     * Retrieve a particular API key for any user in your organization.
     * @param user Email of the API key owner. Use &#x60;self&#x60; to specify the currently authenticated user. (required)
     * @param name Name of the API key. (required)
     * @return GetApiKeyResponse
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetApiKeyResponse get(String user, String name) throws Exception {
        ApiResponse<GetApiKeyResponse> resp = getWithHttpInfo(user, name);
        return resp.getData();
    }

    /**
     * Retrieve API Key
     * Retrieve a particular API key for any user in your organization.
     * @param user Email of the API key owner. Use &#x60;self&#x60; to specify the currently authenticated user. (required)
     * @param name Name of the API key. (required)
     * @return ApiResponse&lt;GetApiKeyResponse&gt;
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetApiKeyResponse> getWithHttpInfo(String user, String name) throws Exception {
        com.squareup.okhttp.Call call = getValidateBeforeCall(user, name, null, null);
        Type localVarReturnType = new TypeToken<GetApiKeyResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve API Key (asynchronously)
     * Retrieve a particular API key for any user in your organization.
     * @param user Email of the API key owner. Use &#x60;self&#x60; to specify the currently authenticated user. (required)
     * @param name Name of the API key. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws Exception If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAsync(String user, String name, final ApiCallback<GetApiKeyResponse> callback) throws Exception {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getValidateBeforeCall(user, name, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetApiKeyResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for list
     * @param user Email of the API key owner. Use &#x60;self&#x60; to specify the currently authenticated user. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws Exception If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listCall(String user, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/orgs/self/users/{user}/apikeys"
            .replaceAll("\\{" + "user" + "\\}", apiClient.escapeString(user.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listValidateBeforeCall(String user, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        
        // verify the required parameter 'user' is set
        if (user == null) {
            throw new Exception("Missing the required parameter 'user' when calling list(Async)");
        }
        

        com.squareup.okhttp.Call call = listCall(user, progressListener, progressRequestListener);
        return call;

    }

    /**
     * List API Keys
     * List API key metadata for any user in your organization.
     * @param user Email of the API key owner. Use &#x60;self&#x60; to specify the currently authenticated user. (required)
     * @return ListApiKeysResponse
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListApiKeysResponse list(String user) throws Exception {
        ApiResponse<ListApiKeysResponse> resp = listWithHttpInfo(user);
        return resp.getData();
    }

    /**
     * List API Keys
     * List API key metadata for any user in your organization.
     * @param user Email of the API key owner. Use &#x60;self&#x60; to specify the currently authenticated user. (required)
     * @return ApiResponse&lt;ListApiKeysResponse&gt;
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListApiKeysResponse> listWithHttpInfo(String user) throws Exception {
        com.squareup.okhttp.Call call = listValidateBeforeCall(user, null, null);
        Type localVarReturnType = new TypeToken<ListApiKeysResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List API Keys (asynchronously)
     * List API key metadata for any user in your organization.
     * @param user Email of the API key owner. Use &#x60;self&#x60; to specify the currently authenticated user. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws Exception If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listAsync(String user, final ApiCallback<ListApiKeysResponse> callback) throws Exception {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listValidateBeforeCall(user, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListApiKeysResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for update
     * @param name Name of the API key. (required)
     * @param user Email of the API key owner. Use &#x60;self&#x60; to specify the currently authenticated user. (required)
     * @param body JSON object (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws Exception If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call updateCall(String name, String user, UpdateApiKeyRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/v1/orgs/self/users/{user}/apikeys/{name}"
            .replaceAll("\\{" + "name" + "\\}", apiClient.escapeString(name.toString()))
            .replaceAll("\\{" + "user" + "\\}", apiClient.escapeString(user.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call updateValidateBeforeCall(String name, String user, UpdateApiKeyRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new Exception("Missing the required parameter 'name' when calling update(Async)");
        }
        
        // verify the required parameter 'user' is set
        if (user == null) {
            throw new Exception("Missing the required parameter 'user' when calling update(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new Exception("Missing the required parameter 'body' when calling update(Async)");
        }
        

        com.squareup.okhttp.Call call = updateCall(name, user, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update API Key State
     * Update the state of an API key for any user in your organization.
     * @param name Name of the API key. (required)
     * @param user Email of the API key owner. Use &#x60;self&#x60; to specify the currently authenticated user. (required)
     * @param body JSON object (required)
     * @return UpdateApiKeyResponse
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UpdateApiKeyResponse update(String name, String user, UpdateApiKeyRequest body) throws Exception {
        ApiResponse<UpdateApiKeyResponse> resp = updateWithHttpInfo(name, user, body);
        return resp.getData();
    }

    /**
     * Update API Key State
     * Update the state of an API key for any user in your organization.
     * @param name Name of the API key. (required)
     * @param user Email of the API key owner. Use &#x60;self&#x60; to specify the currently authenticated user. (required)
     * @param body JSON object (required)
     * @return ApiResponse&lt;UpdateApiKeyResponse&gt;
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UpdateApiKeyResponse> updateWithHttpInfo(String name, String user, UpdateApiKeyRequest body) throws Exception {
        com.squareup.okhttp.Call call = updateValidateBeforeCall(name, user, body, null, null);
        Type localVarReturnType = new TypeToken<UpdateApiKeyResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update API Key State (asynchronously)
     * Update the state of an API key for any user in your organization.
     * @param name Name of the API key. (required)
     * @param user Email of the API key owner. Use &#x60;self&#x60; to specify the currently authenticated user. (required)
     * @param body JSON object (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws Exception If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call updateAsync(String name, String user, UpdateApiKeyRequest body, final ApiCallback<UpdateApiKeyResponse> callback) throws Exception {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = updateValidateBeforeCall(name, user, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UpdateApiKeyResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
