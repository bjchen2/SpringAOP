package com.study.aop.service;

import com.study.aop.anno.AdminOnly;
import com.study.aop.anno.NeedSecured;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created By Cx On 2018/5/19 18:12
 */
@NeedSecured
@Service
public class ProductService {

    @AdminOnly
    public String getName() {
        System.out.println("execute getName");
        return "product service";
    }

    public void exDemo() throws IllegalAccessException{
        System.out.println("execute exDemo");
    }

    public void findById(Long id) {
        System.out.println("execute findById");
    }

    public void findByTwoArgs(Long id, String name) {
        System.out.println("execute findByTwoArgs");
    }

}
