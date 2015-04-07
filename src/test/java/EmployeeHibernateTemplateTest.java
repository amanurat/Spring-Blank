import com.hibernate.annotation.entity.Department;
import com.hibernate.annotation.entity.Employee;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.Serializable;
import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:hibernate.xml"})
public class EmployeeHibernateTemplateTest {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Test
    public void testGetEmployeeByPk() {
        System.out.println(hibernateTemplate);

        //Get the employee using spring
        Employee employee = hibernateTemplate.get(Employee.class, 1);

        System.out.println("first name : " + employee.getFirstName());
        System.out.println("last name : " + employee.getLastName());


    }

    @Test
    public void testFindEmployeeWithHSQL() {
        List<Employee> employeeList = hibernateTemplate.find("from Employee");

        displayEmployee(employeeList);
    }

    @Test
    public void testFindEmployeeWithHSQLByParameter() {
        List<Employee> employeeList = hibernateTemplate.find("from Employee where id = ?", new Integer[] {3});

        displayEmployee(employeeList);
    }

    @Test
    public void testFindEmployeeWithNameQuery() {
        List<Employee> employeeList = hibernateTemplate.findByNamedQuery("findAllEmployee");
        displayEmployee(employeeList);
    }

    @Test
    public void testFindEmployeeWithCriteria() {

        DetachedCriteria criteria = DetachedCriteria.forClass(Employee.class);
        criteria.add(Restrictions.eq("firstName", "John"));

        List<Employee> employeeList = hibernateTemplate.findByCriteria(criteria);
        displayEmployee(employeeList);

    }


    @Test
    public void testFindDepartmentWithHSQL() {
        //TODO implement

        try {

            Department it = new Department("IT");
            Department hr = new Department("HR");
//            hibernateTemplate.save(it);
//            hibernateTemplate.save(hr);

            hibernateTemplate.saveOrUpdate(new Employee("aaa", it));

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void displayEmployee(List<Employee> employeeList) {
        for (Employee employee : employeeList) {
            System.out.println("First Name: "+ employee.getFirstName()
                    + ", Last Name: "+ employee.getLastName()
                    + ", Salary: "+ employee.getSalary());

        }
    }




}
