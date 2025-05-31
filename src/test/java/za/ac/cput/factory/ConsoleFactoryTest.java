package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Console;

import static org.junit.jupiter.api.Assertions.*;

class ConsoleFactoryTest {

    private Console c1 = ConsoleFactory.createConsole("PS5", "Sony", 5);

    @Test
    public void testCreateConsole() {
        assertNotNull(c1);

        System.out.println(c1.toString());
    }
}