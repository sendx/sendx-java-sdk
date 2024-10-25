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
 * ListRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-25T16:47:38.261598+05:30[Asia/Kolkata]", comments = "Generator version: 7.8.0")
public class ListRequest {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  /**
   * Type of the list representing opt-in methods &lt;br&gt; 0: Single opt-in list &lt;br&gt; 1: Double opt-in list 
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NUMBER_0(0),
    
    NUMBER_1(1);

    private Integer value;

    TypeEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(Integer value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return TypeEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      Integer value = jsonElement.getAsInt();
      TypeEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type;

  public static final String SERIALIZED_NAME_SEND_THANK_YOU_MAIL = "sendThankYouMail";
  @SerializedName(SERIALIZED_NAME_SEND_THANK_YOU_MAIL)
  private Boolean sendThankYouMail;

  public static final String SERIALIZED_NAME_THANK_YOU_FROM_NAME = "thankYouFromName";
  @SerializedName(SERIALIZED_NAME_THANK_YOU_FROM_NAME)
  private String thankYouFromName;

  public static final String SERIALIZED_NAME_THANK_YOU_FROM_EMAIL = "thankYouFromEmail";
  @SerializedName(SERIALIZED_NAME_THANK_YOU_FROM_EMAIL)
  private String thankYouFromEmail;

  public static final String SERIALIZED_NAME_THANK_YOU_MAIL_SUBJECT = "thankYouMailSubject";
  @SerializedName(SERIALIZED_NAME_THANK_YOU_MAIL_SUBJECT)
  private String thankYouMailSubject;

  public static final String SERIALIZED_NAME_THANK_YOU_MAIL_MESSAGE = "thankYouMailMessage";
  @SerializedName(SERIALIZED_NAME_THANK_YOU_MAIL_MESSAGE)
  private String thankYouMailMessage;

  public static final String SERIALIZED_NAME_THANK_YOU_SENDER = "thankYouSender";
  @SerializedName(SERIALIZED_NAME_THANK_YOU_SENDER)
  private String thankYouSender;

  public static final String SERIALIZED_NAME_CONFIRM_FROM_NAME = "confirmFromName";
  @SerializedName(SERIALIZED_NAME_CONFIRM_FROM_NAME)
  private String confirmFromName;

  public static final String SERIALIZED_NAME_CONFIRM_FROM_EMAIL = "confirmFromEmail";
  @SerializedName(SERIALIZED_NAME_CONFIRM_FROM_EMAIL)
  private String confirmFromEmail;

  public static final String SERIALIZED_NAME_CONFIRM_MAIL_SUBJECT = "confirmMailSubject";
  @SerializedName(SERIALIZED_NAME_CONFIRM_MAIL_SUBJECT)
  private String confirmMailSubject;

  public static final String SERIALIZED_NAME_CONFIRM_MAIL_MESSAGE = "confirmMailMessage";
  @SerializedName(SERIALIZED_NAME_CONFIRM_MAIL_MESSAGE)
  private String confirmMailMessage;

  public static final String SERIALIZED_NAME_CONFIRM_SUCCESS_PAGE = "confirmSuccessPage";
  @SerializedName(SERIALIZED_NAME_CONFIRM_SUCCESS_PAGE)
  private String confirmSuccessPage;

  public static final String SERIALIZED_NAME_CONFIRM_SENDER = "confirmSender";
  @SerializedName(SERIALIZED_NAME_CONFIRM_SENDER)
  private String confirmSender;

  public ListRequest() {
  }

  public ListRequest name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the list
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public ListRequest type(TypeEnum type) {
    this.type = type;
    return this;
  }

  /**
   * Type of the list representing opt-in methods &lt;br&gt; 0: Single opt-in list &lt;br&gt; 1: Double opt-in list 
   * @return type
   */
  @javax.annotation.Nullable
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }


  public ListRequest sendThankYouMail(Boolean sendThankYouMail) {
    this.sendThankYouMail = sendThankYouMail;
    return this;
  }

  /**
   * Indicates if a thank-you email should be sent
   * @return sendThankYouMail
   */
  @javax.annotation.Nullable
  public Boolean getSendThankYouMail() {
    return sendThankYouMail;
  }

  public void setSendThankYouMail(Boolean sendThankYouMail) {
    this.sendThankYouMail = sendThankYouMail;
  }


  public ListRequest thankYouFromName(String thankYouFromName) {
    this.thankYouFromName = thankYouFromName;
    return this;
  }

  /**
   * Name displayed as the sender in the thank-you email
   * @return thankYouFromName
   */
  @javax.annotation.Nullable
  public String getThankYouFromName() {
    return thankYouFromName;
  }

  public void setThankYouFromName(String thankYouFromName) {
    this.thankYouFromName = thankYouFromName;
  }


  public ListRequest thankYouFromEmail(String thankYouFromEmail) {
    this.thankYouFromEmail = thankYouFromEmail;
    return this;
  }

  /**
   * Email address from which the thank-you email is sent
   * @return thankYouFromEmail
   */
  @javax.annotation.Nullable
  public String getThankYouFromEmail() {
    return thankYouFromEmail;
  }

  public void setThankYouFromEmail(String thankYouFromEmail) {
    this.thankYouFromEmail = thankYouFromEmail;
  }


  public ListRequest thankYouMailSubject(String thankYouMailSubject) {
    this.thankYouMailSubject = thankYouMailSubject;
    return this;
  }

  /**
   * Subject line of the thank-you email
   * @return thankYouMailSubject
   */
  @javax.annotation.Nullable
  public String getThankYouMailSubject() {
    return thankYouMailSubject;
  }

  public void setThankYouMailSubject(String thankYouMailSubject) {
    this.thankYouMailSubject = thankYouMailSubject;
  }


  public ListRequest thankYouMailMessage(String thankYouMailMessage) {
    this.thankYouMailMessage = thankYouMailMessage;
    return this;
  }

  /**
   * Plain text message body of the thank-you email
   * @return thankYouMailMessage
   */
  @javax.annotation.Nullable
  public String getThankYouMailMessage() {
    return thankYouMailMessage;
  }

  public void setThankYouMailMessage(String thankYouMailMessage) {
    this.thankYouMailMessage = thankYouMailMessage;
  }


  public ListRequest thankYouSender(String thankYouSender) {
    this.thankYouSender = thankYouSender;
    return this;
  }

  /**
   * Sender ID for the thank-you email
   * @return thankYouSender
   */
  @javax.annotation.Nullable
  public String getThankYouSender() {
    return thankYouSender;
  }

  public void setThankYouSender(String thankYouSender) {
    this.thankYouSender = thankYouSender;
  }


  public ListRequest confirmFromName(String confirmFromName) {
    this.confirmFromName = confirmFromName;
    return this;
  }

  /**
   * Name displayed as the sender in the confirmation email
   * @return confirmFromName
   */
  @javax.annotation.Nullable
  public String getConfirmFromName() {
    return confirmFromName;
  }

  public void setConfirmFromName(String confirmFromName) {
    this.confirmFromName = confirmFromName;
  }


  public ListRequest confirmFromEmail(String confirmFromEmail) {
    this.confirmFromEmail = confirmFromEmail;
    return this;
  }

  /**
   * Email address from which the confirmation email is sent
   * @return confirmFromEmail
   */
  @javax.annotation.Nullable
  public String getConfirmFromEmail() {
    return confirmFromEmail;
  }

  public void setConfirmFromEmail(String confirmFromEmail) {
    this.confirmFromEmail = confirmFromEmail;
  }


  public ListRequest confirmMailSubject(String confirmMailSubject) {
    this.confirmMailSubject = confirmMailSubject;
    return this;
  }

  /**
   * Subject line of the confirmation email
   * @return confirmMailSubject
   */
  @javax.annotation.Nullable
  public String getConfirmMailSubject() {
    return confirmMailSubject;
  }

  public void setConfirmMailSubject(String confirmMailSubject) {
    this.confirmMailSubject = confirmMailSubject;
  }


  public ListRequest confirmMailMessage(String confirmMailMessage) {
    this.confirmMailMessage = confirmMailMessage;
    return this;
  }

  /**
   * Plain text message body of the confirmation email
   * @return confirmMailMessage
   */
  @javax.annotation.Nullable
  public String getConfirmMailMessage() {
    return confirmMailMessage;
  }

  public void setConfirmMailMessage(String confirmMailMessage) {
    this.confirmMailMessage = confirmMailMessage;
  }


  public ListRequest confirmSuccessPage(String confirmSuccessPage) {
    this.confirmSuccessPage = confirmSuccessPage;
    return this;
  }

  /**
   * URL of the success page after confirmation
   * @return confirmSuccessPage
   */
  @javax.annotation.Nullable
  public String getConfirmSuccessPage() {
    return confirmSuccessPage;
  }

  public void setConfirmSuccessPage(String confirmSuccessPage) {
    this.confirmSuccessPage = confirmSuccessPage;
  }


  public ListRequest confirmSender(String confirmSender) {
    this.confirmSender = confirmSender;
    return this;
  }

  /**
   * Sender ID for the confirmation email
   * @return confirmSender
   */
  @javax.annotation.Nullable
  public String getConfirmSender() {
    return confirmSender;
  }

  public void setConfirmSender(String confirmSender) {
    this.confirmSender = confirmSender;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListRequest listRequest = (ListRequest) o;
    return Objects.equals(this.name, listRequest.name) &&
        Objects.equals(this.type, listRequest.type) &&
        Objects.equals(this.sendThankYouMail, listRequest.sendThankYouMail) &&
        Objects.equals(this.thankYouFromName, listRequest.thankYouFromName) &&
        Objects.equals(this.thankYouFromEmail, listRequest.thankYouFromEmail) &&
        Objects.equals(this.thankYouMailSubject, listRequest.thankYouMailSubject) &&
        Objects.equals(this.thankYouMailMessage, listRequest.thankYouMailMessage) &&
        Objects.equals(this.thankYouSender, listRequest.thankYouSender) &&
        Objects.equals(this.confirmFromName, listRequest.confirmFromName) &&
        Objects.equals(this.confirmFromEmail, listRequest.confirmFromEmail) &&
        Objects.equals(this.confirmMailSubject, listRequest.confirmMailSubject) &&
        Objects.equals(this.confirmMailMessage, listRequest.confirmMailMessage) &&
        Objects.equals(this.confirmSuccessPage, listRequest.confirmSuccessPage) &&
        Objects.equals(this.confirmSender, listRequest.confirmSender);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, sendThankYouMail, thankYouFromName, thankYouFromEmail, thankYouMailSubject, thankYouMailMessage, thankYouSender, confirmFromName, confirmFromEmail, confirmMailSubject, confirmMailMessage, confirmSuccessPage, confirmSender);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListRequest {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sendThankYouMail: ").append(toIndentedString(sendThankYouMail)).append("\n");
    sb.append("    thankYouFromName: ").append(toIndentedString(thankYouFromName)).append("\n");
    sb.append("    thankYouFromEmail: ").append(toIndentedString(thankYouFromEmail)).append("\n");
    sb.append("    thankYouMailSubject: ").append(toIndentedString(thankYouMailSubject)).append("\n");
    sb.append("    thankYouMailMessage: ").append(toIndentedString(thankYouMailMessage)).append("\n");
    sb.append("    thankYouSender: ").append(toIndentedString(thankYouSender)).append("\n");
    sb.append("    confirmFromName: ").append(toIndentedString(confirmFromName)).append("\n");
    sb.append("    confirmFromEmail: ").append(toIndentedString(confirmFromEmail)).append("\n");
    sb.append("    confirmMailSubject: ").append(toIndentedString(confirmMailSubject)).append("\n");
    sb.append("    confirmMailMessage: ").append(toIndentedString(confirmMailMessage)).append("\n");
    sb.append("    confirmSuccessPage: ").append(toIndentedString(confirmSuccessPage)).append("\n");
    sb.append("    confirmSender: ").append(toIndentedString(confirmSender)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("type");
    openapiFields.add("sendThankYouMail");
    openapiFields.add("thankYouFromName");
    openapiFields.add("thankYouFromEmail");
    openapiFields.add("thankYouMailSubject");
    openapiFields.add("thankYouMailMessage");
    openapiFields.add("thankYouSender");
    openapiFields.add("confirmFromName");
    openapiFields.add("confirmFromEmail");
    openapiFields.add("confirmMailSubject");
    openapiFields.add("confirmMailMessage");
    openapiFields.add("confirmSuccessPage");
    openapiFields.add("confirmSender");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListRequest
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListRequest is not found in the empty JSON string", ListRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListRequest` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("name") != null && !jsonObj.get("name").isJsonNull()) && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the optional field `type`
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonNull()) {
        TypeEnum.validateJsonElement(jsonObj.get("type"));
      }
      if ((jsonObj.get("thankYouFromName") != null && !jsonObj.get("thankYouFromName").isJsonNull()) && !jsonObj.get("thankYouFromName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thankYouFromName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thankYouFromName").toString()));
      }
      if ((jsonObj.get("thankYouFromEmail") != null && !jsonObj.get("thankYouFromEmail").isJsonNull()) && !jsonObj.get("thankYouFromEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thankYouFromEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thankYouFromEmail").toString()));
      }
      if ((jsonObj.get("thankYouMailSubject") != null && !jsonObj.get("thankYouMailSubject").isJsonNull()) && !jsonObj.get("thankYouMailSubject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thankYouMailSubject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thankYouMailSubject").toString()));
      }
      if ((jsonObj.get("thankYouMailMessage") != null && !jsonObj.get("thankYouMailMessage").isJsonNull()) && !jsonObj.get("thankYouMailMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thankYouMailMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thankYouMailMessage").toString()));
      }
      if ((jsonObj.get("thankYouSender") != null && !jsonObj.get("thankYouSender").isJsonNull()) && !jsonObj.get("thankYouSender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thankYouSender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thankYouSender").toString()));
      }
      if ((jsonObj.get("confirmFromName") != null && !jsonObj.get("confirmFromName").isJsonNull()) && !jsonObj.get("confirmFromName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `confirmFromName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("confirmFromName").toString()));
      }
      if ((jsonObj.get("confirmFromEmail") != null && !jsonObj.get("confirmFromEmail").isJsonNull()) && !jsonObj.get("confirmFromEmail").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `confirmFromEmail` to be a primitive type in the JSON string but got `%s`", jsonObj.get("confirmFromEmail").toString()));
      }
      if ((jsonObj.get("confirmMailSubject") != null && !jsonObj.get("confirmMailSubject").isJsonNull()) && !jsonObj.get("confirmMailSubject").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `confirmMailSubject` to be a primitive type in the JSON string but got `%s`", jsonObj.get("confirmMailSubject").toString()));
      }
      if ((jsonObj.get("confirmMailMessage") != null && !jsonObj.get("confirmMailMessage").isJsonNull()) && !jsonObj.get("confirmMailMessage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `confirmMailMessage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("confirmMailMessage").toString()));
      }
      if ((jsonObj.get("confirmSuccessPage") != null && !jsonObj.get("confirmSuccessPage").isJsonNull()) && !jsonObj.get("confirmSuccessPage").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `confirmSuccessPage` to be a primitive type in the JSON string but got `%s`", jsonObj.get("confirmSuccessPage").toString()));
      }
      if ((jsonObj.get("confirmSender") != null && !jsonObj.get("confirmSender").isJsonNull()) && !jsonObj.get("confirmSender").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `confirmSender` to be a primitive type in the JSON string but got `%s`", jsonObj.get("confirmSender").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<ListRequest>() {
           @Override
           public void write(JsonWriter out, ListRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListRequest read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListRequest given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListRequest
   * @throws IOException if the JSON string is invalid with respect to ListRequest
   */
  public static ListRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListRequest.class);
  }

  /**
   * Convert an instance of ListRequest to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

