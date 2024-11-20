# EventApi

All URIs are relative to *https://api.sendx.io/api/v1/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createRevenueEvent**](EventApi.md#createRevenueEvent) | **POST** /events/revenue | Record a revenue event for a specific contact |
| [**pushCustomEvent**](EventApi.md#pushCustomEvent) | **POST** /events/custom | Push a custom event associated with a contact |


<a id="createRevenueEvent"></a>
# **createRevenueEvent**
> EventResponse createRevenueEvent(revenueEventRequest)

Record a revenue event for a specific contact

Records a revenue event, which can be attributed to campaigns, drips, workflows, or other sources of user interaction.

### Example
```java
// Import classes:
import sendx_java_sdk.ApiClient;
import sendx_java_sdk.ApiException;
import sendx_java_sdk.Configuration;
import sendx_java_sdk.auth.*;
import sendx_java_sdk.models.*;
import sendx_java_sdk.EventApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sendx.io/api/v1/rest");
    
    // Configure API key authorization: apiKeyAuth
    ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
    apiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyAuth.setApiKeyPrefix("Token");

    EventApi apiInstance = new EventApi(defaultClient);
    RevenueEventRequest revenueEventRequest = new RevenueEventRequest(); // RevenueEventRequest | 
    try {
      EventResponse result = apiInstance.createRevenueEvent(revenueEventRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#createRevenueEvent");
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
| **revenueEventRequest** | [**RevenueEventRequest**](RevenueEventRequest.md)|  | |

### Return type

[**EventResponse**](EventResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Revenue event recorded successfully. |  -  |
| **400** | Invalid request parameters. |  -  |
| **500** | Internal server error. |  -  |

<a id="pushCustomEvent"></a>
# **pushCustomEvent**
> EventResponse pushCustomEvent(customEventRequest)

Push a custom event associated with a contact

Pushes a custom event with properties and values for a specified contact.

### Example
```java
// Import classes:
import sendx_java_sdk.ApiClient;
import sendx_java_sdk.ApiException;
import sendx_java_sdk.Configuration;
import sendx_java_sdk.auth.*;
import sendx_java_sdk.models.*;
import sendx_java_sdk.EventApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sendx.io/api/v1/rest");
    
    // Configure API key authorization: apiKeyAuth
    ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
    apiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyAuth.setApiKeyPrefix("Token");

    EventApi apiInstance = new EventApi(defaultClient);
    CustomEventRequest customEventRequest = new CustomEventRequest(); // CustomEventRequest | 
    try {
      EventResponse result = apiInstance.pushCustomEvent(customEventRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling EventApi#pushCustomEvent");
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
| **customEventRequest** | [**CustomEventRequest**](CustomEventRequest.md)|  | |

### Return type

[**EventResponse**](EventResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Custom event created successfully. |  -  |
| **400** | Invalid request parameters. |  -  |
| **500** | Internal server error. |  -  |

