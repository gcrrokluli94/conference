package com.pluralsight.conference.controller;

import com.pluralsight.conference.model.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {

    @GetMapping("/user")
    public User getUser(@RequestParam(value = "firstname", defaultValue = "Rrok") String firstname,
                        @RequestParam(value = "lastname", defaultValue = "Luli") String lastname,
                        @RequestParam(value = "age", defaultValue = "27") int age){
        User user = new User();
        user.setFirstName(firstname);
        user.setLastName(lastname);
        user.setAge(age);
        return user;
    }

    @PostMapping("/user")
    public User postUser(User user){
        System.out.println("User firstName:"  + user.getFirstName());
        return user;
    }

}
