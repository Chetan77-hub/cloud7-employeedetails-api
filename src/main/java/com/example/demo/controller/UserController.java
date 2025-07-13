package com.example.demo.controller;

import com.example.demo.model.User;
import com.example.demo.repository.UserMongoRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserMongoRepository userMongoRepository;
    private final Logger logger = LoggerFactory.getLogger(UserController.class);

    public UserController(UserMongoRepository userMongoRepository) {
        this.userMongoRepository = userMongoRepository;
    }

    @GetMapping
    public List<User> getAllUsers() {
        logger.info("Fetching all users");
        return uuserMongoRepository.findAll();
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        logger.info("Creating user: {}", user.getName());
        return userMongoRepository.save(user);
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Integer id) {
        logger.info("Fetching user with id: {}", id);
        return userMongoRepository.findById(String.valueOf(id)).orElse(null);
}
}
