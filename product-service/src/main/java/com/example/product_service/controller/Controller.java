package com.example.product_service.controller;

import com.example.product_service.entity.Product;
import com.example.product_service.servicelayer.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product")
public class Controller {

    private final Service serviceLayer;

    public Controller(Service serviceLayer) {
        this.serviceLayer = serviceLayer;
    }


    @GetMapping("/getall")
    public List<Product> getall(){
        return serviceLayer.fetchAll();
    }
}
