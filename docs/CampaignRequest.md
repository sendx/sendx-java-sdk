

# CampaignRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** | The name of the campaign. |  [optional] |
|**htmlCode** | **String** | The HTML code of the campaign. |  [optional] |
|**subject** | **String** | The subject of the campaign. |  [optional] |
|**sender** | **String** | Sender unique identifier. |  [optional] |
|**previewText** | **String** | The preview text shown in email clients. |  [optional] |
|**scheduleType** | [**ScheduleTypeEnum**](#ScheduleTypeEnum) | The type of scheduling for the campaign &lt;br&gt; 0: Send Now &lt;br&gt; 1: Send Later  |  [optional] |
|**scheduleCondition** | **String** | The condition for scheduling the campaign. |  [optional] |
|**timeCondition** | **String** | The specific time to send the campaign. |  [optional] |
|**timezone** | **String** | The timezone for the campaign scheduling. |  [optional] |
|**preferredTimezone** | **String** | Preferred timezone for scheduling. |  [optional] |
|**preferredTimeCondition** | **String** | Specific time preference for sending the campaign. |  [optional] |
|**sendInContactsTimezone** | **Boolean** | Whether to send emails in each contact&#39;s timezone. |  [optional] |
|**smartSend** | **Boolean** | Whether to enable smart send features (e.g., optimizing send time). |  [optional] |
|**includedSegments** | **List&lt;String&gt;** | List of segment IDs to include. |  [optional] |
|**includedLists** | **List&lt;String&gt;** | List of list IDs to include. |  [optional] |
|**includedTags** | **List&lt;String&gt;** | List of tag IDs to include. |  [optional] |
|**excludedSegments** | **List&lt;String&gt;** | List of segment IDs to exclude. |  [optional] |
|**excludedLists** | **List&lt;String&gt;** | List of list IDs to exclude. |  [optional] |
|**excludedTags** | **List&lt;String&gt;** | List of tag IDs to exclude. |  [optional] |



## Enum: ScheduleTypeEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |



