package com.lgy.spingcloud.controller;

import com.lgy.springcloud.dto.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @RequestMapping(value = "/selectUser",method = RequestMethod.GET)
    public User  selectUser(){
        User user = new User("lgy548","548548","微信给的我不知道");
        return user;
    }
}
