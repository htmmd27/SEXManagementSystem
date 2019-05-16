package com.example.demo.controller;

import com.example.demo.entity.LogInBean;
import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@ResponseBody
public class LogInController {
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public LogInBean logIn(@RequestBody User user){

        String userName = user.getId();
        String password = user.getPassword();
        //Todo
        LogInBean loginBean = new LogInBean();
        User userLocated = new User();
        if(user == null){

        }
        return loginBean;
    }

}

