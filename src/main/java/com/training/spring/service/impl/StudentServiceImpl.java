package com.training.spring.service.impl;

import com.hibernate.annotation.entity.Employee;
import com.hibernate.annotation.entity.Student;
import com.training.spring.repository.StudentDao;
import com.training.spring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;


    @Override
    public Student searchEmployeeById(Integer id) {
    	
        return studentDao.findById(id);
    }

    @Override
    public void save(Student student) {
        studentDao.insert(student);
    }

}
