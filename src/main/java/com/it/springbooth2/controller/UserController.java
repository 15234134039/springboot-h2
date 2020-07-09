package com.it.springbooth2.controller;

import com.it.springbooth2.entity.User;
import com.it.springbooth2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author gxp
 * @version 1.0
 * @date 2020/6/29 10:57
 */
@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @ResponseBody
    @RequestMapping("/findAll")
    public List<User> findAll(){
        return userRepository.findAll();
    }
}
