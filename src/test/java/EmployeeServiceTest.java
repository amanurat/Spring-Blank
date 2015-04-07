import com.hibernate.annotation.entity.Employee;
import com.training.spring.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
import java.util.logging.Level;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:hibernate.xml"})

public class EmployeeServiceTest {



    @Autowired
    private EmployeeService employeeService;

    @Test
    public void testFindEmployeeByIdShouldFoundData() throws Exception {

        Employee employee = employeeService.findEmployee(1);

        System.out.println(employee);

    }


    @Test
    public void testFindAllEmployeeShouldFoundData()  {

        List<Employee> employeeList = employeeService.findAllEmployee();
        System.out.println(employeeList);

    }

    @Test
    public void testInsertEmployee() {


        Employee employee = new Employee();
        employee.setFirstName("Emp1");
        employee.setSalary(2000.00);

        employeeService.insert(employee);

    }


    @Test
    public void testUpdateEmployee() throws Exception {

        Employee employee = employeeService.findEmployee(1);

        employee.setFirstName("Em1_Update");

        employeeService.update(employee);

    }

    @Test
    public void testDeleteEmployee() throws Exception {


        Employee employee = employeeService.findEmployee(1);
        employeeService.delete(employee);

    }
}
