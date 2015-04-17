package com.training.spring;

import com.hibernate.annotation.dao.EmployeeDao;

import java.util.List;

public class Hello {

    private String message = "Hello Spring Framework";

    private String country;

    private Student student;

    private List<String> someList;

    public Hello() {

    }

    public Hello(String message) {
        this.message = message;
    }

    public Hello(String message, String country) {
        this.message = message;
        this.country = country;
    }

    public Hello(Student student) {
        this.student = student;
    }


    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public List<String> getSomeList() {
        return someList;
    }

    public void setSomeList(List<String> someList) {
        this.someList = someList;
    }
}
