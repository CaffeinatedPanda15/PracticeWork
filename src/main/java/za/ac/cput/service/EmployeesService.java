package za.ac.cput.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.ac.cput.domain.Employees;
import za.ac.cput.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeesService implements IEmployeesService {


    private IEmployeesService service;

    private EmployeeRepository repository;

    private List<Employees> EmployeesList;

    @Autowired
    EmployeesService(EmployeeRepository repository) {
        this.repository = repository;
        this.EmployeesList = new ArrayList<Employees>();
    }

    @Override
    public Employees create(Employees employees) {
        return this.repository.save(employees);
    }

    @Override
    public Employees read(String employeeId) {
        return this.repository.findById(employeeId).orElse(null);
    }

    @Override
    public Employees update(Employees employees) {
        return this.repository.save(employees);
    }

    @Override
    public List<Employees> getall() {
        return this.repository.findAll();
    }
}//end of class
