package com.cebbank.liuxiaoming.c13.servlet;

import com.cebbank.liuxiaoming.c13.bean.User;
import com.cebbank.liuxiaoming.c13.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserServiceHandler {
    @Autowired
    UserService userService;

    @RequestMapping("/tologin")
    public String login(User user){
        System.out.println(user);
        Boolean login = userService.login(user);
        if (login){
            return "login_success";
        }
       return "login";
    }

    @RequestMapping("/toregister")
    public String register(User user){
        System.out.println(user);
        String userName = user.getUserName();
        Boolean ifExist = userService.ifExist(userName);

        if (ifExist){
            return "register_error";
        }

        Boolean register = userService.register(user);
        if (register){
            return "register_success";
        }
        return "register_error";
    }
}
