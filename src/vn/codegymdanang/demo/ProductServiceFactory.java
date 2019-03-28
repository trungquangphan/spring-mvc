package vn.codegymdanang.demo;

public class ProductServiceFactory {

    public static ProductService getProductService(String nameOfService) {
        if ("ProductServiceImpl2".equals(nameOfService)) {
            return new ProductServiceImpl2();
        }
        return new ProductServiceImpl();
    }

    public static ProductService getProductService() {
        return getProductService("");
    }
}
