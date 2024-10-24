# SenderApi

All URIs are relative to *https://api.sendx.io/api/v1/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSender**](SenderApi.md#createSender) | **POST** /sender | Create Sender |
| [**getAllSenders**](SenderApi.md#getAllSenders) | **GET** /sender | Get All Senders |


<a id="createSender"></a>
# **createSender**
> Sender createSender(senderRequest)

Create Sender

Creates a new sender in the system.

### Example
```java
// Import classes:
import sendx_java_sdk.ApiClient;
import sendx_java_sdk.ApiException;
import sendx_java_sdk.Configuration;
import sendx_java_sdk.auth.*;
import sendx_java_sdk.models.*;
import sendx_java_sdk.SenderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sendx.io/api/v1/rest");
    
    // Configure API key authorization: apiKeyAuth
    ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
    apiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyAuth.setApiKeyPrefix("Token");

    SenderApi apiInstance = new SenderApi(defaultClient);
    SenderRequest senderRequest = new SenderRequest(); // SenderRequest | 
    try {
      Sender result = apiInstance.createSender(senderRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SenderApi#createSender");
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
| **senderRequest** | [**SenderRequest**](SenderRequest.md)|  | |

### Return type

[**Sender**](Sender.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Sender Created Successfully |  -  |
| **401** | Not Authorized |  -  |
| **403** | Forbidden - Tag with name already exists |  -  |
| **406** | Not Acceptable |  -  |
| **422** | Unprocessable Entity - Request body is not in the proper format |  -  |
| **500** | Internal Server Error |  -  |

<a id="getAllSenders"></a>
# **getAllSenders**
> List&lt;SenderResponse&gt; getAllSenders(offset, limit, search)

Get All Senders

Retrieve all senders for the team, with optional filters like offset, limit, and search.

### Example
```java
// Import classes:
import sendx_java_sdk.ApiClient;
import sendx_java_sdk.ApiException;
import sendx_java_sdk.Configuration;
import sendx_java_sdk.auth.*;
import sendx_java_sdk.models.*;
import sendx_java_sdk.SenderApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sendx.io/api/v1/rest");
    
    // Configure API key authorization: apiKeyAuth
    ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
    apiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyAuth.setApiKeyPrefix("Token");

    SenderApi apiInstance = new SenderApi(defaultClient);
    Integer offset = 0; // Integer | Number of records to skip
    Integer limit = 10; // Integer | Maximum number of records to return
    String search = "search_example"; // String | Search keyword to filter senders by name or email
    try {
      List<SenderResponse> result = apiInstance.getAllSenders(offset, limit, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SenderApi#getAllSenders");
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
| **offset** | **Integer**| Number of records to skip | [optional] [default to 0] |
| **limit** | **Integer**| Maximum number of records to return | [optional] [default to 10] |
| **search** | **String**| Search keyword to filter senders by name or email | [optional] |

### Return type

[**List&lt;SenderResponse&gt;**](SenderResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved all senders for team successfully |  -  |
| **401** | Not Authorized |  -  |
| **500** | Internal Server Error |  -  |

