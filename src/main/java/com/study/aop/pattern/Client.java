package com.study.aop.pattern;

/**
 * Created By Cx On 2018/5/24 9:32
 */
public class Client {
    public static void main(String[] args) {
        ProxySubject proxySubject = new ProxySubject(new RealSubject());
        proxySubject.request();
    }
}
