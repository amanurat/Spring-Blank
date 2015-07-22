package com.training.spring.component;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;

public class MyComponentTest {

    ApplicationContext context =
            new ClassPathXmlApplicationContext("classpath:bean-child.xml");


    @Test
    public void testLoadMyComponentBean() throws Exception {

        MyComponent myComponent = context.getBean("myComponent", MyComponent.class);

        assertNotNull(myComponent);


    }
}
