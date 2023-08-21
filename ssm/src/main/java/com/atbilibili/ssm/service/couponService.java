package com.atbilibili.ssm.service;

import com.atbilibili.ssm.eneity.userEntity;
import com.atbilibili.ssm.event.LoginEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class couponService {
    @EventListener()
    public void aa(LoginEvent loginEvent){
        userEntity source = (userEntity) loginEvent.getSource();
        String username = source.getUsername();
        sentCoupon(username);
    }
    public void sentCoupon(String username){
        System.out.println("放发随机优惠");
    }
}
