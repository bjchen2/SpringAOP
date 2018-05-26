package com.study.aop.jdkDynamic;

import com.study.aop.pattern.RealSubject;
import com.study.aop.pattern.Subject;

import java.lang.reflect.Proxy;

/**
 * Created By Cx On 2018/5/24 9:43
 */
public class Client {

    public static void main(String[] args) {
        /**
         *  参数一loader：被代理类的加载器
         · 参数二interfaces：被代理类实现的所有接口
         · 参数三handler：自己实现的InvocationHandler的实现类的对象，即要做什么操作就传入增加什么操作的h
         返回Object表示已被代理的实例
         */
        Subject subject = (Subject) Proxy.newProxyInstance(RealSubject.class.getClassLoader(),RealSubject.class.getInterfaces(),
                new JdkProxySubject(new RealSubject()));
        subject.request();
    }
}
