package com.study.aop.service;

import com.study.aop.bean.Product;
import com.study.aop.log.LogService;
import com.study.aop.service.sub.SubService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

/**
 * Created By Cx On 2018/5/19 18:50
 */
@SpringBootTest
@RunWith(SpringJUnit4ClassRunner.class)
public class ProductServiceTest {

    @Autowired
    ProductService productService;
    @Autowired
    SubService subService;
    @Autowired
    LogService logService;

    @Test
    public void testAll() throws Exception {
        productService.getName();
        productService.exDemo();
        productService.findById(22L);
        productService.findByTwoArgs(22L,"boy");
        subService.demo();
        logService.log();
        logService.annArg(new Product());
    }

}