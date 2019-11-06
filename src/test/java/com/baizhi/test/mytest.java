package com.baizhi.test;

import com.baizhi.Application;
import com.baizhi.Service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class mytest {

    @Autowired
    private UserService userService;

    @Test
    public void test1(){
        userService.regist();
        userService.regist("12","1212");
    }


}
