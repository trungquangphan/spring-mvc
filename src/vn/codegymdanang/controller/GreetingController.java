//package vn.codegymdanang.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.servlet.ModelAndView;
//import vn.codegymdanang.service.ProductService;
//
//import java.util.List;
//
//@Controller
//@RequestMapping(value = "/greeting")
//public class GreetingController {
//
//    @Autowired
//    @Qualifier("productService")
//    private ProductService productService3;
//
//    @GetMapping("/")
//    public ModelAndView greeting(){
//        List<String> products = productService3.getProducts();
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("index");
//        mv.addObject("products", products);
//        return mv;
//    }
//
//}
