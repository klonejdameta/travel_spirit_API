package com.project.travel_spirit_api.controller;

import com.project.travel_spirit_api.service.UsersService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/users")
public class UsersController {

    protected UsersService usersService;
}