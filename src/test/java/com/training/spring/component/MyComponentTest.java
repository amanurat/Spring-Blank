package com.training.spring.component;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;

public class MyComponentTest {

    ApplicationContext context =
            new ClassPathXmlApplicationContext("classpath:bean-child.xml");


    @Test
    public void testLoadMyComponentBean() throws Exception {

        MyComponent myComponent = context.getBean("myComponent", MyComponent.class);

        System.out.println(myComponent.getUrl());
        assertNotNull(myComponent);

        assertThat(myComponent.getUrl(), is("http://localhost:3306/hibernatedb"));
        assertThat(myComponent.getUsername(), is("admin"));
        assertThat(myComponent.getPassword(), is("admin"));


    }
}
