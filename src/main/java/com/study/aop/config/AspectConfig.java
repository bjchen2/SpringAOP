package com.study.aop.config;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created By Cx On 2018/5/21 23:23
 */
@Aspect
@Component
public class AspectConfig {

    //TODO execution用法：
    // 匹配所有访问权限为public的 返回值任意 com.study.aop.service及其子包下的 任意类 方法名中间含有By的 任意参数的 方法
//    @Pointcut("execution(public * com.study.aop.service..*.*By*(..))")
//    public void pointOne(){}
//
//    @Before("pointOne()")
//    public void doExecutionAspect(){
//        System.out.println("");
//        System.out.println("==========Execution method==========");
//    }

    //TODO within用法：匹配com.study.aop.service及其子包下Pro开头的类的所有方法
//    @Pointcut("within(com.study.aop.service..Pro*))")
//    public void pointOne(){}
//
//    @Before("pointOne()")
//    public void doExecutionAspect(){
//        System.out.println("");
//        System.out.println("==========within method==========");
//    }


    //TODO　this用法:拦截所有实现 某个接口的类/某个类 被AOP代理后（即包括AOP的introduction定义的方法） 的所有方法
//    @Pointcut("this(com.study.aop.log.Loggable)")
//    public void pointOne(){}
//
//    @Before("pointOne()")
//    public void doExecutionAspect(){
//        System.out.println("");
//        System.out.println("==========this method==========");
//    }

    //TODO　target用法:拦截所有实现 某个接口的类/某个类 的所有方法
//    @Pointcut("target(com.study.aop.log.LogService)")
//    public void pointOne(){}
//
//    @Before("pointOne()")
//    public void doExecutionAspect(){
//        System.out.println("");
//        System.out.println("==========target method==========");
//    }

    /**
     *  arget与this的区别：
     *  this能够拦截AOP的introduction定义的方法，而target不行（因为intrduction定义的方法是经过AOP代理过后动态添加的）
     */

    //TODO　bean用法:拦截定义的，被IOC托管的某个类 的所有方法(不能加包名，只要bean名就行)
    //注意：是bean名不是类名，而且bean名默认为首字母小写
    //如：@Service("abc"),则拦截的时候要写abc，无论类名是什么
//    @Pointcut("bean(productService)")
//    public void pointOne(){}
//
//    @Before("pointOne()")
//    public void doExecutionAspect(){
//        System.out.println("");
//        System.out.println("==========bean method==========");
//    }

    //TODO　args用法:拦截所有参数符合定义的方法  且  必须指定需要拦截的类
//    @Pointcut("args(..,Long) && bean(productService)")
//    public void pointOne(){}
//
//    @Before("pointOne()")
//    public void doExecutionAspect(){
//        System.out.println("");
//        System.out.println("==========args method==========");
//    }

    //TODO　@annotation()：拦截所有在方法上使用某注解的方法
//    @Pointcut("@annotation(com.study.aop.anno.AdminOnly)")
//    public void pointOne(){}
//
//    @Before("pointOne()")
//    public void doExecutionAspect(){
//        System.out.println("");
//        System.out.println("==========@annotation method==========");
//    }

    //TODO　@within()：拦截所有在类上使用某注解的所有方法
//    @Pointcut("@within(com.study.aop.anno.NeedSecured)")
//    public void pointOne(){}
//
//    @Before("pointOne()")
//    public void doExecutionAspect(){
//        System.out.println("");
//        System.out.println("==========@within method==========");
//    }

    //TODO　@target()：拦截所有在类上使用某注解的所有方法，必须指出要拦截的类的范围，否则会报错
//    @Pointcut("@target(com.study.aop.anno.NeedSecured) && within(com.study.aop..*)")
//    public void pointOne(){}
//
//    @Before("pointOne()")
//    public void doExecutionAspect(){
//        System.out.println("");
//        System.out.println("==========@target method==========");
//    }

    //TODO　@args()：拦截所有 参数使用了某注解 的方法（必须指出要拦截的类的范围）
//    @Pointcut("@args(com.study.aop.anno.NeedSecured) && within(com.study.aop..*)")
//    public void pointOne(){}
//
//    @Before("pointOne()")
//    public void doExecutionAspect(){
//        System.out.println("");
//        System.out.println("==========@args method==========");
//    }


}
