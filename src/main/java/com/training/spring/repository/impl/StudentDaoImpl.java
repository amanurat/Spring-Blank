package com.training.spring.repository.impl;


import com.hibernate.annotation.entity.Student;
import com.training.spring.repository.StudentDao;
import com.training.spring.repository.base.HibernateDAOImpl;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository(value = "studentDao")
public class StudentDaoImpl extends HibernateDAOImpl<Student, Serializable> implements StudentDao {


}
