import com.training.spring.bean.ExampleComponent;
import com.training.spring.bean.Hello;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml"})
public class BeanTest {

    @Autowired
    private Hello hello;


    @Autowired
    private ExampleComponent exampleComponent;

    @Test
    public void testAutowiredBean() {
        System.out.println("############### Autowired Hello ###################");
        System.out.println(hello);

    }

    @Test
    public void testExampleComponent() {

        System.out.println("Show exampleComponent : "+ exampleComponent);
        System.out.println("Show hello : " + exampleComponent.getHello());
        System.out.println("Show message : "+ exampleComponent.getMessage());

    }




}
