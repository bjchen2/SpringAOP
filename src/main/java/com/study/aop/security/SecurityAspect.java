package com.study.aop.security;

import com.study.aop.service.AuthService;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 *
 * Created By Cx On 2018/5/19 18:30
 */
@Aspect
@Component
public class SecurityAspect {
    @Autowired
    AuthService authService;

    //表示使用所有AdminOnly注解的方法
    //execution(* com.study.aop.service.ProductService(..))
    @Pointcut("@annotation(AdminOnly)")
    public void adminOnly(){}

    //表示adminOnly()方法定义的切点运行之前执行该方法
    @Before("adminOnly()")
    public void check(){
        authService.checkAccess();
        System.out.println("hello boy!!!!!");
    }
}
