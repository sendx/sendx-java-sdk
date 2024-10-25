/*
 * SendX REST API
 * # Introduction SendX is an email marketing product. It helps you convert website visitors to customers, send them promotional emails, engage with them using drip sequences and craft custom journeys using powerful but simple automations. The SendX API is organized around REST. Our API has predictable resource-oriented URLs, accepts form-encoded request bodies, returns JSON-encoded responses, and uses standard HTTP response codes, authentication, and verbs. The SendX Rest API doesn’t support bulk updates. You can work on only one object per request. <br> 
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@sendx.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sendx_java_sdk;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import sendx_java_sdk.JSON;

/**
 * Contains the report data for a given campaign
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T16:47:38.261598+05:30[Asia/Kolkata]", comments = "Generator version: 7.8.0")
public class ReportData {
  public static final String SERIALIZED_NAME_CAMPAIGN_ID = "campaignId";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN_ID)
  private String campaignId;

  public static final String SERIALIZED_NAME_LINK_STATS = "linkStats";
  @SerializedName(SERIALIZED_NAME_LINK_STATS)
  private Map<String, Integer> linkStats = new HashMap<>();

  public static final String SERIALIZED_NAME_CLICKED_CONTACT_COUNT = "clickedContactCount";
  @SerializedName(SERIALIZED_NAME_CLICKED_CONTACT_COUNT)
  private Integer clickedContactCount;

  public static final String SERIALIZED_NAME_OPENED_CONTACT_COUNT = "openedContactCount";
  @SerializedName(SERIALIZED_NAME_OPENED_CONTACT_COUNT)
  private Integer openedContactCount;

  public static final String SERIALIZED_NAME_REPLIED_CONTACT_COUNT = "repliedContactCount";
  @SerializedName(SERIALIZED_NAME_REPLIED_CONTACT_COUNT)
  private Integer repliedContactCount;

  public static final String SERIALIZED_NAME_CLICKED_UNIQUE_CONTACT_COUNT = "clickedUniqueContactCount";
  @SerializedName(SERIALIZED_NAME_CLICKED_UNIQUE_CONTACT_COUNT)
  private Integer clickedUniqueContactCount;

  public static final String SERIALIZED_NAME_OPENED_UNIQUE_CONTACT_COUNT = "openedUniqueContactCount";
  @SerializedName(SERIALIZED_NAME_OPENED_UNIQUE_CONTACT_COUNT)
  private Integer openedUniqueContactCount;

  public static final String SERIALIZED_NAME_REPLIED_UNIQUE_CONTACT_COUNT = "repliedUniqueContactCount";
  @SerializedName(SERIALIZED_NAME_REPLIED_UNIQUE_CONTACT_COUNT)
  private Integer repliedUniqueContactCount;

  public static final String SERIALIZED_NAME_SENT_CONTACT_COUNT = "sentContactCount";
  @SerializedName(SERIALIZED_NAME_SENT_CONTACT_COUNT)
  private Integer sentContactCount;

  public static final String SERIALIZED_NAME_UNSUBSCRIBE_CONTACT_COUNT = "unsubscribeContactCount";
  @SerializedName(SERIALIZED_NAME_UNSUBSCRIBE_CONTACT_COUNT)
  private Integer unsubscribeContactCount;

  public static final String SERIALIZED_NAME_BOUNCE_CONTACT_COUNT = "bounceContactCount";
  @SerializedName(SERIALIZED_NAME_BOUNCE_CONTACT_COUNT)
  private Integer bounceContactCount;

  public static final String SERIALIZED_NAME_SPAM_CONTACT_COUNT = "spamContactCount";
  @SerializedName(SERIALIZED_NAME_SPAM_CONTACT_COUNT)
  private Integer spamContactCount;

  public static final String SERIALIZED_NAME_EMAIL_REVENUE = "emailRevenue";
  @SerializedName(SERIALIZED_NAME_EMAIL_REVENUE)
  private String emailRevenue;

  public static final String SERIALIZED_NAME_REVENUE_PER_RECIPIENT = "revenuePerRecipient";
  @SerializedName(SERIALIZED_NAME_REVENUE_PER_RECIPIENT)
  private String revenuePerRecipient;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private String currency;

  public ReportData() {
  }

  public ReportData campaignId(String campaignId) {
    this.campaignId = campaignId;
    return this;
  }

  /**
   * The ID of the campaign
   * @return campaignId
   */
  @javax.annotation.Nullable
  public String getCampaignId() {
    return campaignId;
  }

  public void setCampaignId(String campaignId) {
    this.campaignId = campaignId;
  }


  public ReportData linkStats(Map<String, Integer> linkStats) {
    this.linkStats = linkStats;
    return this;
  }

  public ReportData putLinkStatsItem(String key, Integer linkStatsItem) {
    if (this.linkStats == null) {
      this.linkStats = new HashMap<>();
    }
    this.linkStats.put(key, linkStatsItem);
    return this;
  }

  /**
   * Statistics about the links clicked within the campaign
   * @return linkStats
   */
  @javax.annotation.Nullable
  public Map<String, Integer> getLinkStats() {
    return linkStats;
  }

  public void setLinkStats(Map<String, Integer> linkStats) {
    this.linkStats = linkStats;
  }


  public ReportData clickedContactCount(Integer clickedContactCount) {
    this.clickedContactCount = clickedContactCount;
    return this;
  }

  /**
   * The total number of contacts that clicked on any link
   * @return clickedContactCount
   */
  @javax.annotation.Nullable
  public Integer getClickedContactCount() {
    return clickedContactCount;
  }

  public void setClickedContactCount(Integer clickedContactCount) {
    this.clickedContactCount = clickedContactCount;
  }


  public ReportData openedContactCount(Integer openedContactCount) {
    this.openedContactCount = openedContactCount;
    return this;
  }

  /**
   * The total number of contacts that opened the campaign email
   * @return openedContactCount
   */
  @javax.annotation.Nullable
  public Integer getOpenedContactCount() {
    return openedContactCount;
  }

  public void setOpenedContactCount(Integer openedContactCount) {
    this.openedContactCount = openedContactCount;
  }


  public ReportData repliedContactCount(Integer repliedContactCount) {
    this.repliedContactCount = repliedContactCount;
    return this;
  }

  /**
   * The total number of contacts that replied to the campaign email
   * @return repliedContactCount
   */
  @javax.annotation.Nullable
  public Integer getRepliedContactCount() {
    return repliedContactCount;
  }

  public void setRepliedContactCount(Integer repliedContactCount) {
    this.repliedContactCount = repliedContactCount;
  }


  public ReportData clickedUniqueContactCount(Integer clickedUniqueContactCount) {
    this.clickedUniqueContactCount = clickedUniqueContactCount;
    return this;
  }

  /**
   * The unique number of contacts that clicked on any link
   * @return clickedUniqueContactCount
   */
  @javax.annotation.Nullable
  public Integer getClickedUniqueContactCount() {
    return clickedUniqueContactCount;
  }

  public void setClickedUniqueContactCount(Integer clickedUniqueContactCount) {
    this.clickedUniqueContactCount = clickedUniqueContactCount;
  }


  public ReportData openedUniqueContactCount(Integer openedUniqueContactCount) {
    this.openedUniqueContactCount = openedUniqueContactCount;
    return this;
  }

  /**
   * The unique number of contacts that opened the campaign email
   * @return openedUniqueContactCount
   */
  @javax.annotation.Nullable
  public Integer getOpenedUniqueContactCount() {
    return openedUniqueContactCount;
  }

  public void setOpenedUniqueContactCount(Integer openedUniqueContactCount) {
    this.openedUniqueContactCount = openedUniqueContactCount;
  }


  public ReportData repliedUniqueContactCount(Integer repliedUniqueContactCount) {
    this.repliedUniqueContactCount = repliedUniqueContactCount;
    return this;
  }

  /**
   * The unique number of contacts that replied to the campaign email
   * @return repliedUniqueContactCount
   */
  @javax.annotation.Nullable
  public Integer getRepliedUniqueContactCount() {
    return repliedUniqueContactCount;
  }

  public void setRepliedUniqueContactCount(Integer repliedUniqueContactCount) {
    this.repliedUniqueContactCount = repliedUniqueContactCount;
  }


  public ReportData sentContactCount(Integer sentContactCount) {
    this.sentContactCount = sentContactCount;
    return this;
  }

  /**
   * The total number of contacts the campaign was sent to
   * @return sentContactCount
   */
  @javax.annotation.Nullable
  public Integer getSentContactCount() {
    return sentContactCount;
  }

  public void setSentContactCount(Integer sentContactCount) {
    this.sentContactCount = sentContactCount;
  }


  public ReportData unsubscribeContactCount(Integer unsubscribeContactCount) {
    this.unsubscribeContactCount = unsubscribeContactCount;
    return this;
  }

  /**
   * The total number of contacts that unsubscribed
   * @return unsubscribeContactCount
   */
  @javax.annotation.Nullable
  public Integer getUnsubscribeContactCount() {
    return unsubscribeContactCount;
  }

  public void setUnsubscribeContactCount(Integer unsubscribeContactCount) {
    this.unsubscribeContactCount = unsubscribeContactCount;
  }


  public ReportData bounceContactCount(Integer bounceContactCount) {
    this.bounceContactCount = bounceContactCount;
    return this;
  }

  /**
   * The total number of bounced contacts
   * @return bounceContactCount
   */
  @javax.annotation.Nullable
  public Integer getBounceContactCount() {
    return bounceContactCount;
  }

  public void setBounceContactCount(Integer bounceContactCount) {
    this.bounceContactCount = bounceContactCount;
  }


  public ReportData spamContactCount(Integer spamContactCount) {
    this.spamContactCount = spamContactCount;
    return this;
  }

  /**
   * The total number of contacts that marked the email as spam
   * @return spamContactCount
   */
  @javax.annotation.Nullable
  public Integer getSpamContactCount() {
    return spamContactCount;
  }

  public void setSpamContactCount(Integer spamContactCount) {
    this.spamContactCount = spamContactCount;
  }


  public ReportData emailRevenue(String emailRevenue) {
    this.emailRevenue = emailRevenue;
    return this;
  }

  /**
   * The total revenue generated from the campaign email
   * @return emailRevenue
   */
  @javax.annotation.Nullable
  public String getEmailRevenue() {
    return emailRevenue;
  }

  public void setEmailRevenue(String emailRevenue) {
    this.emailRevenue = emailRevenue;
  }


  public ReportData revenuePerRecipient(String revenuePerRecipient) {
    this.revenuePerRecipient = revenuePerRecipient;
    return this;
  }

  /**
   * The average revenue generated per recipient
   * @return revenuePerRecipient
   */
  @javax.annotation.Nullable
  public String getRevenuePerRecipient() {
    return revenuePerRecipient;
  }

  public void setRevenuePerRecipient(String revenuePerRecipient) {
    this.revenuePerRecipient = revenuePerRecipient;
  }


  public ReportData currency(String currency) {
    this.currency = currency;
    return this;
  }

  /**
   * The currency in which the revenue is measured
   * @return currency
   */
  @javax.annotation.Nullable
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReportData reportData = (ReportData) o;
    return Objects.equals(this.campaignId, reportData.campaignId) &&
        Objects.equals(this.linkStats, reportData.linkStats) &&
        Objects.equals(this.clickedContactCount, reportData.clickedContactCount) &&
        Objects.equals(this.openedContactCount, reportData.openedContactCount) &&
        Objects.equals(this.repliedContactCount, reportData.repliedContactCount) &&
        Objects.equals(this.clickedUniqueContactCount, reportData.clickedUniqueContactCount) &&
        Objects.equals(this.openedUniqueContactCount, reportData.openedUniqueContactCount) &&
        Objects.equals(this.repliedUniqueContactCount, reportData.repliedUniqueContactCount) &&
        Objects.equals(this.sentContactCount, reportData.sentContactCount) &&
        Objects.equals(this.unsubscribeContactCount, reportData.unsubscribeContactCount) &&
        Objects.equals(this.bounceContactCount, reportData.bounceContactCount) &&
        Objects.equals(this.spamContactCount, reportData.spamContactCount) &&
        Objects.equals(this.emailRevenue, reportData.emailRevenue) &&
        Objects.equals(this.revenuePerRecipient, reportData.revenuePerRecipient) &&
        Objects.equals(this.currency, reportData.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaignId, linkStats, clickedContactCount, openedContactCount, repliedContactCount, clickedUniqueContactCount, openedUniqueContactCount, repliedUniqueContactCount, sentContactCount, unsubscribeContactCount, bounceContactCount, spamContactCount, emailRevenue, revenuePerRecipient, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReportData {\n");
    sb.append("    campaignId: ").append(toIndentedString(campaignId)).append("\n");
    sb.append("    linkStats: ").append(toIndentedString(linkStats)).append("\n");
    sb.append("    clickedContactCount: ").append(toIndentedString(clickedContactCount)).append("\n");
    sb.append("    openedContactCount: ").append(toIndentedString(openedContactCount)).append("\n");
    sb.append("    repliedContactCount: ").append(toIndentedString(repliedContactCount)).append("\n");
    sb.append("    clickedUniqueContactCount: ").append(toIndentedString(clickedUniqueContactCount)).append("\n");
    sb.append("    openedUniqueContactCount: ").append(toIndentedString(openedUniqueContactCount)).append("\n");
    sb.append("    repliedUniqueContactCount: ").append(toIndentedString(repliedUniqueContactCount)).append("\n");
    sb.append("    sentContactCount: ").append(toIndentedString(sentContactCount)).append("\n");
    sb.append("    unsubscribeContactCount: ").append(toIndentedString(unsubscribeContactCount)).append("\n");
    sb.append("    bounceContactCount: ").append(toIndentedString(bounceContactCount)).append("\n");
    sb.append("    spamContactCount: ").append(toIndentedString(spamContactCount)).append("\n");
    sb.append("    emailRevenue: ").append(toIndentedString(emailRevenue)).append("\n");
    sb.append("    revenuePerRecipient: ").append(toIndentedString(revenuePerRecipient)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("campaignId");
    openapiFields.add("linkStats");
    openapiFields.add("clickedContactCount");
    openapiFields.add("openedContactCount");
    openapiFields.add("repliedContactCount");
    openapiFields.add("clickedUniqueContactCount");
    openapiFields.add("openedUniqueContactCount");
    openapiFields.add("repliedUniqueContactCount");
    openapiFields.add("sentContactCount");
    openapiFields.add("unsubscribeContactCount");
    openapiFields.add("bounceContactCount");
    openapiFields.add("spamContactCount");
    openapiFields.add("emailRevenue");
    openapiFields.add("revenuePerRecipient");
    openapiFields.add("currency");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ReportData
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ReportData.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ReportData is not found in the empty JSON string", ReportData.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ReportData.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ReportData` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("campaignId") != null && !jsonObj.get("campaignId").isJsonNull()) && !jsonObj.get("campaignId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `campaignId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("campaignId").toString()));
      }
      if ((jsonObj.get("emailRevenue") != null && !jsonObj.get("emailRevenue").isJsonNull()) && !jsonObj.get("emailRevenue").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `emailRevenue` to be a primitive type in the JSON string but got `%s`", jsonObj.get("emailRevenue").toString()));
      }
      if ((jsonObj.get("revenuePerRecipient") != null && !jsonObj.get("revenuePerRecipient").isJsonNull()) && !jsonObj.get("revenuePerRecipient").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `revenuePerRecipient` to be a primitive type in the JSON string but got `%s`", jsonObj.get("revenuePerRecipient").toString()));
      }
      if ((jsonObj.get("currency") != null && !jsonObj.get("currency").isJsonNull()) && !jsonObj.get("currency").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `currency` to be a primitive type in the JSON string but got `%s`", jsonObj.get("currency").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ReportData.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ReportData' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ReportData> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ReportData.class));

       return (TypeAdapter<T>) new TypeAdapter<ReportData>() {
           @Override
           public void write(JsonWriter out, ReportData value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ReportData read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ReportData given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ReportData
   * @throws IOException if the JSON string is invalid with respect to ReportData
   */
  public static ReportData fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ReportData.class);
  }

  /**
   * Convert an instance of ReportData to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

