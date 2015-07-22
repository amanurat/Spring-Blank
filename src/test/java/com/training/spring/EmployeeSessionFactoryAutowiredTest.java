package com.training.spring;

import com.hibernate.annotation.entity.Employee;
import com.training.spring.repository.EmployeeDao;
import org.hibernate.SessionFactory;
import org.hibernate.classic.Session;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml"})
@TransactionConfiguration(defaultRollback = false)
@Transactional
public class EmployeeSessionFactoryAutowiredTest {

    @Autowired
    private SessionFactory sessionFactory;


    @Autowired
    private EmployeeDao employeeDao;
    private Session session;
    private Employee employee;


    @Before
    @Transactional
    public void setup() throws Exception {
        session = sessionFactory.getCurrentSession();
        employee = new Employee("Assanai", "Manurat");
        session.save(employee);
    }

    @After
    @Transactional
    public void tearDown() throws Exception {
        session = sessionFactory.getCurrentSession();
        List<Employee> employees = session.createQuery("from Employee").list();

        for (Employee employee : employees) {
            session.delete(employee);
        }
    }

    @Test
    public void testLoadEmployeeFromDao() throws Exception {
        List<Employee> employees = employeeDao.findAll();
        assertThat(employees.size(), is(1));
    }

    @Test
    @Transactional
    public void testFindAll() throws Exception {
        session = sessionFactory.getCurrentSession();
        List<Employee> employees = session.createQuery("from Employee").list();
        assertThat(employees.size(), is(1));
    }

    @Test
    @Transactional
    public void testSaveEmployeeFromDao() throws Exception {
        Employee employee = new Employee("Net", "Net");
        employeeDao.insert(employee);

        Employee created = employeeDao.findById(employee.getId());
        assertThat(created.getFirstName(), is("Net"));

    }

    @Test
    @Transactional
    public void testUpdate() throws Exception {
        Employee employee = employeeDao.findById(this.employee.getId());
        employee.setFirstName("John");


        employeeDao.update(employee);

        Employee updated = employeeDao.findById(employee.getId());
        assertThat(updated.getFirstName(), is("John"));

    }
}
