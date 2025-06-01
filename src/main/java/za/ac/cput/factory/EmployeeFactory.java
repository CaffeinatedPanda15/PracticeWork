package za.ac.cput.factory;

import za.ac.cput.domain.Employees;
import za.ac.cput.util.Helper;

public class EmployeeFactory {
    public static Employees createEmployees(String employeeId, String firstName, String lastName, String email,  int phoneNumber) {
        if (Helper.isNullorEmpty(firstName) || Helper.isNullorEmpty(lastName) || Helper.isNullorEmpty(email) )
            return null;
        return new Employees.Builder()
                .setEmployeeId(employeeId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(email)
                .setPhoneNumber(phoneNumber)
                .build();

    }

    public static Employees createEmployees(String employeeId, String firstName, String lastName) {
        return new Employees.Builder()
                .setEmployeeId(employeeId)
                .setFirstName(firstName)
                .setLastName(lastName)
                .build();
    }
}
