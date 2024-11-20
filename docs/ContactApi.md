# ContactApi

All URIs are relative to *https://api.sendx.io/api/v1/rest*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createContact**](ContactApi.md#createContact) | **POST** /contact | Create a contact |
| [**deleteContact**](ContactApi.md#deleteContact) | **DELETE** /contact/{identifier} | Delete Contact |
| [**getAllContacts**](ContactApi.md#getAllContacts) | **GET** /contact | Get All Contacts |
| [**getContactById**](ContactApi.md#getContactById) | **GET** /contact/{identifier} | Get Contact by Identifier |
| [**unsubscribeContact**](ContactApi.md#unsubscribeContact) | **POST** /contact/unsubscribe/{identifier} | Unsubscribe Contact |
| [**updateContact**](ContactApi.md#updateContact) | **PUT** /contact/{identifier} | Update Contact |


<a id="createContact"></a>
# **createContact**
> OperationResponse createContact(contactRequest)

Create a contact

Create Contact with given data

### Example
```java
// Import classes:
import sendx_java_sdk.ApiClient;
import sendx_java_sdk.ApiException;
import sendx_java_sdk.Configuration;
import sendx_java_sdk.auth.*;
import sendx_java_sdk.models.*;
import sendx_java_sdk.ContactApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sendx.io/api/v1/rest");
    
    // Configure API key authorization: apiKeyAuth
    ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
    apiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyAuth.setApiKeyPrefix("Token");

    ContactApi apiInstance = new ContactApi(defaultClient);
    ContactRequest contactRequest = new ContactRequest(); // ContactRequest | 
    try {
      OperationResponse result = apiInstance.createContact(contactRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactApi#createContact");
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
| **contactRequest** | [**ContactRequest**](ContactRequest.md)|  | |

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
| **200** | Contact Created Successfully |  -  |
| **401** | Not Authorized |  -  |
| **406** | Not Acceptable |  -  |
| **422** | Request body is not in proper format |  -  |
| **500** | Internal Server Error |  -  |

<a id="deleteContact"></a>
# **deleteContact**
> OperationResponse deleteContact(identifier)

Delete Contact

Deletes Contact

### Example
```java
// Import classes:
import sendx_java_sdk.ApiClient;
import sendx_java_sdk.ApiException;
import sendx_java_sdk.Configuration;
import sendx_java_sdk.auth.*;
import sendx_java_sdk.models.*;
import sendx_java_sdk.ContactApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sendx.io/api/v1/rest");
    
    // Configure API key authorization: apiKeyAuth
    ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
    apiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyAuth.setApiKeyPrefix("Token");

    ContactApi apiInstance = new ContactApi(defaultClient);
    String identifier = "identifier_example"; // String | The Contact ID/ Email to delete
    try {
      OperationResponse result = apiInstance.deleteContact(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactApi#deleteContact");
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
| **identifier** | **String**| The Contact ID/ Email to delete | |

### Return type

[**OperationResponse**](OperationResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Contact deleted successfully |  -  |
| **401** | Not Authorized |  -  |
| **406** | Contact ID is empty |  -  |
| **422** | Request body is not in proper format |  -  |
| **500** | Internal Server Error |  -  |

<a id="getAllContacts"></a>
# **getAllContacts**
> List&lt;Contact&gt; getAllContacts(offset, limit, contactType, search)

Get All Contacts

Find all contacts with optional filters

### Example
```java
// Import classes:
import sendx_java_sdk.ApiClient;
import sendx_java_sdk.ApiException;
import sendx_java_sdk.Configuration;
import sendx_java_sdk.auth.*;
import sendx_java_sdk.models.*;
import sendx_java_sdk.ContactApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sendx.io/api/v1/rest");
    
    // Configure API key authorization: apiKeyAuth
    ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
    apiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyAuth.setApiKeyPrefix("Token");

    ContactApi apiInstance = new ContactApi(defaultClient);
    Integer offset = 0; // Integer | Offset for pagination
    Integer limit = 10; // Integer | Limit for pagination
    String contactType = "all"; // String | Filter contacts by type
    String search = "search_example"; // String | Search term to filter contacts
    try {
      List<Contact> result = apiInstance.getAllContacts(offset, limit, contactType, search);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactApi#getAllContacts");
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
| **limit** | **Integer**| Limit for pagination | [optional] [default to 10] |
| **contactType** | **String**| Filter contacts by type | [optional] [enum: all, unsubscribed, bounced, markedspam] |
| **search** | **String**| Search term to filter contacts | [optional] |

### Return type

[**List&lt;Contact&gt;**](Contact.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of Contacts |  -  |
| **401** | Not Authorized |  -  |
| **422** | Request body is not in proper format |  -  |
| **500** | Internal Server Error |  -  |

<a id="getContactById"></a>
# **getContactById**
> Contact getContactById(identifier)

Get Contact by Identifier

Retrieve a specific contact by its identifier.

### Example
```java
// Import classes:
import sendx_java_sdk.ApiClient;
import sendx_java_sdk.ApiException;
import sendx_java_sdk.Configuration;
import sendx_java_sdk.auth.*;
import sendx_java_sdk.models.*;
import sendx_java_sdk.ContactApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sendx.io/api/v1/rest");
    
    // Configure API key authorization: apiKeyAuth
    ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
    apiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyAuth.setApiKeyPrefix("Token");

    ContactApi apiInstance = new ContactApi(defaultClient);
    String identifier = "john@doe.com"; // String | The ID or Email of the contact to retrieve.
    try {
      Contact result = apiInstance.getContactById(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactApi#getContactById");
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
| **identifier** | **String**| The ID or Email of the contact to retrieve. | |

### Return type

[**Contact**](Contact.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Retrieved contact successfully. |  -  |
| **401** | Not Authorized - Invalid or missing API key. |  -  |
| **406** | Contact ID is empty or invalid. |  -  |
| **422** | Request body is not in proper format. |  -  |
| **500** | Internal Server Error - Something went wrong on the server. |  -  |

<a id="unsubscribeContact"></a>
# **unsubscribeContact**
> OperationResponse unsubscribeContact(identifier)

Unsubscribe Contact

Unsubscribe a globally existing contact

### Example
```java
// Import classes:
import sendx_java_sdk.ApiClient;
import sendx_java_sdk.ApiException;
import sendx_java_sdk.Configuration;
import sendx_java_sdk.auth.*;
import sendx_java_sdk.models.*;
import sendx_java_sdk.ContactApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sendx.io/api/v1/rest");
    
    // Configure API key authorization: apiKeyAuth
    ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
    apiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyAuth.setApiKeyPrefix("Token");

    ContactApi apiInstance = new ContactApi(defaultClient);
    String identifier = "sendx123"; // String | The Contact ID or email to unsubscribe
    try {
      OperationResponse result = apiInstance.unsubscribeContact(identifier);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactApi#unsubscribeContact");
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
| **identifier** | **String**| The Contact ID or email to unsubscribe | |

### Return type

[**OperationResponse**](OperationResponse.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Contact successfully unsubscribed |  -  |
| **401** | Not Authorized |  -  |
| **406** | Contact ID is empty or invalid |  -  |
| **422** | Request body is not in proper format |  -  |
| **500** | Internal Server Error |  -  |

<a id="updateContact"></a>
# **updateContact**
> Contact updateContact(identifier, contactRequest)

Update Contact

Update Contact with given data

### Example
```java
// Import classes:
import sendx_java_sdk.ApiClient;
import sendx_java_sdk.ApiException;
import sendx_java_sdk.Configuration;
import sendx_java_sdk.auth.*;
import sendx_java_sdk.models.*;
import sendx_java_sdk.ContactApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.sendx.io/api/v1/rest");
    
    // Configure API key authorization: apiKeyAuth
    ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
    apiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyAuth.setApiKeyPrefix("Token");

    ContactApi apiInstance = new ContactApi(defaultClient);
    String identifier = "sendxid123"; // String | The ID or email of the Contact to update
    ContactRequest contactRequest = new ContactRequest(); // ContactRequest | 
    try {
      Contact result = apiInstance.updateContact(identifier, contactRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ContactApi#updateContact");
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
| **identifier** | **String**| The ID or email of the Contact to update | |
| **contactRequest** | [**ContactRequest**](ContactRequest.md)|  | |

### Return type

[**Contact**](Contact.md)

### Authorization

[apiKeyAuth](../README.md#apiKeyAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Contact Updated Successfully |  -  |
| **401** | Not Authorized |  -  |
| **406** | Not Acceptable |  -  |
| **422** | Request body is not in proper format |  -  |
| **500** | Internal Server Error |  -  |

