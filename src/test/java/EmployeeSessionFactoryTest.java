import com.hibernate.annotation.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by amanurat on 11/21/14 AD.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:hibernate.xml"})
@Transactional
public class EmployeeSessionFactoryTest {


    @Autowired
    private SessionFactory sessionFactory;

    @Test
    public void testGetSessionFromSessionFactory() {


//        Session session = sessionFactory.openSession();

        Session session = sessionFactory.getCurrentSession();

        Employee employee = (Employee) session.get(Employee.class, 1);

        System.out.println(employee);


//        session.close();
    }

    @Test
    public void testFindHQLByFirstName() {

    }

    @Test
    public void testFindCriteriaByFirstNameAndLastName() {

    }

    @Test
    public void testFindByNameQuery() {

    }




}
