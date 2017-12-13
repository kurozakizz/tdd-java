package demo.service;

import demo.Application;
import demo.domain.Contact;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class ContactServiceIntegrationTest {
    @Autowired
    private ContactService contactService;
    
    @Before
    public void tearDown() { contactService.deleteAllContacts(); }
    
    @Test
    public void saves_new_contact() {
        Contact newContact = new Contact("Somkiat", "SP", "Developer", "aaa@aaa.com", "082-164-4364");
        Contact savedContact = contactService.saveContact(newContact);
        Contact actualContact = contactService.load(savedContact.getId());
        
        assertEquals(newContact, actualContact);
    }
}
