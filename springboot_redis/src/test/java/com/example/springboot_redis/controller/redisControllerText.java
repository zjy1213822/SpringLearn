package com.example.springboot_redis.controller;

import com.example.springboot_redis.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

@SpringBootTest
public class redisControllerText {
    @Autowired
    StringRedisTemplate stringRedisTemplate;
    @Autowired
    RedisTemplate redisTemplate;
    @Test
    public void AddText(){
        String listName="list";
        redisTemplate.opsForList().leftPush(listName,"1");
        redisTemplate.opsForList().leftPush(listName,"2");
        redisTemplate.opsForList().leftPush(listName,"3");
    }
    @Test
    void text02(){
        String setname="setTest2";
        //stringRedisTemplate.opsForSet().add(setname,"1","2","3");
        stringRedisTemplate.opsForZSet().add(setname,"张三",77);
        stringRedisTemplate.opsForZSet().add(setname,"李四",88);
        stringRedisTemplate.opsForZSet().add(setname,"王五",45);
    }
    @Test
    void test3(){
        stringRedisTemplate.opsForValue().set("名字","张三");
    }
    @Test
    void test04(){
        redisTemplate.opsForValue().set("jues",new Person("张三",23,"男"));
    }
}
