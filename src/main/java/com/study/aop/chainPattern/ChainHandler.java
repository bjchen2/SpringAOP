package com.study.aop.chainPattern;

/**
 * Created By Cx On 2018/5/26 23:03
 */
public abstract class ChainHandler {

    public void execute(Chain chain){
        handleProcess();
        chain.proceed();
    }

    protected abstract void handleProcess();
}
