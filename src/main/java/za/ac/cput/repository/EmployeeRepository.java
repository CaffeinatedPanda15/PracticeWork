package za.ac.cput.repository;

import za.ac.cput.domain.Employees;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository implements IEmployeeRepository{
    private static IEmployeeRepository employeeRepository = null;

    private List<Employees> employeesList;

    private EmployeeRepository() {
        employeesList = new ArrayList<Employees>();
    }

    public static IEmployeeRepository getEmployeeRepository() {
        if (employeeRepository == null) {
            employeeRepository = new EmployeeRepository();
        }
        return employeeRepository;
    }

    @Override
    public Employees create(Employees employees) {
        boolean success = employeesList.add(employees);
        if (success) {
            return employees;
        }
        return null;
    }

    @Override
    public Employees read(String employeeId) {
        for (Employees e : employeesList) {
            if (e.getEmployeeId().equals(employeeId))
                return e;
        }

        return null;
    }

    @Override
    public Employees update(Employees employees) {
        String id = employees.getEmployeeId();
        Employees employeeOld = read(id);
        if (employeeOld == null)
            return null;

        Boolean success = delete(id);
        if (success) {
            if (employeesList.add(employees))
                return employees;
        }
        return null;
    }

    @Override
    public Boolean delete(String employeeId) {
        Employees employeesToDelete = read(employeeId);
                if (employeesToDelete == null)
                    return false;
                return (employeesList.remove(employeesToDelete));

    }

    @Override
    public List<Employees> getAll() {
        return employeesList;
    }


    //search lambda expressions
}//end of class
