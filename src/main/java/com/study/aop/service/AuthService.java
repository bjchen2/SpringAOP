package com.study.aop.service;

import com.study.aop.security.CurrentUserHolder;
import org.springframework.stereotype.Service;

/**
 * Created By Cx On 2018/5/19 18:23
 */
@Service
public class AuthService {

    public void checkAccess(){
        String user = CurrentUserHolder.get();
        if (!"admin".equals(user)) {
            throw new RuntimeException("非管理员不能进行该操作！！！");
        }
    }
}
