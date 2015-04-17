/*
package com.training.spring;

import com.hibernate.annotation.entity.Employee;
import com.training.spring.repositories.EmployeeDao;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml"})

public class EmployeeSessionFactoryAutowiredTest {

    @Autowired
    private SessionFactory sessionFactory;


    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testLoadEmployeeFromDao() throws Exception {
        List<Employee> allEmployee = employeeDao.();
        assertTrue(allEmployee.size() > 0);
    }

    @Test
    public void testLoadSessionFactory() throws Exception {
        assertNotNull(sessionFactory);
    }

    @Test
    public void testFindAll() throws Exception {
        Session session = sessionFactory.openSession();
        List<Employee> employees = session.createQuery("from Employee").list();
        assertTrue(employees.size() > 0);
    }

    @Test
    @Transactional
    @Rollback(value = false)
    public void testSaveEmployeeDirectly() throws Exception {
        Session session = sessionFactory.getCurrentSession();
        Employee employee = new Employee("Assanai", "Manurat");
        session.save(employee);
    }

    @Test
    public void testSaveEmployeeFromDao() throws Exception {
        Employee employee = new Employee("Net", "Net");
        employeeDao.create(employee);
    }

    @Test
    @Transactional(readOnly = false)
    public void testUpdate() throws Exception {

        Employee employee = employeeDao.(1);

        employee.setFirstName("John");


        employeeDao.update(employee);

    }
}
*/
