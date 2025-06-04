package za.ac.cput.factory;

import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Customer;

import static org.junit.jupiter.api.Assertions.*;

class CustomerFactoryTest {

    Customer customer = CustomerFactory.createCustomer("John", "Doe", "mmmm@gmail.com", "1234567890");

    @Test
    void createCustomer() {
        assertNotNull(customer);
        System.out.println(customer.toString());
    }
}