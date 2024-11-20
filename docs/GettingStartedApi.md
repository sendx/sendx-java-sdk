# GettingStartedApi

All URIs are relative to *https://api.sendx.io/api/v1/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**identifyContact**](GettingStartedApi.md#identifyContact) | **POST** /contact/identify | Identify contact |
| [**trackingContact**](GettingStartedApi.md#trackingContact) | **POST** /contact/track | Add Tracking info |


<a id="identifyContact"></a>
# **identifyContact**
> IdentifyResponse identifyContact(identifyRequest)

Identify contact

Identify a contact by email address. If the contact already exists, it will be updated.

### Example
```java
// Import classes:
import sendx_java_sdk.ApiClient;
import sendx_java_sdk.ApiException;
import sendx_java_sdk.Configuration;
import sendx_java_sdk.auth.*;
import sendx_java_sdk.models.*;
import sendx_java_sdk.GettingStartedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sendx.io/api/v1/rest");
    
    // Configure API key authorization: apiKeyAuth
    ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
    apiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyAuth.setApiKeyPrefix("Token");

    GettingStartedApi apiInstance = new GettingStartedApi(defaultClient);
    IdentifyRequest identifyRequest = new IdentifyRequest(); // IdentifyRequest | 
    try {
      IdentifyResponse result = apiInstance.identifyContact(identifyRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GettingStartedApi#identifyContact");
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
| **identifyRequest** | [**IdentifyRequest**](IdentifyRequest.md)|  | |

### Return type

[**IdentifyResponse**](IdentifyResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created Contact object |  -  |
| **400** | Invalid request parameters. |  -  |
| **500** | Internal server error. |  -  |

<a id="trackingContact"></a>
# **trackingContact**
> TrackResponse trackingContact(trackRequest)

Add Tracking info

Track a contact

### Example
```java
// Import classes:
import sendx_java_sdk.ApiClient;
import sendx_java_sdk.ApiException;
import sendx_java_sdk.Configuration;
import sendx_java_sdk.auth.*;
import sendx_java_sdk.models.*;
import sendx_java_sdk.GettingStartedApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sendx.io/api/v1/rest");
    
    // Configure API key authorization: apiKeyAuth
    ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
    apiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyAuth.setApiKeyPrefix("Token");

    GettingStartedApi apiInstance = new GettingStartedApi(defaultClient);
    TrackRequest trackRequest = new TrackRequest(); // TrackRequest | 
    try {
      TrackResponse result = apiInstance.trackingContact(trackRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GettingStartedApi#trackingContact");
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
| **trackRequest** | [**TrackRequest**](TrackRequest.md)|  | |

### Return type

[**TrackResponse**](TrackResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The created Contact object |  -  |
| **400** | Invalid request parameters. |  -  |
| **500** | Internal server error. |  -  |

