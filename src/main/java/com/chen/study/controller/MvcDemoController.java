package com.chen.study.controller;

import com.chen.study.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MvcDemoController {

    @GetMapping("/mvchello")
    public ModelAndView hello(){
        User user = new User();
        user.setId(100);
        user.setName("anna");
        user.setAge(18);

        ModelAndView modelAndView = new ModelAndView("mvcdemo");
        modelAndView.addObject("user",user);
        return modelAndView;
    }
}
