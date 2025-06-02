package za.ac.cput.service;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Adventurers;
import za.ac.cput.factory.AdventurersFactory;

import static org.junit.jupiter.api.Assertions.*;

class AdventurerServiceTest {

    private IService service = AdventurerService.getService();
    private static Adventurers adventurers = AdventurersFactory.createAdventurer("12345", "Maldavius", "Figtree");


    @Test
    void create() {
        Adventurers newAdvenurer = (Adventurers) service.create(adventurers);
        assertNotNull(adventurers);
        System.out.println(adventurers);
    }

    @Test
    void read() {
        Adventurers updatenew = new Adventurers.Builder().copy(adventurers).setFirstName("ahhhhhhhh").build();
        Adventurers updated = (Adventurers) service.update(updatenew);
        assertNotNull(updated);
        System.out.println(updated);
    }
}