package za.ac.cput.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import za.ac.cput.domain.Employees;
import za.ac.cput.factory.EmployeeFactory;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class EmployeesServiceTest {

    private IEmployeesService service;
    private Employees employees = EmployeeFactory.createEmployees("123456789", "Markus", "Johnson", "Poes@gmail.com", 1234425452);

   @Test
    void create() {
       Employees newEmployee = service.create(employees);
       assertNotNull(newEmployee);
       System.out.println(newEmployee);
    }

    @Test
    void read() {
       Employees read = service.read(employees.getEmployeeId());
       assertNotNull(read);
        System.out.println(read);
    }

    @Test
    void update() {
       Employees updatednew = new Employees.Builder().copy(employees).setFirstName("amma").build();
       Employees updated = service.update(updatednew);
       assertNotNull(updated);
        System.out.println(updated);
   }

    @Test
    void getall() {
        System.out.println(service.getall());
    }
}