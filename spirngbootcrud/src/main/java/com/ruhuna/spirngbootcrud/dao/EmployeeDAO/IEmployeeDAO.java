package com.ruhuna.spirngbootcrud.dao.EmployeeDAO;

import com.ruhuna.spirngbootcrud.entities.Employee;
import org.springframework.stereotype.Component;

import java.util.List;
//@Component
//hiding implementation details by interfaces
//interfaces is a way to achieve abstraction
public interface IEmployeeDAO {
    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    void deleteById(int id);
}
