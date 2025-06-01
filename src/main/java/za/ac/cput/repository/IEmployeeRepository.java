package za.ac.cput.repository;

import za.ac.cput.domain.Employees;

import java.util.List;

public interface IEmployeeRepository extends IRepository<Employees, String>{


    List<Employees> getAll();
}
