package com.study.aop.pattern;

/**
 * Created By Cx On 2018/5/24 9:29
 */
//代理对象，代理对象和目标对象必须实现同一个接口(这样才能保证目标对象的方法在代理对象中也存在)
public class ProxySubject implements Subject{

    private RealSubject realSubject;

    public ProxySubject(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public void request() {
        System.out.println("proxy start");
        try {
            realSubject.request();
        }catch (Exception e){
            System.out.println("ex:"+e.getMessage());
            throw e;
        }finally {
            System.out.println("proxy end");
        }
    }
}
