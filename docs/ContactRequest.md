

# ContactRequest

Schema for the contact request payload. Used for creating or updating a contact.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**email** | **String** | The email address of the contact. Must be a valid email. |  [optional] |
|**firstName** | **String** | The first name of the contact. |  [optional] |
|**lastName** | **String** | The last name of the contact. |  [optional] |
|**company** | **String** | The company where the contact works. |  [optional] |
|**lastTrackedIp** | **String** | The last known IP address of the contact. |  [optional] |
|**customFields** | **Map&lt;String, String&gt;** | Custom fields specific to the contact, which may vary by account. |  [optional] |
|**lists** | **List&lt;String&gt;** | A list of &#x60;lists&#x60; ids the contact is subscribed to. |  [optional] |
|**tags** | **List&lt;String&gt;** | Tag ids associated with the contact for segmentation or categorization. |  [optional] |



