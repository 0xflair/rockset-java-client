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


import com.rockset.client.model.ErrorModel;
import com.rockset.client.model.GetVirtualInstanceResponse;
import com.rockset.client.model.ListVirtualInstancesResponse;
import com.rockset.client.model.UpdateVirtualInstanceRequest;
import com.rockset.client.model.UpdateVirtualInstanceResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VirtualInstancesApi {
    private ApiClient apiClient;

    public VirtualInstancesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public VirtualInstancesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for get
     * @param virtualInstanceId uuid of the virtual instance (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws Exception If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getCall(String virtualInstanceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/orgs/self/virtualinstances/{virtualInstanceId}"
            .replaceAll("\\{" + "virtualInstanceId" + "\\}", apiClient.escapeString(virtualInstanceId.toString()));

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
    private com.squareup.okhttp.Call getValidateBeforeCall(String virtualInstanceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        
        // verify the required parameter 'virtualInstanceId' is set
        if (virtualInstanceId == null) {
            throw new Exception("Missing the required parameter 'virtualInstanceId' when calling get(Async)");
        }
        

        com.squareup.okhttp.Call call = getCall(virtualInstanceId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Retrieve Virtual Instance
     * Get details about a virtual instance.
     * @param virtualInstanceId uuid of the virtual instance (required)
     * @return GetVirtualInstanceResponse
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public GetVirtualInstanceResponse get(String virtualInstanceId) throws Exception {
        ApiResponse<GetVirtualInstanceResponse> resp = getWithHttpInfo(virtualInstanceId);
        return resp.getData();
    }

    /**
     * Retrieve Virtual Instance
     * Get details about a virtual instance.
     * @param virtualInstanceId uuid of the virtual instance (required)
     * @return ApiResponse&lt;GetVirtualInstanceResponse&gt;
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<GetVirtualInstanceResponse> getWithHttpInfo(String virtualInstanceId) throws Exception {
        com.squareup.okhttp.Call call = getValidateBeforeCall(virtualInstanceId, null, null);
        Type localVarReturnType = new TypeToken<GetVirtualInstanceResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve Virtual Instance (asynchronously)
     * Get details about a virtual instance.
     * @param virtualInstanceId uuid of the virtual instance (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws Exception If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getAsync(String virtualInstanceId, final ApiCallback<GetVirtualInstanceResponse> callback) throws Exception {

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

        com.squareup.okhttp.Call call = getValidateBeforeCall(virtualInstanceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<GetVirtualInstanceResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for list
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws Exception If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/v1/orgs/self/virtualinstances";

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
    private com.squareup.okhttp.Call listValidateBeforeCall(final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        

        com.squareup.okhttp.Call call = listCall(progressListener, progressRequestListener);
        return call;

    }

    /**
     * List Virtual Instances
     * Retrieve all virtual instances in an organization.
     * @return ListVirtualInstancesResponse
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ListVirtualInstancesResponse list() throws Exception {
        ApiResponse<ListVirtualInstancesResponse> resp = listWithHttpInfo();
        return resp.getData();
    }

    /**
     * List Virtual Instances
     * Retrieve all virtual instances in an organization.
     * @return ApiResponse&lt;ListVirtualInstancesResponse&gt;
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ListVirtualInstancesResponse> listWithHttpInfo() throws Exception {
        com.squareup.okhttp.Call call = listValidateBeforeCall(null, null);
        Type localVarReturnType = new TypeToken<ListVirtualInstancesResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * List Virtual Instances (asynchronously)
     * Retrieve all virtual instances in an organization.
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws Exception If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listAsync(final ApiCallback<ListVirtualInstancesResponse> callback) throws Exception {

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

        com.squareup.okhttp.Call call = listValidateBeforeCall(progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ListVirtualInstancesResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for set
     * @param virtualInstanceId uuid of the virtual instance (required)
     * @param body JSON object (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws Exception If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call setCall(String virtualInstanceId, UpdateVirtualInstanceRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        Object localVarPostBody = body;

        // create path and map variables
        String localVarPath = "/v1/orgs/self/virtualinstances/{virtualInstanceId}"
            .replaceAll("\\{" + "virtualInstanceId" + "\\}", apiClient.escapeString(virtualInstanceId.toString()));

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
    private com.squareup.okhttp.Call setValidateBeforeCall(String virtualInstanceId, UpdateVirtualInstanceRequest body, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws Exception {
        
        // verify the required parameter 'virtualInstanceId' is set
        if (virtualInstanceId == null) {
            throw new Exception("Missing the required parameter 'virtualInstanceId' when calling set(Async)");
        }
        
        // verify the required parameter 'body' is set
        if (body == null) {
            throw new Exception("Missing the required parameter 'body' when calling set(Async)");
        }
        

        com.squareup.okhttp.Call call = setCall(virtualInstanceId, body, progressListener, progressRequestListener);
        return call;

    }

    /**
     * Update Virtual Instance
     * Update the properties of a virtual instance.
     * @param virtualInstanceId uuid of the virtual instance (required)
     * @param body JSON object (required)
     * @return UpdateVirtualInstanceResponse
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UpdateVirtualInstanceResponse set(String virtualInstanceId, UpdateVirtualInstanceRequest body) throws Exception {
        ApiResponse<UpdateVirtualInstanceResponse> resp = setWithHttpInfo(virtualInstanceId, body);
        return resp.getData();
    }

    /**
     * Update Virtual Instance
     * Update the properties of a virtual instance.
     * @param virtualInstanceId uuid of the virtual instance (required)
     * @param body JSON object (required)
     * @return ApiResponse&lt;UpdateVirtualInstanceResponse&gt;
     * @throws Exception If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UpdateVirtualInstanceResponse> setWithHttpInfo(String virtualInstanceId, UpdateVirtualInstanceRequest body) throws Exception {
        com.squareup.okhttp.Call call = setValidateBeforeCall(virtualInstanceId, body, null, null);
        Type localVarReturnType = new TypeToken<UpdateVirtualInstanceResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Update Virtual Instance (asynchronously)
     * Update the properties of a virtual instance.
     * @param virtualInstanceId uuid of the virtual instance (required)
     * @param body JSON object (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws Exception If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call setAsync(String virtualInstanceId, UpdateVirtualInstanceRequest body, final ApiCallback<UpdateVirtualInstanceResponse> callback) throws Exception {

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

        com.squareup.okhttp.Call call = setValidateBeforeCall(virtualInstanceId, body, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UpdateVirtualInstanceResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}
