package com.training.spring;

import com.hibernate.annotation.entity.Employee;
import com.training.spring.services.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml"})
public class EmployeeServiceTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void testSearchEmployeeById() throws Exception {
        Employee employee = employeeService.searchEmployeeById(1);
        assertNotNull(employee);
        assertEquals("Tony", employee.getFirstName());
    }

    @Test
    @Transactional
    @Rollback(value = true)
    public void testSaveEmployee() throws Exception {
        Employee employee = new Employee("June", "June", null);

        employeeService.saveEmployee(employee);


        Employee employeeResult = employeeService.searchEmployeeById(3);
        assertEquals("June", employeeResult.getFirstName());

    }


}
