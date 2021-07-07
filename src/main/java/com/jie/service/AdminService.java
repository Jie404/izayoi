package com.jie.service;

import com.jie.entity.Admin;


public interface AdminService {

    Admin login(Admin admin);

    int register(Admin admin);

}
