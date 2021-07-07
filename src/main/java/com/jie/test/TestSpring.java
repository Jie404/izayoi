package com.jie.test;

import com.jie.entity.Admin;
import com.jie.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {

    @Autowired
    AdminService adminService;

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Products products = context.getBean("product", Products.class);
//        System.out.println(products);

//        Admin admin = context.getBean("admin", Admin.class);
//        System.out.println(admin.getDddd());


    }





}
