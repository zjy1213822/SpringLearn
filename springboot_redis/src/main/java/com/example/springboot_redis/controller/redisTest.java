package com.example.springboot_redis.controller;

import com.example.springboot_redis.pojo.Person;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
@Tag(name = "yuan")
@RestController
public class redisTest {
    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;
    @GetMapping("/count")
    @Operation(method = "按照id")
    public String getCoubt(){
        Long aaa = redisTemplate.opsForValue().increment("aaa");
        return "访问了aaa【"+aaa+"】次";
    }
    @GetMapping("/persons")
    public Person get(){
        Person p=new Person();
        return p;
    }
}
