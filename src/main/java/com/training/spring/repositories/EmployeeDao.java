package com.training.spring.repositories;


import com.hibernate.annotation.entity.Employee;
import com.training.spring.repositories.base.GenericDao;

import java.io.Serializable;
import java.util.List;

public interface EmployeeDao extends GenericDao<Employee, Serializable> {


}
