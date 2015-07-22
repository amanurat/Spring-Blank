package com.training.spring.bean;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.assertThat;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:hibernate.xml")
public class ContextTest {


    @Test
    public void testLoadContext() throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:hibernate.xml");
        SessionFactory sessionFactory = (SessionFactory) context.getBean("sessionFactory");
        System.out.println(sessionFactory);

        assertThat(sessionFactory, is(notNullValue()));

    }
}
