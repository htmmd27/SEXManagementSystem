package com.example.demo.controller;

import com.example.demo.entity.User;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@ResponseBody
public class LogInController {
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public LoginBean logIn(@RequestBody User user){
        //待编辑
        long userName = user.getAccount();
        //
        //
        //
        LoginBean loginBean = new LoginBean();
        return loginBean;
    }



    private String getStatus(int number) {
        switch (number) {
            case 0:
                return "staff";
            case 1:
                return "department_manager";
            case 2:
                return "deputy_general_manager";
            case 3:
                return "general_manager";
            default:
                return "error";
        }
    }
}

class LoginBean {
    private boolean result;
    private String status;

    public void setResult(boolean result) {
        this.result = result;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public boolean getResult() {
        return result;
    }

}