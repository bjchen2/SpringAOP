package com.study.aop.chainPattern;

import java.util.Arrays;
import java.util.List;

/**
 * 责任链模式实现，Spring在多个AOP代理时便采用这种方式
 * 优点：低耦合,各个ChainHandler之间不需要任何依赖
 * Created By Cx On 2018/5/26 23:00
 */
public class Client {

    static class HandlerA extends ChainHandler{
        @Override
        protected void handleProcess() {
            System.out.println("I'm HandlerA");
        }
    }

    static class HandlerB extends ChainHandler{
        @Override
        protected void handleProcess() {
            System.out.println("I'm HandlerB");
        }
    }

    static class HandlerC extends ChainHandler{
        @Override
        protected void handleProcess() {
            System.out.println("I'm HandlerC");
        }
    }

    public static void main(String[] args) {
        List<ChainHandler> handlers = Arrays.asList(new HandlerA(),new HandlerB(),new HandlerC());
        Chain chain = new Chain(handlers);
        chain.proceed();
    }
}
