package com.training.spring.component;

import com.training.spring.bean.Hello;
import com.training.spring.bean.Student;
import com.training.spring.service.StudentService;
import com.training.spring.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    @Autowired
    private Student student;

    private Hello hello;

    @Autowired
    public MyComponent(Hello hello) {
        this.hello = hello;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Hello getHello() {
        return hello;
    }

    public void setHello(Hello hello) {
        this.hello = hello;
    }
}
