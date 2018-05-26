package com.study.aop.chainNormal;

/**
 * 普通链式实现方法
 * Created By Cx On 2018/5/26 22:23
 */
public class Client {
    static class HandlerA extends Handler{
        @Override
        protected void handleProcess() {
            System.out.println("I'm HandlerA");
        }
    }

    static class HandlerB extends Handler{
        @Override
        protected void handleProcess() {
            System.out.println("I'm HandlerB");
        }
    }

    static class HandlerC extends Handler{
        @Override
        protected void handleProcess() {
            System.out.println("I'm HandlerC");
        }
    }

    public static void main(String[] args) {
        Handler handlerA = new HandlerA();
        Handler handlerB = new HandlerB();
        //每次都需要设置这样的从属关系，于是有了责任链模式，封装这段代码
        handlerB.setSucessor(new HandlerC());
        handlerA.setSucessor(handlerB);
        handlerA.execute();
    }

}
