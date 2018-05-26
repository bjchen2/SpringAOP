package com.study.aop.chainNormal;

/**
 * 普通链式实现
 * Created By Cx On 2018/5/26 22:20
 */
public abstract class Handler {

    private Handler sucessor;

    public Handler getSucessor() {
        return sucessor;
    }

    public void setSucessor(Handler sucessor) {
        this.sucessor = sucessor;
    }

    protected abstract void handleProcess();

    public void execute(){
        this.handleProcess();
        if (sucessor != null) sucessor.execute();
    }

}
