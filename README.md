# SendX Java SDK

# Introduction 

SendX is an email marketing product. It helps you convert website visitors to customers, send them promotional emails, engage with them using drip sequences and craft custom journeys using powerful but simple automations. 

The SendX API is organized around REST. Our API has predictable resource-oriented URLs, accepts form-encoded request bodies, returns JSON-encoded responses, and uses standard HTTP response codes, authentication, and verbs.
The SendX Rest API doesn’t support bulk updates. You can work on only one object per request. <br>

## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.sendx</groupId>
  <artifactId>sendx-java-sdk</artifactId>
  <version>1.0.1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'sendx-java-sdk' jar has been published to maven central.
    mavenLocal()       // Needed if the 'sendx-java-sdk' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "io.sendx:sendx-java-sdk:1.0.1"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/sendx-java-sdk-1.0.1.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

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

    ContactApi apiInstance = new ContactApi(defaultClient);
    ContactRequest contactRequest = new ContactRequest(); // ContactRequest | 
    contactRequest.setFirstName("John")
    contactRequest.setLastName("Doe")
    contactRequest.setEmail("john.doe@sendx.io")
    contactRequest.setCompany("SendX")
    contactRequest.setLastTrackedIp("32.342.12.322")

    // Set tags as a list of strings
    List<String> tags = Arrays.asList("sner1jin3ij34b4", "234bjk2n42ednj32";
    contactRequest.setTags(tags)

    try {
      OperationResponse result = apiInstance.createContact(contactRequest);
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

## Documentation for API Endpoints

All URIs are relative to *https://api.sendx.io/api/v1/rest*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*CampaignApi* | [**createCampaign**](docs/CampaignApi.md#createCampaign) | **POST** /campaign | Create Campaign
*CampaignApi* | [**deleteCampaign**](docs/CampaignApi.md#deleteCampaign) | **DELETE** /campaign/{campaignId} | Delete Campaign
*CampaignApi* | [**editCampaign**](docs/CampaignApi.md#editCampaign) | **PUT** /campaign/{campaignId} | Edit Campaign
*CampaignApi* | [**getAllCampaigns**](docs/CampaignApi.md#getAllCampaigns) | **GET** /campaign | Get All Campaigns
*CampaignApi* | [**getCampaignById**](docs/CampaignApi.md#getCampaignById) | **GET** /campaign/{campaignId} | Get Campaign By Id
*ContactApi* | [**createContact**](docs/ContactApi.md#createContact) | **POST** /contact | Create a contact
*ContactApi* | [**deleteContact**](docs/ContactApi.md#deleteContact) | **DELETE** /contact/{identifier} | Delete Contact
*ContactApi* | [**getAllContacts**](docs/ContactApi.md#getAllContacts) | **GET** /contact | Get All Contacts
*ContactApi* | [**getContactById**](docs/ContactApi.md#getContactById) | **GET** /contact/{identifier} | Get Contact by Identifier
*ContactApi* | [**unsubscribeContact**](docs/ContactApi.md#unsubscribeContact) | **POST** /contact/unsubscribe/{identifier} | Unsubscribe Contact
*ContactApi* | [**updateContact**](docs/ContactApi.md#updateContact) | **PUT** /contact/{identifier} | Update Contact
*EventApi* | [**createRevenueEvent**](docs/EventApi.md#createRevenueEvent) | **POST** /events/revenue | Record a revenue event for a specific contact
*EventApi* | [**pushCustomEvent**](docs/EventApi.md#pushCustomEvent) | **POST** /events/custom | Push a custom event associated with a contact
*GettingStartedApi* | [**identifyContact**](docs/GettingStartedApi.md#identifyContact) | **POST** /contact/identify | Identify contact
*GettingStartedApi* | [**trackingContact**](docs/GettingStartedApi.md#trackingContact) | **POST** /contact/track | Add Tracking info
*ListApi* | [**createList**](docs/ListApi.md#createList) | **POST** /list | Create List
*ListApi* | [**deleteList**](docs/ListApi.md#deleteList) | **DELETE** /list/{listId} | Delete List
*ListApi* | [**getAllLists**](docs/ListApi.md#getAllLists) | **GET** /list | Get All Lists
*ListApi* | [**getListById**](docs/ListApi.md#getListById) | **GET** /list/{listId} | Get List
*ListApi* | [**updateList**](docs/ListApi.md#updateList) | **PUT** /list/{listId} | Update List
*ReportsApi* | [**getCampaignReport**](docs/ReportsApi.md#getCampaignReport) | **GET** /report/campaign/{campaignId} | Get CampaignReport Data
*SenderApi* | [**createSender**](docs/SenderApi.md#createSender) | **POST** /sender | Create Sender
*SenderApi* | [**getAllSenders**](docs/SenderApi.md#getAllSenders) | **GET** /sender | Get All Senders
*TagsApi* | [**createTag**](docs/TagsApi.md#createTag) | **POST** /tag | Create a Tag
*TagsApi* | [**deleteTag**](docs/TagsApi.md#deleteTag) | **DELETE** /tag/{tagId} | Delete a Tag
*TagsApi* | [**getAllTags**](docs/TagsApi.md#getAllTags) | **GET** /tag | Get All Tags
*TagsApi* | [**getTagById**](docs/TagsApi.md#getTagById) | **GET** /tag/{tagId} | Get a Tag by ID
*TagsApi* | [**updateTag**](docs/TagsApi.md#updateTag) | **PUT** /tag/{tagId} | Update a Tag


## Documentation for Models

 - [Campaign](docs/Campaign.md)
 - [CampaignDashboardData](docs/CampaignDashboardData.md)
 - [CampaignRequest](docs/CampaignRequest.md)
 - [Contact](docs/Contact.md)
 - [ContactRequest](docs/ContactRequest.md)
 - [CreateResponse](docs/CreateResponse.md)
 - [CustomEventRequest](docs/CustomEventRequest.md)
 - [DashboardStats](docs/DashboardStats.md)
 - [DeleteCampaign200Response](docs/DeleteCampaign200Response.md)
 - [DeleteRequest](docs/DeleteRequest.md)
 - [DeleteResponse](docs/DeleteResponse.md)
 - [EventResponse](docs/EventResponse.md)
 - [IdentifyRequest](docs/IdentifyRequest.md)
 - [IdentifyResponse](docs/IdentifyResponse.md)
 - [LastSentCampaignStat](docs/LastSentCampaignStat.md)
 - [ListModel](docs/ListModel.md)
 - [ListRequest](docs/ListRequest.md)
 - [OperationResponse](docs/OperationResponse.md)
 - [ReportData](docs/ReportData.md)
 - [RevenueEventRequest](docs/RevenueEventRequest.md)
 - [Sender](docs/Sender.md)
 - [SenderRequest](docs/SenderRequest.md)
 - [SenderResponse](docs/SenderResponse.md)
 - [Tag](docs/Tag.md)
 - [TagRequest](docs/TagRequest.md)
 - [TrackRequest](docs/TrackRequest.md)
 - [TrackResponse](docs/TrackResponse.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="apiKeyAuth"></a>
### apiKeyAuth

- **Type**: API key
- **API key parameter name**: X-Team-ApiKey
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@sendx.io

