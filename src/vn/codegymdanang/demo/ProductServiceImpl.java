package vn.codegymdanang.demo;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceImpl implements ProductService {
    @Override public List<String> getProducts() {
        List<String> products = new ArrayList<>();
        products.add("bmw");
        products.add("toyota");
        return products;
    }
}
