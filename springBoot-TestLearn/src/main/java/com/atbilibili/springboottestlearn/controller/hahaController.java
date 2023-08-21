package com.atbilibili.springboottestlearn.controller;

import com.atbilibili.springboottestlearn.service.helloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hahaController {
    @Autowired
    private helloService hs;
    @GetMapping("/haha")
    @ResponseBody
    public String aa(){
        String say = hs.say();
        return say;
    }
}
