package com.study.aop.service;

import com.study.aop.security.CurrentUserHolder;
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

    @Test
    public void insert() {
        CurrentUserHolder.set("ss");
        productService.delete(1L);
    }

    @Test
    public void delete() {
    }
}