package za.ac.cput.factory;

import za.ac.cput.domain.Customer;
import za.ac.cput.util.Helper;

public class CustomerFactory {
    public static Customer createCustomer( String firstName, String lastName, String email, String phoneNumber) {
       String customerId = Helper.generateId();
        return new Customer.Builder()
                .setCustomerId(customerId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setPhoneNumber(phoneNumber)
                .build();
    }
}
