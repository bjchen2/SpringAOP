package com.study.aop.security;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created By Cx On 2018/5/19 18:11
 */
//生命周期: SOURCE 只在源码有效，编译时会丢弃，CLASS 编译时会记录到class中，运行时忽略，RUNTIME 运行时存在，可以通过反射读取。
@Retention(RetentionPolicy.RUNTIME)
// 作用域: CONSTRUCTOR 构造方法声明(表明该注解可以用在构造函数上)，
// FIELD 字段声明，LOCAL_VARIABLE 局部变量声明 ，METHOD 方法声明，PACKAGE 包声明，PARAMETER 参数声明，TYPE 类接口。
@Target(ElementType.METHOD)
public @interface AdminOnly {
}
