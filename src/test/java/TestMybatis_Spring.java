import com.jie.dao.AdminDao;
import com.jie.entity.Admin;
import com.jie.service.AdminService;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-mybatis.xml")
public class TestMybatis_Spring {

    @Autowired
    SqlSessionFactory factory;

    @Autowired
    AdminDao dao;

    @Test
    public void testAop(){

        Admin admin = new Admin();
        admin.setAdmin_name("jack");
        admin.setAdmin_password("123");
        Admin login = dao.select_login(admin);
        System.out.println(login);
    }



    @Test
    public void testFactory(){
        SqlSession sqlSession = factory.openSession();
        AdminDao dao = sqlSession.getMapper(AdminDao.class);
        Admin admin = new Admin();
        admin.setAdmin_name("jack");
        admin.setAdmin_password("123");
        Admin login = dao.select_login(admin);
        System.out.println(login);
    }
}
