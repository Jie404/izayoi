import com.jie.service.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-anno.xml")
public class TestSpring {

    @Autowired
    AdminService adminService;

    @Test
    public void testAop() {

        // adminService.login();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-mybatis.xml");
        applicationContext.getBean("");
    }

}
