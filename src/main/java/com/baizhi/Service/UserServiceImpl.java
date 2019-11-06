package com.baizhi.Service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public void regist() {
        System.out.println("我是注册方法");
    }

    @Override
    public void regist(String username, String password) {
        System.out.println("我是带有两个参数的注册方法");
       /* throw new  RuntimeException();*/
    }

    @Override
    public void update() {
        System.out.println("我是修改方法");
    }

    @Override
    public void del() {
        System.out.println("我是删除方法");
    }
}
