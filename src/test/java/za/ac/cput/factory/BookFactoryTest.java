package za.ac.cput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Book;

import static org.junit.jupiter.api.Assertions.*;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

class BookFactoryTest {

    private static Book b1 = BookFactory.createBook("1984", "Orson", "Oxford", 555);
    @Test
    public void createBook() {
        assertNotNull(b1);

        System.out.println(b1.toString());
    }
}