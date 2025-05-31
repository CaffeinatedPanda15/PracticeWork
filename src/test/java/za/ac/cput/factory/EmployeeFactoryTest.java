package za.ac.cput.factory;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import za.ac.cput.domain.Employees;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class EmployeeFactoryTest {

    private static Employees e1 = EmployeeFactory.createEmployees(12345, "Marcus", "Aurelius");
    private static Employees e2 = EmployeeFactory.createEmployees(123445, "Markus", "Aurellius", "ffff@gmail.com", 123456789);
    private static Employees e3 = EmployeeFactory.createEmployees(1234457, "Markus", "Aurellius", "ffff@gmail.com", 123456789);
    @Test
    @Order(1)
    public void testCreateEmployees() {
        assertNotNull(e1);
        System.out.println(e1.toString());
    }

    @Test
    @Order(2)
    public void testCreateEmployeesWithAllAttributes() {
    assertNotNull(e1);
    assertNotNull(e2);
        System.out.println(e1.toString());
        System.out.println(e2.toString());
    }

    @Test
    @Order(3)
    public void testCreateEmployeeThatFails() {
    fail();
    }// fail(); method to force a test to fail

    @Test
    @Order(4)
    public void testNotImplemented() {
      // Todo
    }//a way to show a test is unfinished
}//end of class