

# Campaign


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | Encrypted ID of the campaign |  [optional] |
|**name** | **String** | Name of the campaign |  [optional] |
|**trackReply** | **Boolean** | Indicates if replies to the campaign should be tracked |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Campaign status: 0 (Draft), 1 (Scheduled), 2 (Sending), 3 (Sent), 4 (Quarantined) |  [optional] |
|**scheduleType** | [**ScheduleTypeEnum**](#ScheduleTypeEnum) | Schedule type: 0 (Schedule later), 1 (Send Now), 2 (Trigger via automation), 3 (Recurring) |  [optional] |
|**scheduleCondition** | **String** | Condition for scheduling the campaign |  [optional] |
|**timeCondition** | **String** | Time-related condition for the campaign |  [optional] |
|**timezone** | **String** | Timezone for the scheduled send |  [optional] |
|**preferredTimeCondition** | **String** | Preferred time condition for the campaign |  [optional] |
|**preferredTimezone** | **String** | Preferred timezone for sending the campaign |  [optional] |
|**strategy** | **String** | Strategy for the campaign |  [optional] |
|**sendInContactsTimezone** | **Boolean** | Indicates if the campaign should be sent in the recipient&#39;s timezone |  [optional] |
|**smartSend** | **Boolean** | Indicates if smart sending should be used |  [optional] |
|**isArchived** | **Boolean** | Indicates if the campaign is archived |  [optional] |
|**sender** | **String** | Information about the sender of the campaign |  [optional] |
|**campaignScreenshotUrl** | **String** | URL of the campaign&#39;s screenshot |  [optional] |
|**includedSegments** | **List&lt;String&gt;** | Segments to be included in the campaign |  [optional] |
|**includedLists** | **List&lt;String&gt;** | Lists to be included in the campaign |  [optional] |
|**includedTags** | **List&lt;String&gt;** | Tags to be included in the campaign |  [optional] |
|**excludedSegments** | **List&lt;String&gt;** | Segments to be excluded from the campaign |  [optional] |
|**excludedLists** | **List&lt;String&gt;** | Lists to be excluded from the campaign |  [optional] |
|**excludedTags** | **List&lt;String&gt;** | Tags to be excluded from the campaign |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |



## Enum: ScheduleTypeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |



