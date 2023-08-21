package com.atbilibili.springboottestlearn.service;

import org.springframework.stereotype.Service;

@Service
public class sumService {
    public int sum(Integer a,Integer b){
        return a+b;
    }
}
