package com.example.demo.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author NieYinjun
 * @date 2019/2/2 10:35
 * @tag
 */
@Data
public class SysUserRole implements Serializable {

    private Integer userId;
    private Integer roleId;


}
