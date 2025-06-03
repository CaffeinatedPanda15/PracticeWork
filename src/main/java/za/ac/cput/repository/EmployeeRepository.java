package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.ac.cput.domain.Employees;

import java.util.ArrayList;
import java.util.List;

@Repository
public class EmployeeRepository extends JpaRepository<Employees, String> {

}//end of class
