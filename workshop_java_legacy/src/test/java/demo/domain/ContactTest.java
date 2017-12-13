package demo.domain;

import org.junit.Test;
import static org.junit.Assert.*;

public class ContactTest {

    @Test
    public void success_to_update_contact() {
        Contact contact = new Contact("Somkiat", "SP", null, null, null);
        Contact updatedContact = new Contact("Update", "Update SP", null, null, null);
        contact.updateWith(updatedContact);
        assertEquals(updatedContact.getName(), contact.getName());
        assertEquals(updatedContact.getFullName(), contact.getFullName());
    }
    
    @Test
    public void cannot_to_update_contact() {
        Contact contact = new Contact("Somkiat", "SP", null, null, null);
        Contact updatedContact = new Contact(null, null, null, null, null);
        contact.updateWith(updatedContact);
        assertEquals(contact.getName(), "Somkiat");
        assertEquals(contact.getFullName(), "SP");
    }
    
    @Test
    public void success_to_update_contact_only_fullname() {
        Contact contact = new Contact("Somkiat", "SP", null, null, null);
        Contact updatedContact = new Contact(null, "Update SP", null, null, null);
        contact.updateWith(updatedContact);
        assertEquals(contact.getName(), "Somkiat");
        assertEquals(contact.getFullName(), updatedContact.getFullName());
    }
    
    @Test
    public void success_to_update_contact_only_name() {
        Contact contact = new Contact("Somkiat", "SP", null, null, null);
        Contact updatedContact = new Contact("Update", null, null, null, null);
        contact.updateWith(updatedContact);
        assertEquals(contact.getName(), updatedContact.getName());
        assertEquals(contact.getFullName(), "SP");
    }
    
}
