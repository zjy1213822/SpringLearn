package com.atbilibili.ssm.service;

import com.atbilibili.ssm.eneity.userEntity;
import com.atbilibili.ssm.event.LoginEvent;
import org.springframework.boot.BootstrapRegistryInitializer;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements ApplicationListener<LoginEvent> {
    public void addCountScore(String username){
        System.out.println("积分加一");
    }


    @Override
    public void onApplicationEvent(LoginEvent event) {
        userEntity source = (userEntity) event.getSource();
        String username = source.getUsername();
        addCountScore(username);
    }
}
