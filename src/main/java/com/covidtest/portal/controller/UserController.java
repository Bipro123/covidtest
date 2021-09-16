package com.covidtest.portal.controller;

import com.covidtest.portal.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @PostMapping("user/registerUser/")
    public Long registerUser(User user)
    {

        return null;

    }
}
