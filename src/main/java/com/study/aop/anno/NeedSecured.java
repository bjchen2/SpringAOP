package com.study.aop.anno;

import java.lang.annotation.*;

/**
 * Created By Cx On 2018/5/22 22:21
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Inherited
public @interface NeedSecured {
}
