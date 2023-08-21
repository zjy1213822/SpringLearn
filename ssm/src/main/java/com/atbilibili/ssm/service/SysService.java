package com.atbilibili.ssm.service;

import org.springframework.stereotype.Service;

@Service
public class SysService {
    public void Sys(String username){
        System.out.println(username+"信息已被登录");
    }
}
