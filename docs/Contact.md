

# Contact


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Identifier for the contact. |  [optional] |
|**firstName** | **String** | The first name of the contact. |  [optional] |
|**lastName** | **String** | The last name of the contact. |  [optional] |
|**email** | **String** | The email address of the contact. |  [optional] |
|**company** | **String** | The company of the contact. |  [optional] |
|**customFields** | **Map&lt;String, String&gt;** | Custom fields and their values |  [optional] |
|**unsubscribed** | **Boolean** | Indicates if the contact has unsubscribed from emails. |  [optional] |
|**bounced** | **Boolean** | Indicates if the contact&#39;s email has bounced. |  [optional] |
|**spam** | **Boolean** | Indicates if the contact marked the email as spam. |  [optional] |
|**created** | **OffsetDateTime** | The date and time when the contact was created. |  [optional] |
|**updated** | **OffsetDateTime** | The date and time when the contact was last updated. |  [optional] |
|**blocked** | **Boolean** | Indicates if the contact is blocked from receiving emails. |  [optional] |
|**dropped** | **Boolean** | Indicates if emails to this contact were dropped. |  [optional] |
|**LTV** | **Integer** | Lifetime value (LTV) of the contact in currency units. |  [optional] |
|**contactSource** | [**ContactSourceEnum**](#ContactSourceEnum) | The source from which the contact was added. Possible values:  |  [optional] |
|**lastTrackedIp** | **String** | The last known IP address tracked for the contact. |  [optional] |
|**lists** | **List&lt;String&gt;** | A list of &#x60;lists&#x60; ids the contact is subscribed to. |  [optional] |
|**tags** | **List&lt;String&gt;** | &#x60;Tag&#x60; ids associated with the contact for segmentation or categorization. |  [optional] |



## Enum: ContactSourceEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |
| NUMBER_7 | 7 |
| NUMBER_8 | 8 |
| NUMBER_9 | 9 |
| NUMBER_10 | 10 |
| NUMBER_11 | 11 |
| NUMBER_12 | 12 |
| NUMBER_13 | 13 |
| NUMBER_14 | 14 |
| NUMBER_15 | 15 |
| NUMBER_16 | 16 |
| NUMBER_17 | 17 |
| NUMBER_18 | 18 |
| NUMBER_19 | 19 |



