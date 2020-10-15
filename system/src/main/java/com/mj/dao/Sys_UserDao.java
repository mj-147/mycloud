package com.mj.dao;

import com.mj.pojo.sys_user;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface Sys_UserDao {
    public List<sys_user> GetList();
}
