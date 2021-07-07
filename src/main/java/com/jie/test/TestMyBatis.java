package com.jie.test;

import com.jie.dao.AdminDao;
import com.jie.entity.Admin;
import com.jie.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

public class TestMyBatis {

    public static void main(String[] args) {

        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        AdminDao dao = sqlSession.getMapper(AdminDao.class);

        Admin admin = new Admin();
        admin.setAdmin_name("jack");
        admin.setAdmin_password("123");
        Admin login = dao.select_login(admin);
        System.out.println(login);
    }

}
