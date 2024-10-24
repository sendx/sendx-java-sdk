# ReportsApi

All URIs are relative to *https://api.sendx.io/api/v1/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCampaignReport**](ReportsApi.md#getCampaignReport) | **GET** /report/campaign/{campaignId} | Get CampaignReport Data |


<a id="getCampaignReport"></a>
# **getCampaignReport**
> ReportData getCampaignReport(campaignId, integrationType)

Get CampaignReport Data

Retrieve the campaign report data based on the provided campaign id.

### Example
```java
// Import classes:
import sendx_java_sdk.ApiClient;
import sendx_java_sdk.ApiException;
import sendx_java_sdk.Configuration;
import sendx_java_sdk.auth.*;
import sendx_java_sdk.models.*;
import sendx_java_sdk.ReportsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sendx.io/api/v1/rest");
    
    // Configure API key authorization: apiKeyAuth
    ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
    apiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyAuth.setApiKeyPrefix("Token");

    ReportsApi apiInstance = new ReportsApi(defaultClient);
    String campaignId = "campaignId_example"; // String | The ID of the campaign to retrieve the report data for
    String integrationType = "integrationType_example"; // String | Type of integration for the report data (optional)
    try {
      ReportData result = apiInstance.getCampaignReport(campaignId, integrationType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportsApi#getCampaignReport");
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
| **campaignId** | **String**| The ID of the campaign to retrieve the report data for | |
| **integrationType** | **String**| Type of integration for the report data (optional) | [optional] |

### Return type

[**ReportData**](ReportData.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get Report Data Successfully |  -  |
| **401** | Not Authorized |  -  |
| **403** | Forbidden Tag with name already exists |  -  |
| **406** | Not Acceptable |  -  |
| **422** | Request body is not in proper format |  -  |
| **500** | Internal Server Error |  -  |

