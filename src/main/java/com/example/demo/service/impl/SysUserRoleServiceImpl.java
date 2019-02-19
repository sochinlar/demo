package com.example.demo.service.impl;

import com.example.demo.mapper.SysUserRoleMapper;
import com.example.demo.service.SysUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author NieYinjun
 * @date 2019/2/2 10:40
 * @tag
 */
@Service
public class SysUserRoleServiceImpl implements SysUserRoleService {
    @Autowired
    private SysUserRoleMapper sysUserRoleMapper;
    @Override
    public Object selectList() {
        return sysUserRoleMapper.selectList(null);
    }
}
