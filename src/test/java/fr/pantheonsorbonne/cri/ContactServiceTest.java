package fr.pantheonsorbonne.cri;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
    ContactService service = new ContactService();

    @Test
    public void shouldFindContactWithNumber()
    {
        //number is not full
        Contact contact = service.findContactWithPhoneNumber("0655526");
        assertTrue(contact == null );
        //full number
        contact = service.findContactWithPhoneNumber("0606060606");
        assertTrue(contact != null );
        //null number
        contact = service.findContactWithPhoneNumber(null);
        assertTrue(contact == null );
    }
}