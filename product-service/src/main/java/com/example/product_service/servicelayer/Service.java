package com.example.product_service.servicelayer;

import com.example.product_service.entity.Product;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Service {


    private final List<Product> proctlist = new ArrayList<>();

    @PostConstruct
    public void createUser() {
        Product product = new Product();

        product.setProductArea("Shimoga");
        product.setProductName("Mobile");
        product.setProductID(89943);
        proctlist.add(product);
    }

    public List<Product> fetchAll() {
        return new ArrayList<>(proctlist);
    }
}
