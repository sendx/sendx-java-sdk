# TagsApi

All URIs are relative to *https://api.sendx.io/api/v1/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createTag**](TagsApi.md#createTag) | **POST** /tag | Create a Tag |
| [**deleteTag**](TagsApi.md#deleteTag) | **DELETE** /tag/{tagId} | Delete a Tag |
| [**getAllTags**](TagsApi.md#getAllTags) | **GET** /tag | Get All Tags |
| [**getTagById**](TagsApi.md#getTagById) | **GET** /tag/{tagId} | Get a Tag by ID |
| [**updateTag**](TagsApi.md#updateTag) | **PUT** /tag/{tagId} | Update a Tag |


<a id="createTag"></a>
# **createTag**
> CreateResponse createTag(tagRequest)

Create a Tag

Create a new tag for the account

### Example
```java
// Import classes:
import sendx_java_sdk.ApiClient;
import sendx_java_sdk.ApiException;
import sendx_java_sdk.Configuration;
import sendx_java_sdk.auth.*;
import sendx_java_sdk.models.*;
import sendx_java_sdk.TagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sendx.io/api/v1/rest");
    
    // Configure API key authorization: apiKeyAuth
    ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
    apiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyAuth.setApiKeyPrefix("Token");

    TagsApi apiInstance = new TagsApi(defaultClient);
    TagRequest tagRequest = new TagRequest(); // TagRequest | The tag content
    try {
      CreateResponse result = apiInstance.createTag(tagRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#createTag");
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
| **tagRequest** | [**TagRequest**](TagRequest.md)| The tag content | |

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
| **200** | Tag created successfully |  -  |
| **401** | Not Authorized |  -  |
| **403** | Forbidden - Tag with this name already exists |  -  |
| **406** | Not Acceptable |  -  |
| **422** | Request body is not in proper format |  -  |
| **500** | Internal Server Error |  -  |

<a id="deleteTag"></a>
# **deleteTag**
> DeleteResponse deleteTag(tagId)

Delete a Tag

Delete an existing tag by ID

### Example
```java
// Import classes:
import sendx_java_sdk.ApiClient;
import sendx_java_sdk.ApiException;
import sendx_java_sdk.Configuration;
import sendx_java_sdk.auth.*;
import sendx_java_sdk.models.*;
import sendx_java_sdk.TagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sendx.io/api/v1/rest");
    
    // Configure API key authorization: apiKeyAuth
    ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
    apiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyAuth.setApiKeyPrefix("Token");

    TagsApi apiInstance = new TagsApi(defaultClient);
    String tagId = "tagId_example"; // String | ID of the tag to delete
    try {
      DeleteResponse result = apiInstance.deleteTag(tagId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#deleteTag");
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
| **tagId** | **String**| ID of the tag to delete | |

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
| **200** | Tag deleted successfully |  -  |
| **401** | Not Authorized |  -  |
| **406** | Tag ID is empty |  -  |
| **422** | Request body is not in proper format |  -  |
| **500** | Internal Server Error |  -  |

<a id="getAllTags"></a>
# **getAllTags**
> List&lt;Tag&gt; getAllTags(offset, limit, search)

Get All Tags

Retrieve all tags for the account with optional pagination and search filters

### Example
```java
// Import classes:
import sendx_java_sdk.ApiClient;
import sendx_java_sdk.ApiException;
import sendx_java_sdk.Configuration;
import sendx_java_sdk.auth.*;
import sendx_java_sdk.models.*;
import sendx_java_sdk.TagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sendx.io/api/v1/rest");
    
    // Configure API key authorization: apiKeyAuth
    ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
    apiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyAuth.setApiKeyPrefix("Token");

    TagsApi apiInstance = new TagsApi(defaultClient);
    Integer offset = 56; // Integer | Offset for pagination
    Integer limit = 56; // Integer | Limit the number of results
    String search = "search_example"; // String | Search term to filter tags
    try {
      List<Tag> result = apiInstance.getAllTags(offset, limit, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#getAllTags");
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
| **offset** | **Integer**| Offset for pagination | [optional] |
| **limit** | **Integer**| Limit the number of results | [optional] |
| **search** | **String**| Search term to filter tags | [optional] |

### Return type

[**List&lt;Tag&gt;**](Tag.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved all tags successfully |  -  |
| **401** | Not Authorized |  -  |
| **500** | Internal Server Error |  -  |

<a id="getTagById"></a>
# **getTagById**
> Tag getTagById(tagId)

Get a Tag by ID

Retrieve a tag based on the provided tag ID

### Example
```java
// Import classes:
import sendx_java_sdk.ApiClient;
import sendx_java_sdk.ApiException;
import sendx_java_sdk.Configuration;
import sendx_java_sdk.auth.*;
import sendx_java_sdk.models.*;
import sendx_java_sdk.TagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sendx.io/api/v1/rest");
    
    // Configure API key authorization: apiKeyAuth
    ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
    apiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyAuth.setApiKeyPrefix("Token");

    TagsApi apiInstance = new TagsApi(defaultClient);
    String tagId = "tagId_example"; // String | ID of the tag you want to fetch
    try {
      Tag result = apiInstance.getTagById(tagId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#getTagById");
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
| **tagId** | **String**| ID of the tag you want to fetch | |

### Return type

[**Tag**](Tag.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with the tag details |  -  |
| **401** | Not Authorized |  -  |
| **403** | Forbidden - Tag with the same name already exists |  -  |
| **406** | Not Acceptable |  -  |
| **422** | Request body is not in proper format |  -  |
| **500** | Internal Server Error |  -  |

<a id="updateTag"></a>
# **updateTag**
> OperationResponse updateTag(tagId, tagRequest)

Update a Tag

Update an existing tag

### Example
```java
// Import classes:
import sendx_java_sdk.ApiClient;
import sendx_java_sdk.ApiException;
import sendx_java_sdk.Configuration;
import sendx_java_sdk.auth.*;
import sendx_java_sdk.models.*;
import sendx_java_sdk.TagsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sendx.io/api/v1/rest");
    
    // Configure API key authorization: apiKeyAuth
    ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
    apiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyAuth.setApiKeyPrefix("Token");

    TagsApi apiInstance = new TagsApi(defaultClient);
    String tagId = "tagId_example"; // String | ID of the tag to update
    TagRequest tagRequest = new TagRequest(); // TagRequest | The tag content
    try {
      OperationResponse result = apiInstance.updateTag(tagId, tagRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TagsApi#updateTag");
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
| **tagId** | **String**| ID of the tag to update | |
| **tagRequest** | [**TagRequest**](TagRequest.md)| The tag content | |

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
| **200** | Tag updated successfully |  -  |
| **401** | Not Authorized |  -  |
| **403** | Forbidden - Tag with this name already exists |  -  |
| **406** | Not Acceptable |  -  |
| **422** | Request body is not in proper format |  -  |
| **500** | Internal Server Error |  -  |

