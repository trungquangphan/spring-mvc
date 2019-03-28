package vn.codegymdanang.service;


import org.springframework.beans.factory.annotation.Autowired;
import vn.codegymdanang.model.BaseProduct;

import java.util.Arrays;
import java.util.List;

public class ProductServiceImpl2 implements ProductService{

    /***
     * ProductServiceImpl2 is not managed by Spring then baseProduct will be null here
     */
    @Autowired
    private BaseProduct baseProduct;

    @Override public List<String> getProducts() {
        return Arrays.asList("1","2","3");
    }
}
