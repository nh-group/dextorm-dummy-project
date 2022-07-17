package fr.pantheonsorbonne.cri;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {
    ContactService service = new ContactService();

    @Test
    public void shouldFindContactWithNumber()
    {
        Contact contact = service.findContactWithPhoneNumber("0655526");
        assertTrue(contact != null );
    }
}