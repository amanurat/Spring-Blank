package com.training.spring.repository;


import com.hibernate.annotation.entity.Employee;
import com.training.spring.repository.base.GenericDao;

import java.io.Serializable;

public interface EmployeeDao extends GenericDao<Employee, Serializable> {


}
