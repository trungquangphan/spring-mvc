package vn.codegymdanang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import vn.codegymdanang.model.BaseProduct;
import vn.codegymdanang.service.ProductService;
import vn.codegymdanang.service.ProductServiceImpl2;

import java.util.List;

@Controller
public class ProductController {

    //This productService is injected by Spring DI
    @Autowired
    private ProductService productService;


    //This productService2 is managed by developer
    private ProductService productService2 = new ProductServiceImpl2();

    @Autowired
    private BaseProduct baseProduct;

    @RequestMapping(value = "/product", method = RequestMethod.GET)
    public ModelAndView greeting(){
        List<String> products2 = productService2.getProducts();
        List<String> products = productService.getProducts();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("product");
        mv.addObject("products", products);
        return mv;
    }
}
