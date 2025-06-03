package za.ac.cput.service;

import org.springframework.stereotype.Service;
import za.ac.cput.domain.Employees;
import za.ac.cput.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeesService implements IEmployeesService {

    private static IEmployeesService service;

    private IEmployeeRepository repository;

    private List<Employees> EmployeesList;

    private EmployeesService() {
        this.EmployeesList = new ArrayList<Employees>();
        repository = EmployeeRepository.getEmployeeRepository();
    }

    public static IEmployeesService getService() {
        if (service == null) {
            service = new EmployeesService();
        }

        return service;
    }


    @Override
    public Employees create(Employees employees) {
        return this.repository.create(employees);
    }

    @Override
    public Employees read(String employeeId) {
        return this.repository.read(employeeId);
    }

    @Override
    public Employees update(Employees employees) {
        return this.repository.update(employees);
    }

    @Override
    public List<Employees> getall() {
        return this.repository.getAll();
    }
}//end of class
