package com.atbilibili.springboottestlearn.configeration;

import com.atbilibili.springboottestlearn.controller.hahaController;
import com.atbilibili.springboottestlearn.pojo.robot;
import com.atbilibili.springboottestlearn.service.helloService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import({robot.class, helloService.class, hahaController.class})
@Configuration
public class myCOnfigeration {
}
