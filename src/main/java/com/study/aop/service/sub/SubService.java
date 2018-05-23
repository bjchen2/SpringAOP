package com.study.aop.service.sub;

import com.study.aop.service.ProductService;
import org.springframework.stereotype.Service;

/**
 * Created By Cx On 2018/5/21 23:18
 */
@Service
public class SubService extends ProductService{

    public void demo(){
        System.out.println("execute subService demo");
    }
}
