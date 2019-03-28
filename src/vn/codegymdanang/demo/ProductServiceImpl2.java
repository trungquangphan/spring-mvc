package vn.codegymdanang.demo;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ProductServiceImpl2 implements ProductService {
    @Override public List<String> getProducts() {
        List<String> products = new CopyOnWriteArrayList<>();
        products.add("bmw");
        products.add("toyota");
        return products;
    }
}
