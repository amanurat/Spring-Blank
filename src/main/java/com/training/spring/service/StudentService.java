package com.training.spring.service;

import com.hibernate.annotation.entity.Student;

/**
 * Created by amanurat on 4/10/15 AD.
 */
public interface StudentService {

    Student searchEmployeeById(Integer id);

    void save(Student student);
}
