package com.ruhuna.spirngbootcrud.service;
import com.ruhuna.spirngbootcrud.dao.EmployeeDAO.IEmployeeDAO;
import com.ruhuna.spirngbootcrud.entities.Employee;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmployeeServiceImpl implements IEmployeeService {
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
    @Transactional
    public Employee save(Employee employee) {
        return employeDAO.save(employee);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        employeDAO.deleteById(id);
    }
}
