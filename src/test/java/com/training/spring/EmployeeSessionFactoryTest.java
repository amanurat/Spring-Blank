package com.training.spring;


import com.hibernate.annotation.entity.Employee;
import com.training.spring.repository.impl.StudentDaoImpl;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class EmployeeSessionFactoryTest {


    ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
    private SessionFactory sessionFactory;

    @Before
    public void setUp() throws Exception {
        sessionFactory = context.getBean("sessionFactory", SessionFactory.class);
        assertNotNull(sessionFactory);
    }

    @Test
    public void testFindAllEmployees() throws Exception {
        Session session = sessionFactory.openSession();
        List<Employee> employees = session.createQuery("from Employee").list();
        assertThat(employees, is(notNullValue()));
    }

}
