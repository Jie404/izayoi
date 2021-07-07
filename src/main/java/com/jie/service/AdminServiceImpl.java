package com.jie.service;

import com.jie.dao.AdminDao;
import com.jie.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements  AdminService{

    @Autowired
    AdminDao ad;

    public Admin login(Admin admin) {
        Admin a = ad.select_login(admin);

        System.out.println("登录成功");
        return a;
    }

    public int register(Admin admin) {
//        Admin a1 = new Admin("AAA", "aaa");
//        Admin a2 = new Admin("BBB", "bbb");
//        Admin a3 = new Admin("CCC", "ccc");
//
//        int i1 = ad.insert_register(a1);
//        int i2 = ad.insert_register(a2);
//        int i3 = ad.insert_register(a3);

        int i = ad.insert_register(admin);
        System.out.println("完成");
        return (i);
    }
}
