package com.connection.details.connectiondemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private UserRepository repo;

    @PostMapping("/users")
    public User addUser(@RequestBody User user) {

        return this.repo.save(user);
    }

    @GetMapping("/users")
    public Iterable<User> getUser() {

        return this.repo.findAll();
    }
}
