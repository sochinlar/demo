package com.example.demo.controller;

import com.example.demo.service.SysUserRoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author NieYinjun
 * @date 2019/2/2 10:44
 * @tag
 */
@RestController
@RequestMapping("/test")
@Slf4j
public class SysUserRoleController {

    @Autowired
    private SysUserRoleService sysUserRoleService;

    @RequestMapping("/user_roles")
    public Object getUserRoles(){

        log.info("-------------request--------------");

        return sysUserRoleService.selectList();
    }

    @RequestMapping("/")
    public Object test(){
        return "welcome to test!";
    }

}
