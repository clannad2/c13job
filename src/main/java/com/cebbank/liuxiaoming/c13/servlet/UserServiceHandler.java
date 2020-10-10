package com.cebbank.liuxiaoming.c13.servlet;

import com.cebbank.liuxiaoming.c13.bean.User;
import com.cebbank.liuxiaoming.c13.service.impl.UserServiceImpl;
import com.cebbank.liuxiaoming.c13.service.interfaceforservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Map;
@SessionAttributes(value = {"user"},types = User.class)
@Controller
public class UserServiceHandler {
    @Autowired
    UserService userService;

    @RequestMapping("/tologin")
    public String login(User user, Map<String,Object> map){
       // System.out.println(user);
        User result = userService.login(user);
        if (result != null){
            map.put("user",result);
            return "redirect:loadingfilm";
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
