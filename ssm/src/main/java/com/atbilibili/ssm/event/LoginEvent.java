package com.atbilibili.ssm.event;

import org.springframework.context.ApplicationEvent;

import java.time.Clock;
//自定义事件
public class LoginEvent extends ApplicationEvent {
    public LoginEvent(Object source) {
        super(source);
    }

    public LoginEvent(Object source, Clock clock) {
        super(source, clock);
    }
}
