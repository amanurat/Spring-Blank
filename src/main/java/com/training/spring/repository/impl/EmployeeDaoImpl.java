package com.training.spring.repository.impl;


import com.hibernate.annotation.entity.Employee;
import com.training.spring.repository.EmployeeDao;
import com.training.spring.repository.StudentDao;
import com.training.spring.repository.base.HibernateDAOImpl;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository(value = "employeeDao")
public class EmployeeDaoImpl extends HibernateDAOImpl<Employee, Serializable> implements EmployeeDao {


}
