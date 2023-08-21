package com.atbilibili.ssm.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;


//发出事件
@Service
public class EventPublisher implements ApplicationEventPublisherAware/*, ApplicationEventMulticaster*/ {
    ApplicationEventPublisher applicationEventPublisher;
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher=applicationEventPublisher;
    }
    public void sentEvent(ApplicationEvent applicationEvent){
        //publishEvent方法用于发布applicationEvent事件
        applicationEventPublisher.publishEvent(applicationEvent);
    }
}
