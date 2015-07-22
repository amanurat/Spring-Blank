package com.training.spring.repositories.impl;

import com.hibernate.annotation.entity.Employee;
import com.training.spring.repositories.EmployeeDao;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:applicationContext.xml"})
@Transactional
public class EmployeeDaoImplTest {

    @Autowired
    private EmployeeDao employeeDao;

    private Serializable ID;

    @Before
    public void setUp() throws Exception {
        Employee employee = new Employee("Assanai","Manurat");
        ID = employeeDao.insert(employee);
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testFindAll() throws Exception {
        List<Employee> employeeList = employeeDao.findAll();
        assertEquals(1, employeeList.size());
    }

    @Test
    public void testFindById() throws Exception {
        Employee employee = employeeDao.findById(ID);
        assertEquals("Assanai", employee.getFirstName());
        assertEquals("Manurat", employee.getLastName());
    }

    @Test
    public void testUpdate() throws Exception {
        Employee employee = employeeDao.findById(ID);
        employee.setFirstName("Net");

        employeeDao.update(employee);

        Employee employeeUpdated = employeeDao.findById(ID);
        assertEquals("Net", employeeUpdated.getFirstName());
    }
}