

# ListModel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Encrypted ID of the list |  [optional] |
|**name** | **String** | Name of the list |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the list representing opt-in methods (1: Single Opt-In, 2: Double Opt-In) |  [optional] |
|**sendThankYouMail** | **Boolean** | Indicates if a thank-you email should be sent |  [optional] |
|**thankYouFromName** | **String** | Name displayed as the sender in the thank-you email |  [optional] |
|**thankYouFromEmail** | **String** | Email address from which the thank-you email is sent |  [optional] |
|**thankYouMailSubject** | **String** | Subject line of the thank-you email |  [optional] |
|**thankYouMailMessage** | **String** | Plain text message body of the thank-you email |  [optional] |
|**thankYouSender** | **String** | Details of the sender of the thank-you email |  [optional] |
|**confirmFromName** | **String** | Name displayed as the sender in the confirmation email |  [optional] |
|**confirmFromEmail** | **String** | Email address from which the confirmation email is sent |  [optional] |
|**confirmMailSubject** | **String** | Subject line of the confirmation email |  [optional] |
|**confirmMailMessage** | **String** | Plain text message body of the confirmation email |  [optional] |
|**confirmSuccessPage** | **String** | URL of the success page after confirmation |  [optional] |
|**created** | **OffsetDateTime** | Date and time when the list was created |  [optional] |
|**updated** | **OffsetDateTime** | Date and time when the list was last updated |  [optional] |
|**confirmSender** | **String** | Details of the sender of the confirmation email |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



