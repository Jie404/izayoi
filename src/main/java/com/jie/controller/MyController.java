package com.jie.controller;

import com.jie.entity.Admin;
import com.jie.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {

    @Autowired
    private AdminService as;


    // @RequestMapping：里面放的是请求的url，和用户请求的url进行匹配
    // 扩展名action可以写也可以不写; 而且扩展名是可以自定义的, 在web.xml里配置好就行
    @RequestMapping("/hello2.action")
    public ModelAndView login() {

        Admin a1 = new Admin("jack", "123");

        Admin admin = as.login(a1);

        ModelAndView mav = new ModelAndView();

//        // 这一步就相当于以前的request.setAttribute();
        mav.addObject("admin", admin);
//
//        // 这里设的其实是返回jsp的地址(这个其实就是服务器内部跳转,把数据带到的jsp页面)
//        // WEB-INF下的页面,用请求的方式是直接访问不到的,只能用服务器内部跳转访问;
        mav.setViewName("/hello.jsp");
        return mav;
    }

    @RequestMapping("/hello.action")
    public void hello() {
        System.out.println("--- spring mvc ---");

    }

}
