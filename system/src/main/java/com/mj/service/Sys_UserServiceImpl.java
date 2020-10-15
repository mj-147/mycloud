package com.mj.service;

import com.mj.dao.Sys_UserDao;
import com.mj.pojo.sys_user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class Sys_UserServiceImpl implements Sys_UserService {

    @Autowired
    private Sys_UserDao sysUserDao;

    @Override
    public List<sys_user> GetList() {
        return sysUserDao.GetList();
    }
}
