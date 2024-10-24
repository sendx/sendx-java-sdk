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
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
 * Contact
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-10-24T14:08:56.611307+05:30[Asia/Kolkata]", comments = "Generator version: 7.8.0")
public class Contact {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_FIRST_NAME = "firstName";
  @SerializedName(SERIALIZED_NAME_FIRST_NAME)
  private String firstName;

  public static final String SERIALIZED_NAME_LAST_NAME = "lastName";
  @SerializedName(SERIALIZED_NAME_LAST_NAME)
  private String lastName;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_COMPANY = "company";
  @SerializedName(SERIALIZED_NAME_COMPANY)
  private String company;

  public static final String SERIALIZED_NAME_CUSTOM_FIELDS = "customFields";
  @SerializedName(SERIALIZED_NAME_CUSTOM_FIELDS)
  private Map<String, String> customFields = new HashMap<>();

  public static final String SERIALIZED_NAME_UNSUBSCRIBED = "unsubscribed";
  @SerializedName(SERIALIZED_NAME_UNSUBSCRIBED)
  private Boolean unsubscribed;

  public static final String SERIALIZED_NAME_BOUNCED = "bounced";
  @SerializedName(SERIALIZED_NAME_BOUNCED)
  private Boolean bounced;

  public static final String SERIALIZED_NAME_SPAM = "spam";
  @SerializedName(SERIALIZED_NAME_SPAM)
  private Boolean spam;

  public static final String SERIALIZED_NAME_CREATED = "created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_UPDATED = "updated";
  @SerializedName(SERIALIZED_NAME_UPDATED)
  private OffsetDateTime updated;

  public static final String SERIALIZED_NAME_BLOCKED = "blocked";
  @SerializedName(SERIALIZED_NAME_BLOCKED)
  private Boolean blocked;

  public static final String SERIALIZED_NAME_DROPPED = "dropped";
  @SerializedName(SERIALIZED_NAME_DROPPED)
  private Boolean dropped;

  public static final String SERIALIZED_NAME_L_T_V = "LTV";
  @SerializedName(SERIALIZED_NAME_L_T_V)
  private Integer LTV;

  /**
   * The source from which the contact was added. Possible values: 
   */
  @JsonAdapter(ContactSourceEnum.Adapter.class)
  public enum ContactSourceEnum {
    NUMBER_0(0),
    
    NUMBER_1(1),
    
    NUMBER_2(2),
    
    NUMBER_3(3),
    
    NUMBER_4(4),
    
    NUMBER_5(5),
    
    NUMBER_6(6),
    
    NUMBER_7(7),
    
    NUMBER_8(8),
    
    NUMBER_9(9),
    
    NUMBER_10(10),
    
    NUMBER_11(11),
    
    NUMBER_12(12),
    
    NUMBER_13(13),
    
    NUMBER_14(14),
    
    NUMBER_15(15),
    
    NUMBER_16(16),
    
    NUMBER_17(17),
    
    NUMBER_18(18),
    
    NUMBER_19(19);

    private Integer value;

    ContactSourceEnum(Integer value) {
      this.value = value;
    }

    public Integer getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ContactSourceEnum fromValue(Integer value) {
      for (ContactSourceEnum b : ContactSourceEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ContactSourceEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ContactSourceEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ContactSourceEnum read(final JsonReader jsonReader) throws IOException {
        Integer value =  jsonReader.nextInt();
        return ContactSourceEnum.fromValue(value);
      }
    }

    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      Integer value = jsonElement.getAsInt();
      ContactSourceEnum.fromValue(value);
    }
  }

  public static final String SERIALIZED_NAME_CONTACT_SOURCE = "contactSource";
  @SerializedName(SERIALIZED_NAME_CONTACT_SOURCE)
  private ContactSourceEnum contactSource;

  public static final String SERIALIZED_NAME_LAST_TRACKED_IP = "lastTrackedIp";
  @SerializedName(SERIALIZED_NAME_LAST_TRACKED_IP)
  private String lastTrackedIp;

  public static final String SERIALIZED_NAME_LISTS = "lists";
  @SerializedName(SERIALIZED_NAME_LISTS)
  private List<String> lists = new ArrayList<>();

  public static final String SERIALIZED_NAME_TAGS = "tags";
  @SerializedName(SERIALIZED_NAME_TAGS)
  private List<String> tags = new ArrayList<>();

  public Contact() {
  }

