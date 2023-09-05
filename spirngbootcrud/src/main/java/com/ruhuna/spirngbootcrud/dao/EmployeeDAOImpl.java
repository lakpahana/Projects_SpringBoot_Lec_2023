package com.ruhuna.spirngbootcrud.dao;

import com.ruhuna.spirngbootcrud.dao.EmployeeDAO.iEmployeeDAO;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeDAOImpl implements iEmployeeDAO {

    private EntityManager entityManager;

    @Autowired
    public EmployeeDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    @Override
    public void findAll() {

    }
}
