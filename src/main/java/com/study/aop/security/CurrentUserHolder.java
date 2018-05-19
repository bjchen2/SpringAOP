package com.study.aop.security;

/**
 * Created By Cx On 2018/5/19 18:10
 */
public class CurrentUserHolder {

    //TODO
    //ThreadLocal在这个案例中可以当作String（能解决高并发问题的String）
    private static final ThreadLocal<String> holder = new ThreadLocal<>();

    public static String get(){
        return holder.get();
    }

    public static void set(String user){
        holder.set(user);
    }
}