  public Contact id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identifier for the contact.
   * @return id
   */
  @javax.annotation.Nullable
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Contact firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  /**
   * The first name of the contact.
   * @return firstName
   */
  @javax.annotation.Nullable
  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }


  public Contact lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  /**
   * The last name of the contact.
   * @return lastName
   */
  @javax.annotation.Nullable
  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }


  public Contact email(String email) {
    this.email = email;
    return this;
  }

  /**
   * The email address of the contact.
   * @return email
   */
  @javax.annotation.Nullable
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }


  public Contact company(String company) {
    this.company = company;
    return this;
  }

  /**
   * The company of the contact.
   * @return company
   */
  @javax.annotation.Nullable
  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }


  public Contact customFields(Map<String, String> customFields) {
    this.customFields = customFields;
    return this;
  }

  public Contact putCustomFieldsItem(String key, String customFieldsItem) {
    if (this.customFields == null) {
      this.customFields = new HashMap<>();
    }
    this.customFields.put(key, customFieldsItem);
    return this;
  }

  /**
   * Custom fields and their values
   * @return customFields
   */
  @javax.annotation.Nullable
  public Map<String, String> getCustomFields() {
    return customFields;
  }

  public void setCustomFields(Map<String, String> customFields) {
    this.customFields = customFields;
  }


  public Contact unsubscribed(Boolean unsubscribed) {
    this.unsubscribed = unsubscribed;
    return this;
  }

  /**
   * Indicates if the contact has unsubscribed from emails.
   * @return unsubscribed
   */
  @javax.annotation.Nullable
  public Boolean getUnsubscribed() {
    return unsubscribed;
  }

  public void setUnsubscribed(Boolean unsubscribed) {
    this.unsubscribed = unsubscribed;
  }


  public Contact bounced(Boolean bounced) {
    this.bounced = bounced;
    return this;
  }

  /**
   * Indicates if the contact&#39;s email has bounced.
   * @return bounced
   */
  @javax.annotation.Nullable
  public Boolean getBounced() {
    return bounced;
  }

  public void setBounced(Boolean bounced) {
    this.bounced = bounced;
  }


  public Contact spam(Boolean spam) {
    this.spam = spam;
    return this;
  }

  /**
   * Indicates if the contact marked the email as spam.
   * @return spam
   */
  @javax.annotation.Nullable
  public Boolean getSpam() {
    return spam;
  }

  public void setSpam(Boolean spam) {
    this.spam = spam;
  }


  public Contact created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * The date and time when the contact was created.
   * @return created
   */
  @javax.annotation.Nullable
  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public Contact updated(OffsetDateTime updated) {
    this.updated = updated;
    return this;
  }

  /**
   * The date and time when the contact was last updated.
   * @return updated
   */
  @javax.annotation.Nullable
  public OffsetDateTime getUpdated() {
    return updated;
  }

  public void setUpdated(OffsetDateTime updated) {
    this.updated = updated;
  }


  public Contact blocked(Boolean blocked) {
    this.blocked = blocked;
    return this;
  }

  /**
   * Indicates if the contact is blocked from receiving emails.
   * @return blocked
   */
  @javax.annotation.Nullable
  public Boolean getBlocked() {
    return blocked;
  }

  public void setBlocked(Boolean blocked) {
    this.blocked = blocked;
  }


  public Contact dropped(Boolean dropped) {
    this.dropped = dropped;
    return this;
  }

  /**
   * Indicates if emails to this contact were dropped.
   * @return dropped
   */
  @javax.annotation.Nullable
  public Boolean getDropped() {
    return dropped;
  }

  public void setDropped(Boolean dropped) {
    this.dropped = dropped;
  }


  public Contact LTV(Integer LTV) {
    this.LTV = LTV;
    return this;
  }

  /**
   * Lifetime value (LTV) of the contact in currency units.
   * @return LTV
   */
  @javax.annotation.Nullable
  public Integer getLTV() {
    return LTV;
  }

  public void setLTV(Integer LTV) {
    this.LTV = LTV;
  }


  public Contact contactSource(ContactSourceEnum contactSource) {
    this.contactSource = contactSource;
    return this;
  }

  /**
   * The source from which the contact was added. Possible values: 
   * @return contactSource
   */
  @javax.annotation.Nullable
  public ContactSourceEnum getContactSource() {
    return contactSource;
  }

  public void setContactSource(ContactSourceEnum contactSource) {
    this.contactSource = contactSource;
  }


  public Contact lastTrackedIp(String lastTrackedIp) {
    this.lastTrackedIp = lastTrackedIp;
    return this;
  }

  /**
   * The last known IP address tracked for the contact.
   * @return lastTrackedIp
   */
  @javax.annotation.Nullable
  public String getLastTrackedIp() {
    return lastTrackedIp;
  }

  public void setLastTrackedIp(String lastTrackedIp) {
    this.lastTrackedIp = lastTrackedIp;
  }


  public Contact lists(List<String> lists) {
    this.lists = lists;
    return this;
  }

  public Contact addListsItem(String listsItem) {
    if (this.lists == null) {
      this.lists = new ArrayList<>();
    }
    this.lists.add(listsItem);
    return this;
  }

  /**
   * A list of &#x60;lists&#x60; ids the contact is subscribed to.
   * @return lists
   */
  @javax.annotation.Nullable
  public List<String> getLists() {
    return lists;
  }

  public void setLists(List<String> lists) {
    this.lists = lists;
  }


  public Contact tags(List<String> tags) {
    this.tags = tags;
    return this;
  }

  public Contact addTagsItem(String tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
   * &#x60;Tag&#x60; ids associated with the contact for segmentation or categorization.
   * @return tags
   */
  @javax.annotation.Nullable
  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Contact contact = (Contact) o;
    return Objects.equals(this.id, contact.id) &&
        Objects.equals(this.firstName, contact.firstName) &&
        Objects.equals(this.lastName, contact.lastName) &&
        Objects.equals(this.email, contact.email) &&
        Objects.equals(this.company, contact.company) &&
        Objects.equals(this.customFields, contact.customFields) &&
        Objects.equals(this.unsubscribed, contact.unsubscribed) &&
        Objects.equals(this.bounced, contact.bounced) &&
        Objects.equals(this.spam, contact.spam) &&
        Objects.equals(this.created, contact.created) &&
        Objects.equals(this.updated, contact.updated) &&
        Objects.equals(this.blocked, contact.blocked) &&
        Objects.equals(this.dropped, contact.dropped) &&
        Objects.equals(this.LTV, contact.LTV) &&
        Objects.equals(this.contactSource, contact.contactSource) &&
        Objects.equals(this.lastTrackedIp, contact.lastTrackedIp) &&
        Objects.equals(this.lists, contact.lists) &&
        Objects.equals(this.tags, contact.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, firstName, lastName, email, company, customFields, unsubscribed, bounced, spam, created, updated, blocked, dropped, LTV, contactSource, lastTrackedIp, lists, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    customFields: ").append(toIndentedString(customFields)).append("\n");
    sb.append("    unsubscribed: ").append(toIndentedString(unsubscribed)).append("\n");
    sb.append("    bounced: ").append(toIndentedString(bounced)).append("\n");
    sb.append("    spam: ").append(toIndentedString(spam)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    blocked: ").append(toIndentedString(blocked)).append("\n");
    sb.append("    dropped: ").append(toIndentedString(dropped)).append("\n");
    sb.append("    LTV: ").append(toIndentedString(LTV)).append("\n");
    sb.append("    contactSource: ").append(toIndentedString(contactSource)).append("\n");
    sb.append("    lastTrackedIp: ").append(toIndentedString(lastTrackedIp)).append("\n");
    sb.append("    lists: ").append(toIndentedString(lists)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("firstName");
    openapiFields.add("lastName");
    openapiFields.add("email");
    openapiFields.add("company");
    openapiFields.add("customFields");
    openapiFields.add("unsubscribed");
    openapiFields.add("bounced");
    openapiFields.add("spam");
    openapiFields.add("created");
    openapiFields.add("updated");
    openapiFields.add("blocked");
    openapiFields.add("dropped");
    openapiFields.add("LTV");
    openapiFields.add("contactSource");
    openapiFields.add("lastTrackedIp");
    openapiFields.add("lists");
    openapiFields.add("tags");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Contact
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Contact.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Contact is not found in the empty JSON string", Contact.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Contact.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Contact` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("firstName") != null && !jsonObj.get("firstName").isJsonNull()) && !jsonObj.get("firstName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `firstName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("firstName").toString()));
      }
      if ((jsonObj.get("lastName") != null && !jsonObj.get("lastName").isJsonNull()) && !jsonObj.get("lastName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastName").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("company") != null && !jsonObj.get("company").isJsonNull()) && !jsonObj.get("company").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `company` to be a primitive type in the JSON string but got `%s`", jsonObj.get("company").toString()));
      }
      // validate the optional field `contactSource`
      if (jsonObj.get("contactSource") != null && !jsonObj.get("contactSource").isJsonNull()) {
        ContactSourceEnum.validateJsonElement(jsonObj.get("contactSource"));
      }
      if ((jsonObj.get("lastTrackedIp") != null && !jsonObj.get("lastTrackedIp").isJsonNull()) && !jsonObj.get("lastTrackedIp").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `lastTrackedIp` to be a primitive type in the JSON string but got `%s`", jsonObj.get("lastTrackedIp").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("lists") != null && !jsonObj.get("lists").isJsonNull() && !jsonObj.get("lists").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `lists` to be an array in the JSON string but got `%s`", jsonObj.get("lists").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("tags") != null && !jsonObj.get("tags").isJsonNull() && !jsonObj.get("tags").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `tags` to be an array in the JSON string but got `%s`", jsonObj.get("tags").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Contact.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Contact' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Contact> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Contact.class));

       return (TypeAdapter<T>) new TypeAdapter<Contact>() {
           @Override
           public void write(JsonWriter out, Contact value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Contact read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Contact given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Contact
   * @throws IOException if the JSON string is invalid with respect to Contact
   */
  public static Contact fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Contact.class);
  }

  /**
   * Convert an instance of Contact to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

