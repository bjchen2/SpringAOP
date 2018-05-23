package com.study.aop.log;

import com.study.aop.bean.Product;
import org.springframework.stereotype.Service;

/**
 * Created By Cx On 2018/5/22 12:20
 */
@Service
public class LogService implements Loggable {
    @Override
    public void log() {
        System.out.println("Log from LogService");
    }

    public void annArg(Product product){
        System.out.println("execute annArg from LogService");
    }
}
