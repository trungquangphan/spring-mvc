package vn.codegymdanang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.codegymdanang.model.BaseProduct;

import java.util.Arrays;
import java.util.List;

//Annotation: @Controller, @Service, @Component....
@Service("productService")
public class ProductServiceImpl implements ProductService{

    /***
     * ProductServiceImpl is managed by Spring, then Spring is able to inject baseProduct here
     */
    @Autowired
    private BaseProduct baseProduct;

    @Override public List<String> getProducts() {
        System.out.println("Using ProductServiceImpl");
        return Arrays.asList("toyota","bmw","mercedes");
    }
}
