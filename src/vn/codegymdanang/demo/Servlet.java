package vn.codegymdanang.demo;

import java.util.List;

public class Servlet {
    public static void main(String[] args) {
        ProductService productService = ProductServiceFactory.getProductService("ProductServiceImpl2");

        List<String> products = productService.getProducts();

        for (String product : products) {
            System.out.println(product);
        }
    }
}
