package com.atbilibili.springboottestlearn.service;

import com.atbilibili.springboottestlearn.pojo.robot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class helloService {
    @Autowired
    private robot robot;
    public void sayHello(){
        System.out.println("hello");
    }
    public String say(){

        return robot.toString();
    }
}
