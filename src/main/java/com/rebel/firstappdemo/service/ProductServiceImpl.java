package com.rebel.firstappdemo.service;

import com.rebel.firstappdemo.domain.Product;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Service
public class ProductServiceImpl implements ProductService {
    private static Map<String, Product> productRepo = new HashMap<>();
    static {
        Product honey = new Product();
        honey.setId("1");
        honey.setName("Hello");
        productRepo.put(honey.getId(),honey);

        Product awesome = new Product();
        awesome.setId("2");
        awesome.setName("Awesome");
        productRepo.put(awesome.getId(),awesome);
    }

    @Override
    public void createProduct(Product product) {
        productRepo.put(product.getId(),product);
    }

    @Override
    public void updateProduct(String id, Product product) {
        productRepo.remove(id);
        product.setId(id);
        productRepo.put(id,product);
    }

    @Override
    public void deleteProduct(String id) {
        productRepo.remove(id);
    }

    @Override
    public Collection<Product> getProducts() {
        return productRepo.values();
    }
}
