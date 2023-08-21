package com.atbilibili.ssm;

import com.atbilibili.springboottestlearn.annotation.Myannotation;
import com.atbilibili.springboottestlearn.configeration.myCOnfigeration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

@MapperScan(basePackages = "com.atbilibili.ssm.mapper")
@SpringBootApplication
/*@Myannotation*/
/*@Import(myCOnfigeration.class)*/
public class SsmApplication {
    public static void main(String[] args) {
        SpringApplication.run(SsmApplication.class,args);
        //new SpringApplicationBuilder().sources(SsmApplication.class).run(args);
    }
}
