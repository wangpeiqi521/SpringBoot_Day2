package com.baizhi.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Component
@Aspect
@Order(55)
public class MyAspect {

    @Before("execution(* com.baizhi.Service..*.regist(String,..))")
    public void before(JoinPoint joinPoint){
        System.out.println("我是前置通知");
        /*System.out.println(joinPoint.getSignature().getName());
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            System.out.println(arg);
        }
        Object target = joinPoint.getTarget();
        System.out.println(target.getClass());*/
    }

   /* @After("execution(* com.baizhi.Service..*.regist(String,..))")
    public void after(JoinPoint joinPoint){
        System.out.println("我是后置通知");
        System.out.println(joinPoint.getSignature().getName());
        Object[] args = joinPoint.getArgs();
        for (Object arg : args) {
            System.out.println(arg);
        }
        Object target = joinPoint.getTarget();
        System.out.println(target.getClass());
    }*/

   /* @Around("execution(* com.baizhi.Service..*.regist(String,..))")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("我是环绕通知");
        Object ret = proceedingJoinPoint.proceed();
        System.out.println(proceedingJoinPoint.getSignature().getName());
        Object[] args = proceedingJoinPoint.getArgs();
        for (Object arg : args) {
            System.out.println(arg);
        }
        Object target = proceedingJoinPoint.getTarget();
        System.out.println(target.getClass());
        System.out.println("我是原始方法执行之后执行的");
        return ret;
    }*/

    /*@AfterThrowing("execution(* com.baizhi.Service..*.regist(String,..))")
    public void myexception(){
        System.out.println("我是出现异常执行的方法");
    }*/
}
