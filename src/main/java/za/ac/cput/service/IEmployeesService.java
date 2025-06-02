package za.ac.cput.service;

import za.ac.cput.domain.Employees;

import java.util.List;

public interface IEmployeesService extends IService<Employees, String>{

    List<Employees> getall();
}
