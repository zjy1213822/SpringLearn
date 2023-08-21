package com.atbilibili.ssm.text;

import com.atbilibili.ssm.service.AccountService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class serviceText {
    @Autowired
    private AccountService accountService;
    @Test
    public void textFirst(){
        accountService.addCountScore("张三");
    }
}
