package za.ac.cput.repository;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import za.ac.cput.domain.Employees;
import za.ac.cput.factory.EmployeeFactory;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeRepositoryTest {
    private static IEmployeeRepository repository = EmployeeRepository.getEmployeeRepository();

    private Employees employee = EmployeeFactory.createEmployees("1234457", "Markus", "Aurellius", "ffff@gmail.com", 123456789);

    @Test
    void a_create() {
        Employees created = repository.create(employee);
        assertNotNull(created);
        System.out.println(created.toString());
    }

    @Test
    void b_read() {
        Employees read = repository.read(employee.getEmployeeId());
        assertNotNull(read);
        System.out.println(read.toString());
    }

    @Test
    void c_update() {
        Employees newEmployees = new Employees.Builder().copy(employee).setFirstName("haaaa")
                .build();
        Employees updated = repository.update(newEmployees);
        assertNotNull(updated);
        System.out.println(updated.toString());
    }

    @Test
    void d_delete() {
        assertTrue(repository.delete(employee.getEmployeeId()));
        System.out.println("success");
    }

    @Test
    void e_getAll() {
        System.out.println(repository.getAll());
    }
}