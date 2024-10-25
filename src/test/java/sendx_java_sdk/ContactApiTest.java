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

import sendx_java_sdk.ApiException;
import sendx_java_sdk.Contact;
import sendx_java_sdk.ContactRequest;
import sendx_java_sdk.ObjectResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ContactApi
 */
@Disabled
public class ContactApiTest {

    private final ContactApi api = new ContactApi();

    /**
     * Create a contact
     *
     * Create Contact with given data
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createContactTest() throws ApiException {
        ContactRequest contactRequest = null;
        ObjectResponse response = api.createContact(contactRequest);
        // TODO: test validations
    }

    /**
     * Delete Contact
     *
     * Deletes Contact
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteContactTest() throws ApiException {
        String identifier = null;
        ObjectResponse response = api.deleteContact(identifier);
        // TODO: test validations
    }

    /**
     * Get All Contacts
     *
     * Find all contacts with optional filters
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllContactsTest() throws ApiException {
        Integer offset = null;
        Integer limit = null;
        String contactType = null;
        String search = null;
        List<Contact> response = api.getAllContacts(offset, limit, contactType, search);
        // TODO: test validations
    }

    /**
     * Get Contact by Identifier
     *
     * Retrieve a specific contact by its identifier.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getContactByIdTest() throws ApiException {
        String identifier = null;
        Contact response = api.getContactById(identifier);
        // TODO: test validations
    }

    /**
     * Unsubscribe Contact
     *
     * Unsubscribe a globally existing contact
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void unsubscribeContactTest() throws ApiException {
        String identifier = null;
        ObjectResponse response = api.unsubscribeContact(identifier);
        // TODO: test validations
    }

    /**
     * Update Contact
     *
     * Update Contact with given data
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateContactTest() throws ApiException {
        String identifier = null;
        ContactRequest contactRequest = null;
        Contact response = api.updateContact(identifier, contactRequest);
        // TODO: test validations
    }

}
