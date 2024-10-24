# CampaignApi

All URIs are relative to *https://api.sendx.io/api/v1/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCampaign**](CampaignApi.md#createCampaign) | **POST** /campaign | Create Campaign |
| [**deleteCampaign**](CampaignApi.md#deleteCampaign) | **DELETE** /campaign/{campaignId} | Delete Campaign |
| [**editCampaign**](CampaignApi.md#editCampaign) | **PUT** /campaign/{campaignId} | Edit Campaign |
| [**getAllCampaigns**](CampaignApi.md#getAllCampaigns) | **GET** /campaign | Get All Campaigns |
| [**getCampaignById**](CampaignApi.md#getCampaignById) | **GET** /campaign/{campaignId} | Get Campaign By Id |


<a id="createCampaign"></a>
# **createCampaign**
> CreateResponse createCampaign(campaignRequest)

Create Campaign

Create a new email campaign

### Example
```java
// Import classes:
import sendx_java_sdk.ApiClient;
import sendx_java_sdk.ApiException;
import sendx_java_sdk.Configuration;
import sendx_java_sdk.auth.*;
import sendx_java_sdk.models.*;
import sendx_java_sdk.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sendx.io/api/v1/rest");
    
    // Configure API key authorization: apiKeyAuth
    ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
    apiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyAuth.setApiKeyPrefix("Token");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    CampaignRequest campaignRequest = new CampaignRequest(); // CampaignRequest | The campaign content
    try {
      CreateResponse result = apiInstance.createCampaign(campaignRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#createCampaign");
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
| **campaignRequest** | [**CampaignRequest**](CampaignRequest.md)| The campaign content | |

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
| **200** | Campaign Created Successfully |  -  |
| **401** | Not Authorized |  -  |
| **403** | Forbidden - Tag with name already exists |  -  |
| **406** | Not Acceptable |  -  |
| **422** | Request body is not in proper format |  -  |
| **500** | Internal Server Error |  -  |

<a id="deleteCampaign"></a>
# **deleteCampaign**
> DeleteCampaign200Response deleteCampaign(campaignId)

Delete Campaign

Deletes a specific campaign by its campaignId.

### Example
```java
// Import classes:
import sendx_java_sdk.ApiClient;
import sendx_java_sdk.ApiException;
import sendx_java_sdk.Configuration;
import sendx_java_sdk.auth.*;
import sendx_java_sdk.models.*;
import sendx_java_sdk.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sendx.io/api/v1/rest");
    
    // Configure API key authorization: apiKeyAuth
    ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
    apiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyAuth.setApiKeyPrefix("Token");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String campaignId = "campaignId_example"; // String | The ID of the campaign to delete
    try {
      DeleteCampaign200Response result = apiInstance.deleteCampaign(campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#deleteCampaign");
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
| **campaignId** | **String**| The ID of the campaign to delete | |

### Return type

[**DeleteCampaign200Response**](DeleteCampaign200Response.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Campaign deleted successfully |  -  |
| **401** | Not Authorized |  -  |
| **406** | Campaign ID is empty |  -  |
| **422** | Request body is not in proper format |  -  |
| **500** | Internal Server Err |  -  |

<a id="editCampaign"></a>
# **editCampaign**
> Campaign editCampaign(campaignId, campaignRequest)

Edit Campaign

Submit edited content for a specific campaign.

### Example
```java
// Import classes:
import sendx_java_sdk.ApiClient;
import sendx_java_sdk.ApiException;
import sendx_java_sdk.Configuration;
import sendx_java_sdk.auth.*;
import sendx_java_sdk.models.*;
import sendx_java_sdk.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sendx.io/api/v1/rest");
    
    // Configure API key authorization: apiKeyAuth
    ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
    apiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyAuth.setApiKeyPrefix("Token");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String campaignId = "campaignId_example"; // String | The ID of the campaign to edit
    CampaignRequest campaignRequest = new CampaignRequest(); // CampaignRequest | 
    try {
      Campaign result = apiInstance.editCampaign(campaignId, campaignRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#editCampaign");
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
| **campaignId** | **String**| The ID of the campaign to edit | |
| **campaignRequest** | [**CampaignRequest**](CampaignRequest.md)|  | |

### Return type

[**Campaign**](Campaign.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Campaign edited successfully |  -  |
| **401** | Not Authorized |  -  |
| **406** | Not Acceptable |  -  |
| **403** | Forbidden - Tag with name already exists |  -  |
| **422** | Request body is not in proper format |  -  |
| **500** | Internal Server Error |  -  |

<a id="getAllCampaigns"></a>
# **getAllCampaigns**
> List&lt;Campaign&gt; getAllCampaigns(offset, limit, search)

Get All Campaigns

Retrieve a list of all campaigns.

### Example
```java
// Import classes:
import sendx_java_sdk.ApiClient;
import sendx_java_sdk.ApiException;
import sendx_java_sdk.Configuration;
import sendx_java_sdk.auth.*;
import sendx_java_sdk.models.*;
import sendx_java_sdk.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sendx.io/api/v1/rest");
    
    // Configure API key authorization: apiKeyAuth
    ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
    apiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyAuth.setApiKeyPrefix("Token");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    Integer offset = 0; // Integer | Offset for pagination
    Integer limit = 20; // Integer | Limit for pagination
    String search = "search_example"; // String | Search term to filter campaigns
    try {
      List<Campaign> result = apiInstance.getAllCampaigns(offset, limit, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getAllCampaigns");
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
| **offset** | **Integer**| Offset for pagination | [optional] [default to 0] |
| **limit** | **Integer**| Limit for pagination | [optional] [default to 20] |
| **search** | **String**| Search term to filter campaigns | [optional] |

### Return type

[**List&lt;Campaign&gt;**](Campaign.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved campaigns successfully. |  -  |
| **401** | Not Authorized - Invalid or missing API key. |  -  |
| **500** | Internal Server Error - Something went wrong on the server. |  -  |

<a id="getCampaignById"></a>
# **getCampaignById**
> Campaign getCampaignById(campaignId)

Get Campaign By Id

Retrieve a specific campaign using its ID.

### Example
```java
// Import classes:
import sendx_java_sdk.ApiClient;
import sendx_java_sdk.ApiException;
import sendx_java_sdk.Configuration;
import sendx_java_sdk.auth.*;
import sendx_java_sdk.models.*;
import sendx_java_sdk.CampaignApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sendx.io/api/v1/rest");
    
    // Configure API key authorization: apiKeyAuth
    ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
    apiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyAuth.setApiKeyPrefix("Token");

    CampaignApi apiInstance = new CampaignApi(defaultClient);
    String campaignId = "campaignId_example"; // String | The ID of the campaign to retrieve.
    try {
      Campaign result = apiInstance.getCampaignById(campaignId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CampaignApi#getCampaignById");
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
| **campaignId** | **String**| The ID of the campaign to retrieve. | |

### Return type

[**Campaign**](Campaign.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved campaign successfully. |  -  |
| **401** | Not Authorized - Invalid or missing API key. |  -  |
| **406** | Not Acceptable - Request not acceptable. |  -  |
| **403** | Forbidden - Tag with name already exists. |  -  |
| **422** | Request body is not in proper format. |  -  |
| **500** | Internal Server Error - Something went wrong on the server. |  -  |

