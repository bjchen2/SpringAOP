package com.study.aop.config;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created By Cx On 2018/5/22 23:28
 */
@Aspect
@Component
public class AdviceConfig {
    @Pointcut("@annotation(com.study.aop.anno.AdminOnly)")
    public void matchAnno(){}
    @Pointcut("execution(* *..find*(Long,..))")
    public void matchLongArg(){}
    @Pointcut("execution(* *..*(..)throws IllegalAccessException)")
    public void matchException(){}
    @Pointcut("execution(String com.*..*(..))")
    public void matchReturn(){}
    @Pointcut("execution(* com.*..*(..))")
    public void matchAll(){}

//    @Around("matchReturn()")
//    public void around(ProceedingJoinPoint joinPoint){
//        try{
//            Object res = joinPoint.proceed(joinPoint.getArgs());
//            System.out.println("==========return data:"+res);
//        } catch (Throwable throwable) {
//            throwable.printStackTrace();
//        } finally {
//            System.out.println("===========finally================");
//        }
//    }

//    @Before("matchLongArg() && args(ww,..)")
//    public void before(long ww){
//        System.out.println("==========the data:"+ww);
//    }

//    @AfterReturning(value = "matchReturn()",returning = "abc")
//    public void after(Object abc){
//        System.out.println("=================");
//    }
}
