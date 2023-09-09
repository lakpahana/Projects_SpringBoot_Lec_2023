package com.ruhuna.spirngbootcrud.service;

import com.ruhuna.spirngbootcrud.entities.Employee;

import java.util.List;

public interface iEmployeeService
{

    List<Employee> findAll();
    Employee findById(int id);
    Employee save(Employee employee);
    void deleteById(int id);
}
