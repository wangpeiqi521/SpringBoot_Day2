package com.baizhi.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Order(0)
public class MyOrder {

    @Before("execution(* com.baizhi.Service..*.regist(String,..))")
    public void before(JoinPoint joinPoint){
        System.out.println("我是前置通知++++++++++++++++");
    }
}
