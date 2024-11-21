package com.example.user_service.servicelayer;

import com.example.user_service.entity.User;
import jakarta.annotation.PostConstruct;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class Services {

    //private static final Logger logger = (Logger) LoggerFactory.getLogger(Services.class);

   // private User users;
   private final List<User> userList = new ArrayList<>();

    @PostConstruct
    public void createUser() {
        User user = new User();
        user.setUserId(10000);
        user.setUserName("Manoj");
        user.setPlace("Shimoga");
        userList.add(user);
       // logger.info("User created: {}", user);
    }

    public List<User> fetchAll() {
        return new ArrayList<>(userList);
    }

}
