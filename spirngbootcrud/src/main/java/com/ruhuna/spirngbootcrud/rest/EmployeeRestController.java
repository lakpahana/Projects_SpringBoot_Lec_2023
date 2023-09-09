package com.ruhuna.spirngbootcrud.rest;

import com.ruhuna.spirngbootcrud.entities.Employee;
import com.ruhuna.spirngbootcrud.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("api")
@RestController
public class EmployeeRestController {

    private IEmployeeService employeeService;
    @Autowired


    public EmployeeRestController(IEmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    //constructor injection
//    public EmployeeRestController(IEmployeeDAO employeeDAO) {
//
//        this.employeeDAO = employeeDAO;
//    }
    //localhost:8080/api/employees
    @GetMapping("/employees")
    List<Employee> findAll() {
//        System.out.println("sadas");
        return employeeService.findAll();
    }

    @GetMapping("/employees/{requestedId}")
    Employee findEmployeeById(@PathVariable int requestedId){
        //if this is not found return null
        Employee employee = employeeService.findById(requestedId);

        if(employee == null){
            throw new RuntimeException("Employee id not found - "+requestedId);
        }

        return employee;

    }


    @PostMapping("/employees")
    Employee addEmployee(@RequestBody Employee employee){
        employeeService.save(employee);
        return employee;
    }

    @PutMapping("/employees")
    Employee updateEmployee(@RequestBody Employee employee){
        //if it's there it will update it,if not it will create a new one
        employeeService.save(employee);
        return employee;
    }

    @DeleteMapping("/employees/{requestedId}")
    String deleteEmployee(@PathVariable int requestedId){
        Employee employee = employeeService.findById(requestedId);
        if(employee == null){
            throw new RuntimeException("Employee id not found - "+requestedId);
        }
        employeeService.deleteById(requestedId);
        return "Deleted employee id - "+requestedId;
    }
}
