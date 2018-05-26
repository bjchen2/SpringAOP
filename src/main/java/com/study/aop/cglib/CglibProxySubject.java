package com.study.aop.cglib;


import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib代理模式的实现
 * Created By Cx On 2018/5/24 14:06
 */
public class CglibProxySubject implements MethodInterceptor {

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object res = null;
        System.out.println("cglib proxy start");
        try {
            res = methodProxy.invokeSuper(o,objects);
        }catch (Exception e){
            System.out.println("ex:"+e.getMessage());
        }finally {
            System.out.println("cglib proxy end");
        }
        return null;
    }
}
//陈相 傻逼  我草泥马
//周嫂 叶嫂
//龟龟
