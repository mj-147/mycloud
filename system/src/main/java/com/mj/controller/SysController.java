package com.mj.controller;

import com.mj.pojo.sys_user;
import com.mj.service.Sys_UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/sys")
@RestController
public class SysController {

    @Autowired
    private Sys_UserService sysUserService;

    @GetMapping("/GetList")
    public List<sys_user> GetList() {
        return sysUserService.GetList();
    }
}
