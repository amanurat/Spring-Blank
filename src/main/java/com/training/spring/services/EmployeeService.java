package com.training.spring.services;

import com.hibernate.annotation.entity.Employee;

/**
 * Created by amanurat on 4/10/15 AD.
 */
public interface EmployeeService {

    Employee searchEmployeeById(Integer id);

    void saveEmployee(Employee employee);
}
