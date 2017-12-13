package demo.service;

import demo.domain.Contact;
import demo.repository.ContactRepository;
import static java.util.Arrays.asList;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ContactServiceTest {

    @Mock
    ContactRepository contactRepository;
    
    @InjectMocks
    ContactService contactService;
    
    @Test
    public void success_with_save_contact() {
        Contact contact = new Contact("Somkiat", "SP", null, null, null);
        contactService.saveContact(contact);
        verify(contactRepository).save(contact);
    }
    
    @Test
    public void success_with_save_new_contact_and_have_id() {
        Contact newContact = new Contact("Somkiat", "SP", null, null, null);
        
        contactService.saveContact(newContact);
        
        ArgumentCaptor<Contact> argument = ArgumentCaptor.forClass(Contact.class);
        verify(contactRepository).save(argument.capture());
        assertNotNull(argument.getValue().getId());
    }
    
    @Test
    public void finds_contacts_lowercase() throws Exception {
        Contact contact = new Contact("Somkiat", "SP", null, null, null);
        when(contactRepository.searchContacts("som")).thenReturn(asList(contact));
        List<Contact> contacts = contactService.searchContacts("som");
        //assertThat(contacts).contains(contact);
        assertEquals(contacts.get(0), contact);
    }
    
}
