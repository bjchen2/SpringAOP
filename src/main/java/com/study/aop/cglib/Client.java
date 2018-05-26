package com.study.aop.cglib;

import com.study.aop.pattern.ProxySubject;
import com.study.aop.pattern.RealSubject;
import com.study.aop.pattern.Subject;
import org.springframework.cglib.proxy.Enhancer;

/**
 * Created By Cx On 2018/5/24 20:35
 */
public class Client {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealSubject.class);
        //设置回调函数
        enhancer.setCallback(new CglibProxySubject());
        //返回代理类实例
        Subject subject = (Subject) enhancer.create();
        subject.request();
    }
}
