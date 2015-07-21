package com.training.spring;

import com.hibernate.annotation.entity.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:hibernate.xml")
public class ContextTest {


    @Test
    public void testLoadContext() throws Exception {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:hibernate.xml");
        SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");

        System.out.println(sessionFactory);

        Session session = sessionFactory.openSession();

        Employee employee = (Employee) session.get(Employee.class, 1);
        System.out.println(employee);
        assertThat(employee, is(notNullValue()));

    }
}
