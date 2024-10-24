# ListApi

All URIs are relative to *https://api.sendx.io/api/v1/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createList**](ListApi.md#createList) | **POST** /list | Create List |
| [**deleteList**](ListApi.md#deleteList) | **DELETE** /list/{listId} | Delete List |
| [**getAllLists**](ListApi.md#getAllLists) | **GET** /list | Get All Lists |
| [**getListById**](ListApi.md#getListById) | **GET** /list/{listId} | Get List |
| [**updateList**](ListApi.md#updateList) | **PUT** /list/{listId} | Update List |


<a id="createList"></a>
# **createList**
> CreateResponse createList(listRequest)

Create List

Create a new list.

### Example
```java
// Import classes:
import sendx_java_sdk.ApiClient;
import sendx_java_sdk.ApiException;
import sendx_java_sdk.Configuration;
import sendx_java_sdk.auth.*;
import sendx_java_sdk.models.*;
import sendx_java_sdk.ListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sendx.io/api/v1/rest");
    
    // Configure API key authorization: apiKeyAuth
    ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
    apiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyAuth.setApiKeyPrefix("Token");

    ListApi apiInstance = new ListApi(defaultClient);
    ListRequest listRequest = new ListRequest(); // ListRequest | 
    try {
      CreateResponse result = apiInstance.createList(listRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#createList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listRequest** | [**ListRequest**](ListRequest.md)|  | |

### Return type

[**CreateResponse**](CreateResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Created Successfully |  -  |
| **401** | Not Authorized |  -  |
| **403** | Forbidden - Tag with name already exists |  -  |
| **406** | Not Acceptable |  -  |
| **422** | Request body is not in proper format |  -  |
| **500** | Internal Server Error |  -  |

<a id="deleteList"></a>
# **deleteList**
> DeleteResponse deleteList(listId)

Delete List

Deletes a specific list by its ID.

### Example
```java
// Import classes:
import sendx_java_sdk.ApiClient;
import sendx_java_sdk.ApiException;
import sendx_java_sdk.Configuration;
import sendx_java_sdk.auth.*;
import sendx_java_sdk.models.*;
import sendx_java_sdk.ListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sendx.io/api/v1/rest");
    
    // Configure API key authorization: apiKeyAuth
    ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
    apiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyAuth.setApiKeyPrefix("Token");

    ListApi apiInstance = new ListApi(defaultClient);
    String listId = "sendx123"; // String | The ID of the list you want to delete
    try {
      DeleteResponse result = apiInstance.deleteList(listId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#deleteList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The ID of the list you want to delete | |

### Return type

[**DeleteResponse**](DeleteResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List deleted successfully |  -  |
| **401** | Not Authorized |  -  |
| **406** | listId is empty |  -  |
| **422** | Request body is not in proper format |  -  |
| **500** | Internal Server Error |  -  |

<a id="getAllLists"></a>
# **getAllLists**
> List&lt;ListModel&gt; getAllLists(offset, limit, search)

Get All Lists

Retrieve all lists for the account.

### Example
```java
// Import classes:
import sendx_java_sdk.ApiClient;
import sendx_java_sdk.ApiException;
import sendx_java_sdk.Configuration;
import sendx_java_sdk.auth.*;
import sendx_java_sdk.models.*;
import sendx_java_sdk.ListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sendx.io/api/v1/rest");
    
    // Configure API key authorization: apiKeyAuth
    ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
    apiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyAuth.setApiKeyPrefix("Token");

    ListApi apiInstance = new ListApi(defaultClient);
    Integer offset = 0; // Integer | Offset for pagination.
    Integer limit = 10; // Integer | Limit the number of results returned.
    String search = "Marketing"; // String | Search term to filter lists.
    try {
      List<ListModel> result = apiInstance.getAllLists(offset, limit, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getAllLists");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **offset** | **Integer**| Offset for pagination. | [optional] |
| **limit** | **Integer**| Limit the number of results returned. | [optional] |
| **search** | **String**| Search term to filter lists. | [optional] |

### Return type

[**List&lt;ListModel&gt;**](ListModel.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved all Lists for account successfully |  -  |
| **401** | Not Authorized |  -  |
| **500** | Internal Server Error |  -  |

<a id="getListById"></a>
# **getListById**
> ListModel getListById(listId)

Get List

Retrieve a specific list by its ID.

### Example
```java
// Import classes:
import sendx_java_sdk.ApiClient;
import sendx_java_sdk.ApiException;
import sendx_java_sdk.Configuration;
import sendx_java_sdk.auth.*;
import sendx_java_sdk.models.*;
import sendx_java_sdk.ListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sendx.io/api/v1/rest");
    
    // Configure API key authorization: apiKeyAuth
    ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
    apiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyAuth.setApiKeyPrefix("Token");

    ListApi apiInstance = new ListApi(defaultClient);
    String listId = "sendx123"; // String | The ID of the list you want to retrieve
    try {
      ListModel result = apiInstance.getListById(listId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#getListById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The ID of the list you want to retrieve | |

### Return type

[**ListModel**](ListModel.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved the list |  -  |
| **401** | Not Authorized |  -  |
| **406** | Not Acceptable |  -  |
| **403** | Forbidden Tag with name already exists |  -  |
| **422** | Request body is not in proper format |  -  |
| **500** | Internal Server Error |  -  |

<a id="updateList"></a>
# **updateList**
> OperationResponse updateList(listId, listRequest)

Update List

Update an existing list by its ID.

### Example
```java
// Import classes:
import sendx_java_sdk.ApiClient;
import sendx_java_sdk.ApiException;
import sendx_java_sdk.Configuration;
import sendx_java_sdk.auth.*;
import sendx_java_sdk.models.*;
import sendx_java_sdk.ListApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sendx.io/api/v1/rest");
    
    // Configure API key authorization: apiKeyAuth
    ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
    apiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyAuth.setApiKeyPrefix("Token");

    ListApi apiInstance = new ListApi(defaultClient);
    String listId = "listId_example"; // String | The ID of the list to be updated.
    ListRequest listRequest = new ListRequest(); // ListRequest | 
    try {
      OperationResponse result = apiInstance.updateList(listId, listRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ListApi#updateList");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **listId** | **String**| The ID of the list to be updated. | |
| **listRequest** | [**ListRequest**](ListRequest.md)|  | |

### Return type

[**OperationResponse**](OperationResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List Updated Successfully |  -  |
| **401** | Not Authorized |  -  |
| **403** | Forbidden - Tag with name already exists |  -  |
| **406** | Not Acceptable |  -  |
| **422** | Request body is not in proper format |  -  |
| **500** | Internal Server Error |  -  |

