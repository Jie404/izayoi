package com.jie.dao;

import com.jie.entity.Admin;

public interface AdminDao {

    public Admin select_login(Admin admin);

    public int insert_register(Admin admin);

}
