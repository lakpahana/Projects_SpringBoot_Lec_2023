package com.ruhuna.spirngbootcrud.rest;

import com.ruhuna.spirngbootcrud.dao.EmployeeDAO.IEmployeeDAO;
import com.ruhuna.spirngbootcrud.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api")
@RestController
public class EmployeeRestController {
    private IEmployeeDAO employeeDAO;

    @Autowired
    //constructor injection
    public EmployeeRestController(IEmployeeDAO employeeDAO) {

        this.employeeDAO = employeeDAO;
    }
    //localhost:8080/api/employees
    @GetMapping("/employees")
    List<Employee> findAll() {
//        System.out.println("sadas");
        return employeeDAO.findAll();
    }

    @GetMapping("/employees/{requestedId}")
    Employee findEmployeeById(@PathVariable int requestedId){
        return employeeDAO.findById(requestedId);
    }
}
