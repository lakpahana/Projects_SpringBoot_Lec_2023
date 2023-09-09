package com.ruhuna.spirngbootcrud.service;
import com.ruhuna.spirngbootcrud.dao.EmployeeDAO.IEmployeeDAO;
import com.ruhuna.spirngbootcrud.entities.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements  iEmployeeService{
    private IEmployeeDAO employeDAO;

    @Autowired
    public EmployeeServiceImpl(IEmployeeDAO employeDAO) {
        this.employeDAO = employeDAO;
    }

    @Override
    public List<Employee> findAll() {
        return employeDAO.findAll();
    }

    @Override
    public Employee findById(int id) {
        return employeDAO.findById(id);
    }

    @Override
    public Employee save(Employee employee) {
        return employeDAO.save(employee);
    }

    @Override
    public void deleteById(int id) {
        employeDAO.deleteById(id);
    }
}
