package com.atbilibili.ssm.controller;

import com.atbilibili.ssm.bean.user;
import com.atbilibili.ssm.eneity.userEntity;
import com.atbilibili.ssm.event.EventPublisher;
import com.atbilibili.ssm.event.LoginEvent;
import com.atbilibili.ssm.mapper.userMapper;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class userController {
    @Autowired
    private EventPublisher publisher;
    @Autowired
    private com.atbilibili.ssm.mapper.userMapper userMapper;
    @ResponseBody
    @GetMapping( "/user/{id}")
    public user getUserByid(@PathVariable("id") Integer id){
        user user = userMapper.getUser(id);
        return user;
    }
    @GetMapping("/user")
    public String login(@RequestParam("username") String username,@RequestParam("password") String password){
        LoginEvent loginEvent = new LoginEvent(new userEntity(username, password));

        publisher.sentEvent(loginEvent);
        return username;
    }
}
