package com.study.aop.service;

import com.study.aop.domain.Product;
import com.study.aop.security.AdminOnly;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created By Cx On 2018/5/19 18:12
 */
@Service
public class ProductService {

    @Autowired
    AuthService authService;

    @AdminOnly
    public void insert(Product product){
        System.out.println("Product is added");
    }

    @AdminOnly
    public void delete(Long id){
        System.out.println("Product is deleted");
    }

}
