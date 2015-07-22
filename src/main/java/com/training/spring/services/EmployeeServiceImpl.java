package com.training.spring.services;

import com.hibernate.annotation.entity.Employee;
import com.training.spring.repositories.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeDao employeeDao;


    @Override
    public Employee searchEmployeeById(Integer id) {
    	
        return employeeDao.findById(id);
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeDao.insert(employee);
    }

}
