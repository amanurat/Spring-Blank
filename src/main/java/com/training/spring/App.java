package com.training.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {


    public static void main(String[] args) {

       /* Hello hello = new Hello();
        System.out.println(hello.getMessage());
*/

//        loadXmlClasspathApplicationContext();

        loadConfigurationUseAnnotation();

    }

    private static void loadConfigurationUseAnnotation() {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        ExampleComponent component = (ExampleComponent) context.getBean("theExampleComponent");

        Student student = component.getStudent();

        System.out.println(student.getFirstName());
        System.out.println(student.getLastName());


        Hello hello = component.getHello();
        hello.setMessage("Hello Augmentis");

        System.out.println(hello.getMessage());

    }

    private static void loadXmlClasspathApplicationContext() {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.getMessage());


        hello.setMessage("Hello Augmentis");
        System.out.println("By Setter >> " + hello.getMessage());


        Hello helloConstructor = (Hello) context.getBean("helloConstructor");
        System.out.println("By Constructor >> " + helloConstructor.getMessage());
        System.out.println("By Constructor country >> " + helloConstructor.getCountry());
        System.out.println("Get Student  "+ helloConstructor.getStudent().getFirstName());


        Student student = (Student) context.getBean("student");
        System.out.println("Student name : "+ student.getFirstName());
        System.out.println("Student lastname : " + student.getLastName());
        System.out.println("Student courseList : "+ student.getCourseList());
        System.out.println("Student courseMap : "+ student.getCourseMap());
        System.out.println("Student courseSet : "+ student.getCourseSet());


        Hello helloSetter = context.getBean("helloSetter", Hello.class);
        System.out.println("helloSetter > country : "+ helloSetter.getCountry());
        System.out.println("helloSetter > student : "+ helloSetter.getStudent().getFirstName());


    }
}
