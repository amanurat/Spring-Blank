package com.training.spring.repositories.impl;


import com.hibernate.annotation.entity.Employee;
import com.training.spring.repositories.EmployeeDao;
import com.training.spring.repositories.base.HibernateDaoImpl;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Repository(value = "employeeDao")
public class EmployeeDaoImpl extends HibernateDaoImpl<Employee, Serializable> implements EmployeeDao {


}
