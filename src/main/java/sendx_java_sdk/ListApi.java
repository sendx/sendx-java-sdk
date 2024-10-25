/*
 * SendX REST API
 * # Introduction SendX is an email marketing product. It helps you convert website visitors to customers, send them promotional emails, engage with them using drip sequences and craft custom journeys using powerful but simple automations. The SendX API is organized around REST. Our API has predictable resource-oriented URLs, accepts form-encoded request bodies, returns JSON-encoded responses, and uses standard HTTP response codes, authentication, and verbs. The SendX Rest API doesn’t support bulk updates. You can work on only one object per request. <br> 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@sendx.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sendx_java_sdk;

import sendx_java_sdk.ApiCallback;
import sendx_java_sdk.ApiClient;
import sendx_java_sdk.ApiException;
import sendx_java_sdk.ApiResponse;
import sendx_java_sdk.Configuration;
import sendx_java_sdk.Pair;
import sendx_java_sdk.ProgressRequestBody;
import sendx_java_sdk.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import sendx_java_sdk.CreateResponse;
import sendx_java_sdk.DeleteResponse;
import sendx_java_sdk.ListModel;
import sendx_java_sdk.ListRequest;
import sendx_java_sdk.ObjectResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ListApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ListApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for createList
     * @param listRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Created Successfully </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - Tag with name already exists </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Request body is not in proper format </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createListCall(ListRequest listRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = listRequest;

        // create path and map variables
        String localVarPath = "/list";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createListValidateBeforeCall(ListRequest listRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'listRequest' is set
        if (listRequest == null) {
            throw new ApiException("Missing the required parameter 'listRequest' when calling createList(Async)");
        }

        return createListCall(listRequest, _callback);

    }

    /**
     * Create List
     * Create a new list.
     * @param listRequest  (required)
     * @return CreateResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Created Successfully </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - Tag with name already exists </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Request body is not in proper format </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public CreateResponse createList(ListRequest listRequest) throws ApiException {
        ApiResponse<CreateResponse> localVarResp = createListWithHttpInfo(listRequest);
        return localVarResp.getData();
    }

    /**
     * Create List
     * Create a new list.
     * @param listRequest  (required)
     * @return ApiResponse&lt;CreateResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Created Successfully </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - Tag with name already exists </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Request body is not in proper format </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CreateResponse> createListWithHttpInfo(ListRequest listRequest) throws ApiException {
        okhttp3.Call localVarCall = createListValidateBeforeCall(listRequest, null);
        Type localVarReturnType = new TypeToken<CreateResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create List (asynchronously)
     * Create a new list.
     * @param listRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Created Successfully </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - Tag with name already exists </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Request body is not in proper format </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createListAsync(ListRequest listRequest, final ApiCallback<CreateResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = createListValidateBeforeCall(listRequest, _callback);
        Type localVarReturnType = new TypeToken<CreateResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteList
     * @param listId The ID of the list you want to delete (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List deleted successfully </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> listId is empty </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Request body is not in proper format </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteListCall(String listId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/list/{listId}"
            .replace("{" + "listId" + "}", localVarApiClient.escapeString(listId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteListValidateBeforeCall(String listId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new ApiException("Missing the required parameter 'listId' when calling deleteList(Async)");
        }

        return deleteListCall(listId, _callback);

    }

    /**
     * Delete List
     * Deletes a specific list by its ID.
     * @param listId The ID of the list you want to delete (required)
     * @return DeleteResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List deleted successfully </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> listId is empty </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Request body is not in proper format </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public DeleteResponse deleteList(String listId) throws ApiException {
        ApiResponse<DeleteResponse> localVarResp = deleteListWithHttpInfo(listId);
        return localVarResp.getData();
    }

    /**
     * Delete List
     * Deletes a specific list by its ID.
     * @param listId The ID of the list you want to delete (required)
     * @return ApiResponse&lt;DeleteResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List deleted successfully </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> listId is empty </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Request body is not in proper format </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<DeleteResponse> deleteListWithHttpInfo(String listId) throws ApiException {
        okhttp3.Call localVarCall = deleteListValidateBeforeCall(listId, null);
        Type localVarReturnType = new TypeToken<DeleteResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete List (asynchronously)
     * Deletes a specific list by its ID.
     * @param listId The ID of the list you want to delete (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List deleted successfully </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> listId is empty </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Request body is not in proper format </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteListAsync(String listId, final ApiCallback<DeleteResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteListValidateBeforeCall(listId, _callback);
        Type localVarReturnType = new TypeToken<DeleteResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getAllLists
     * @param offset Offset for pagination. (optional)
     * @param limit Limit the number of results returned. (optional)
     * @param search Search term to filter lists. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Retrieved all Lists for account successfully </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAllListsCall(Integer offset, Integer limit, String search, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/list";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (offset != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("offset", offset));
        }

        if (limit != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("limit", limit));
        }

        if (search != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("search", search));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getAllListsValidateBeforeCall(Integer offset, Integer limit, String search, final ApiCallback _callback) throws ApiException {
        return getAllListsCall(offset, limit, search, _callback);

    }

    /**
     * Get All Lists
     * Retrieve all lists for the account.
     * @param offset Offset for pagination. (optional)
     * @param limit Limit the number of results returned. (optional)
     * @param search Search term to filter lists. (optional)
     * @return List&lt;ListModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Retrieved all Lists for account successfully </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public List<ListModel> getAllLists(Integer offset, Integer limit, String search) throws ApiException {
        ApiResponse<List<ListModel>> localVarResp = getAllListsWithHttpInfo(offset, limit, search);
        return localVarResp.getData();
    }

    /**
     * Get All Lists
     * Retrieve all lists for the account.
     * @param offset Offset for pagination. (optional)
     * @param limit Limit the number of results returned. (optional)
     * @param search Search term to filter lists. (optional)
     * @return ApiResponse&lt;List&lt;ListModel&gt;&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Retrieved all Lists for account successfully </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<List<ListModel>> getAllListsWithHttpInfo(Integer offset, Integer limit, String search) throws ApiException {
        okhttp3.Call localVarCall = getAllListsValidateBeforeCall(offset, limit, search, null);
        Type localVarReturnType = new TypeToken<List<ListModel>>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get All Lists (asynchronously)
     * Retrieve all lists for the account.
     * @param offset Offset for pagination. (optional)
     * @param limit Limit the number of results returned. (optional)
     * @param search Search term to filter lists. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Retrieved all Lists for account successfully </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getAllListsAsync(Integer offset, Integer limit, String search, final ApiCallback<List<ListModel>> _callback) throws ApiException {

        okhttp3.Call localVarCall = getAllListsValidateBeforeCall(offset, limit, search, _callback);
        Type localVarReturnType = new TypeToken<List<ListModel>>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for getListById
     * @param listId The ID of the list you want to retrieve (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved the list </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden Tag with name already exists </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Request body is not in proper format </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getListByIdCall(String listId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/list/{listId}"
            .replace("{" + "listId" + "}", localVarApiClient.escapeString(listId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getListByIdValidateBeforeCall(String listId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new ApiException("Missing the required parameter 'listId' when calling getListById(Async)");
        }

        return getListByIdCall(listId, _callback);

    }

    /**
     * Get List
     * Retrieve a specific list by its ID.
     * @param listId The ID of the list you want to retrieve (required)
     * @return ListModel
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved the list </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden Tag with name already exists </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Request body is not in proper format </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ListModel getListById(String listId) throws ApiException {
        ApiResponse<ListModel> localVarResp = getListByIdWithHttpInfo(listId);
        return localVarResp.getData();
    }

    /**
     * Get List
     * Retrieve a specific list by its ID.
     * @param listId The ID of the list you want to retrieve (required)
     * @return ApiResponse&lt;ListModel&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved the list </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden Tag with name already exists </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Request body is not in proper format </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ListModel> getListByIdWithHttpInfo(String listId) throws ApiException {
        okhttp3.Call localVarCall = getListByIdValidateBeforeCall(listId, null);
        Type localVarReturnType = new TypeToken<ListModel>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get List (asynchronously)
     * Retrieve a specific list by its ID.
     * @param listId The ID of the list you want to retrieve (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successfully retrieved the list </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden Tag with name already exists </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Request body is not in proper format </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getListByIdAsync(String listId, final ApiCallback<ListModel> _callback) throws ApiException {

        okhttp3.Call localVarCall = getListByIdValidateBeforeCall(listId, _callback);
        Type localVarReturnType = new TypeToken<ListModel>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for updateList
     * @param listId The ID of the list to be updated. (required)
     * @param listRequest  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Updated Successfully </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - Tag with name already exists </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Request body is not in proper format </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateListCall(String listId, ListRequest listRequest, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = listRequest;

        // create path and map variables
        String localVarPath = "/list/{listId}"
            .replace("{" + "listId" + "}", localVarApiClient.escapeString(listId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "apiKeyAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "PUT", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call updateListValidateBeforeCall(String listId, ListRequest listRequest, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'listId' is set
        if (listId == null) {
            throw new ApiException("Missing the required parameter 'listId' when calling updateList(Async)");
        }

        // verify the required parameter 'listRequest' is set
        if (listRequest == null) {
            throw new ApiException("Missing the required parameter 'listRequest' when calling updateList(Async)");
        }

        return updateListCall(listId, listRequest, _callback);

    }

    /**
     * Update List
     * Update an existing list by its ID.
     * @param listId The ID of the list to be updated. (required)
     * @param listRequest  (required)
     * @return ObjectResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Updated Successfully </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - Tag with name already exists </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Request body is not in proper format </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ObjectResponse updateList(String listId, ListRequest listRequest) throws ApiException {
        ApiResponse<ObjectResponse> localVarResp = updateListWithHttpInfo(listId, listRequest);
        return localVarResp.getData();
    }

    /**
     * Update List
     * Update an existing list by its ID.
     * @param listId The ID of the list to be updated. (required)
     * @param listRequest  (required)
     * @return ApiResponse&lt;ObjectResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Updated Successfully </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - Tag with name already exists </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Request body is not in proper format </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<ObjectResponse> updateListWithHttpInfo(String listId, ListRequest listRequest) throws ApiException {
        okhttp3.Call localVarCall = updateListValidateBeforeCall(listId, listRequest, null);
        Type localVarReturnType = new TypeToken<ObjectResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Update List (asynchronously)
     * Update an existing list by its ID.
     * @param listId The ID of the list to be updated. (required)
     * @param listRequest  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> List Updated Successfully </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Not Authorized </td><td>  -  </td></tr>
        <tr><td> 403 </td><td> Forbidden - Tag with name already exists </td><td>  -  </td></tr>
        <tr><td> 406 </td><td> Not Acceptable </td><td>  -  </td></tr>
        <tr><td> 422 </td><td> Request body is not in proper format </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal Server Error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call updateListAsync(String listId, ListRequest listRequest, final ApiCallback<ObjectResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = updateListValidateBeforeCall(listId, listRequest, _callback);
        Type localVarReturnType = new TypeToken<ObjectResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
