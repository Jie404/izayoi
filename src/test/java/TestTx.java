import com.jie.service.AdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class TestTx {

    @Autowired
    AdminService asi;

    @Test
    public void testLogin(){
        int register = asi.register(null);
        System.out.println(register);
    }

    @Test
    public void testTemp(){
        System.out.println(9&11);
    }
}
