package com.training.spring.repository;


import com.hibernate.annotation.entity.Student;
import com.training.spring.repository.base.GenericDao;

import java.io.Serializable;

public interface StudentDao extends GenericDao<Student, Serializable> {


}
