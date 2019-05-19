package com.chen.springboot.controller;

import com.chen.springboot.entity.User;
import com.chen.springboot.entity.UserMapper;
import com.chen.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class UserAction {
    @Autowired
    public UserService userService;
    @Autowired
    public UserMapper userMapper;


    @RequestMapping("/register")
    public void register (){
        User user = new User();
        user.setUserName("weibo");
        user.setUserPassword("wetwet");
        user.setUserMail("1081@163.com");
        user.setUserPhone(15787879L);
        int result = userMapper.insert(user);
        System.out.println("hello:"+result);
        try{
            //response.getWriter().write("hello");
        }catch (Exception e) {

        }
    }
}
