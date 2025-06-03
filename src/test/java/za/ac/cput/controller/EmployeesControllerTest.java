package za.ac.cput.controller;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import za.ac.cput.domain.Employees;
import za.ac.cput.factory.EmployeeFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@TestMethodOrder(MethodOrderer.MethodName.class)
class EmployeesControllerTest {


    @Autowired
    private TestRestTemplate restTemplate;

    private static Employees employee;

    private static String BASE_URL = "http://localhost:8080/employees";



    @BeforeAll
    public static void setup() {
        employee = EmployeeFactory.createEmployees("Hallo", "Ich", "haben", "haben@gmail.com",123456789);

    }

    @Test
    void a_create() {
        String url = BASE_URL + "/create";
        Employees createdEmployee = this.restTemplate.postForObject(url, employee, Employees.class);
        assertNotNull(createdEmployee);
        System.out.println("Created: " + createdEmployee);
    }

    @Test
    void b_read() {
        String url = BASE_URL + "/read/" + employee.getEmployeeId();
        Employees readEmployee = this.restTemplate.getForObject(url, Employees.class);
        assertNotNull(readEmployee);
        System.out.println("Read: " + readEmployee);
        assertEquals(employee.getEmployeeId(), readEmployee.getEmployeeId());

    }

    @Test
    void c_update() {
        Employees updatedEmployee = new Employees.Builder()
                .copy(employee)
                .setFirstName("Updated Name")
                .build();

        String url = BASE_URL + "/update";
        this.restTemplate.put(url, updatedEmployee);
        Employees readEmployee = this.restTemplate.getForObject(url + "/" + updatedEmployee.getEmployeeId(), Employees.class);
        assertNotNull(readEmployee);
        System.out.println("Updated: " + readEmployee);
        assertEquals("Updated Name", readEmployee.getFirstName());
    }

    @Test
    void d_getall() {
        String url = BASE_URL + "/getall";
        Employees[] employeesArray = this.restTemplate.getForObject(url, Employees[].class);
        assertNotNull(employeesArray);
        System.out.println("Get All: " + employeesArray.length);
        for (Employees emp : employeesArray) {
            System.out.println(emp);
        }
        assertTrue(employeesArray.length > 0);
    }
}