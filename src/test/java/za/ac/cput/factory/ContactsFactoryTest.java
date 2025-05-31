package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Contacts;

import static org.junit.jupiter.api.Assertions.*;

class ContactsFactoryTest {
        private static Contacts c1 = ContactsFactory.createContacts(123456789, "4 Lyndoc Crescent");

        @Test
        public void testCreateContacts() {
            assertNotNull(c1);

            System.out.println(c1.toString());
        }
}