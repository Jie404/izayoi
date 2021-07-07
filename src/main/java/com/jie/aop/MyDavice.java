package com.jie.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Aspect
@Repository
public class MyDavice {

    @Pointcut("execution(* com.jie.service.*Service.*(..))")
    public void all(){

        System.out.println("第二次");
    }

    //前置通知
    @Before("all()")
    public void before() {
        System.out.println("--前置通知--");
    }

    //后置通知; 如果出现异常,不会调用
    @AfterReturning("all()")
    public void afterReturning() {
        System.out.println("--后置通知--");
    }
    // 环绕通知<较特殊,要手动写调用目标方法>
    @Around("all()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("--环绕通知之前调用");
        Object obj = pjp.proceed();// <调用目标方法>
        System.out.println("--环绕通知之后调用");
        return obj;
    }
    //异常通知; 如果出现异常,就会调用
    @AfterThrowing("all()")
    public void afterException() {
        System.out.println("---出现异常了---");
    }

    //后置通知<无论怎样都会执行的>
    @After("all()")
    public void after() {
        System.out.println("*** 这是无论如何都会执行的代码 ***");
    }

}
