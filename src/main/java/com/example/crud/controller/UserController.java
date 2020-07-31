package com.example.crud.controller;

import com.example.crud.model.User;
import com.example.crud.service.SecurityService;
import com.example.crud.service.UserService;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;
    private final SecurityService securityService;

    public UserController(UserService userService, SecurityService securityService) {
        this.userService = userService;
        this.securityService = securityService;
    }

    @PostMapping("/registration")
    public String registration(@RequestBody User user) {
        userService.save(user);
        return "user registered";
    }
}
