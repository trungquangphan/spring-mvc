//package vn.codegymdanang.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.ComponentScan;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.web.servlet.ViewResolver;
//import org.springframework.web.servlet.config.annotation.EnableWebMvc;
//import org.springframework.web.servlet.view.InternalResourceViewResolver;
//import org.springframework.web.servlet.view.JstlView;
//import vn.codegymdanang.service.ProductService;
//import vn.codegymdanang.service.ProductServiceImpl;
//
//@EnableWebMvc
//@Configuration
//@ComponentScan(basePackages = { "vn.codegymdanang" })
//public class AppConfig {
//    @Bean
//    public ViewResolver viewResolver() {
//        InternalResourceViewResolver bean = new InternalResourceViewResolver();
//
//        bean.setViewClass(JstlView.class);
//        bean.setPrefix("/WEB-INF/views/");
//        bean.setSuffix(".jsp");
//
//        return bean;
//    }
//
//    @Bean
//    public ProductService productService() {
//        return new ProductServiceImpl();
//    }
//
//}
