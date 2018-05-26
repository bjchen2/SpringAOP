package com.study.aop.pattern;

/**
 * Created By Cx On 2018/5/24 9:28
 */
//被代理对象
public class RealSubject implements Subject{

    @Override
    public void request() {
        System.out.println("I'm realSubject!!!");
    }
}
