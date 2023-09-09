package com.ruhuna.spirngbootcrud.dao;

import com.ruhuna.spirngbootcrud.dao.EmployeeDAO.IEmployeeDAO;
import com.ruhuna.spirngbootcrud.entities.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class EmployeeDAOImpl implements IEmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public List<Employee> findAll() {
        TypedQuery<Employee> typedQuery = entityManager.createQuery("from Employee", Employee.class);
        List<Employee> employeeList = typedQuery.getResultList();
        return employeeList;
    }

    @Override
    public Employee findById(int id) {
        Employee employee = entityManager.find(Employee.class,id);
        return employee;
    }

    @Override
    public Employee save() {
        return new Employee();
    }

    @Override
    public void deleteById(int id) {
//        return null;
    }
}
