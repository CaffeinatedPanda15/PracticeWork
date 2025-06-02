package za.ac.cput.factory;

import za.ac.cput.domain.Contacts;
import za.ac.cput.util.Helper;

public class ContactsFactory {
    public static Contacts createContacts(String contactNumber, String homeAddress) {
        if (Helper.isNullorEmpty(homeAddress))
            return null;
        return new Contacts.Builder()
                .setContactNumber(contactNumber)
                .setHomeAddress(homeAddress)
                .build();
    }

}
