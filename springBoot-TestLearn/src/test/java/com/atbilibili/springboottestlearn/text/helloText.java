package com.atbilibili.springboottestlearn.text;

import com.atbilibili.springboottestlearn.service.helloService;
import com.atbilibili.springboottestlearn.service.sumService;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class helloText {
    @Autowired
    private helloService hs;
    @Autowired
    private sumService ss;
    @Test
    @DisplayName("😱")
    public void text1(){
        hs.sayHello();
    }
    @AfterAll
    static void text2(){
        System.out.println("afterAll");
    }
    @AfterEach
     void say(){
        System.out.println("AfterEatch");
    }
    @BeforeAll
    static void text3(){
        System.out.println("beforeAll");
    }
  /*  @ParameterizedTest
    public void text3(int a,int b){
        System.out.println(a+b);
    }*/
    @Test
        public void text(){
            int sum=ss.sum(1,2);
            Assertions.assertEquals(3,sum);
        }
    @ParameterizedTest
    @ValueSource(strings = {"one", "two", "three"})
    @DisplayName("参数化测试1")
    public void parameterizedTest1(String string) {
        System.out.println(string);
        Assertions.assertTrue(StringUtils.isNotBlank(string));
    }
}
