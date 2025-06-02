package za.ac.cput.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.*;
import za.ac.cput.domain.Employees;
import za.ac.cput.service.EmployeesService;

import java.util.List;

@RestController
@RequestMapping("/employees")
public class EmployeesController {

    private EmployeesService service;

    @Autowired
    public EmployeesController(EmployeesService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public Employees create(@RequestBody Employees employees) {
        return service.create(employees);
    }

    @GetMapping("/read/{employeeId}")
            public Employees read(@PathVariable String employeeId) {
        return service.read(employeeId);
    }

    @PutMapping("/update")
    public Employees update(@RequestBody Employees employees) {
        return service.update(employees);
    }

    //@DeleteMapping("/delete/{employeeId}")
   // public boolean delete(@PathVariable String employeeId) {
     //   return service.delete(employeeId);
   // }

    @GetMapping("/getall")
    public List<Employees> getall() {
        return service.getall();
    }
}
