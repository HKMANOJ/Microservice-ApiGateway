package com.example.user_service.controller;

import com.example.user_service.entity.User;
import com.example.user_service.servicelayer.Services;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user-service")
public class Controller {

    private final Services service;



    public Controller(Services service) {
        this.service = service;
    }


    @GetMapping("/getall")
    public List<User> getall(){
        return service.fetchAll();
    }

}
