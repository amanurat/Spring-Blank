package com.training.spring.repositories.impl;


import com.hibernate.annotation.entity.Employee;
import com.training.spring.repositories.EmployeeDao;
import com.training.spring.repositories.base.HibernateDAOImpl;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository(value = "employeeDao")
public class EmployeeDaoImpl extends HibernateDAOImpl<Employee, Serializable> implements EmployeeDao {


}
