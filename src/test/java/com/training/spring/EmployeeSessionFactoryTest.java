package com.training.spring;


import com.hibernate.annotation.entity.Employee;
import com.training.spring.repositories.impl.EmployeeDaoImpl;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

import static org.junit.Assert.assertNotNull;
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
        assertTrue(employees.size() > 0);
    }

    @Test
    public void testFindEmployeeUsingDao() throws Exception {

        EmployeeDaoImpl employeeDaoImml = context.getBean("employeeDaoImpl", EmployeeDaoImpl.class);

        assertNotNull(employeeDaoImml);

        List<Employee> allEmployee = employeeDaoImml.findAll();
        assertTrue(allEmployee.size() > 0);

    }

    @Test
    public void testFindById() throws Exception {
        EmployeeDaoImpl employeeDaoImml = context.getBean("employeeDaoImpl", EmployeeDaoImpl.class);
        Employee employee = employeeDaoImml.findById(2);
        assertNotNull(employee);

    }


    
}
