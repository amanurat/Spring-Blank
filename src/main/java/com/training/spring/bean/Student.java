package com.training.spring.bean;

import java.util.List;
import java.util.Map;
import java.util.Set;


public class Student {

    private String firstName = "Assanai";
    private String lastName = "Manurat";
    private List<String> courseList;
    private Map<String, String> courseMap;
    private Set<String> courseSet;

    public Student() {

    }

    public Set<String> getCourseSet() {
        return courseSet;
    }

    public void setCourseSet(Set<String> courseSet) {
        this.courseSet = courseSet;
    }

    public Map<String, String> getCourseMap() {
        return courseMap;
    }

    public void setCourseMap(Map<String, String> courseMap) {
        this.courseMap = courseMap;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<String> courseList) {
        this.courseList = courseList;
    }
}
