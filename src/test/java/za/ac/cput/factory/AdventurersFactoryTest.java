package za.ac.cput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Adventurers;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class AdventurersFactoryTest {

       private static  Adventurers a1 = AdventurersFactory.createAdventurer("12345", "Marcus",
                                                                    "Johnson", "Orc", 55);

       private static Adventurers a2 = AdventurersFactory.createAdventurer("12345", "Marcus", "Johnson");

       @Test
       @Order(1)
        public void testCreateAdventurers() {
           assertNotNull(a1);
           assertNotNull(a2);
           System.out.println(a1.toString());
           System.out.println(a2.toString());
    }

    @Test
    @Order(2)
    public void testCreateAdventurersWithAllAttributes() {
        assertNotNull(a1);
        assertNotNull(a2);
        System.out.println(a1.toString());
        System.out.println(a2.toString());
    }

    @Test
    @Order(3)
    public void testCreateAdventurersThatFails() {
        fail();
    }// fail();
}