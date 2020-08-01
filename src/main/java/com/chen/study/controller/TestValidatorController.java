package com.chen.study.controller;

import com.chen.study.entity.ValiUser;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class TestValidatorController {

    @GetMapping("/test")
    public String showForm(ValiUser user){
        return "form";
    }

    @GetMapping("/results")
    public String results(){
        return "results";
    }

    @PostMapping("/test")
    public String checkUser(@Valid ValiUser user1, BindingResult bindingResult, RedirectAttributes attr){
        if (bindingResult.hasErrors()){
            return "form";
        }
        attr.addFlashAttribute("user1",user1);
        return "redirect:/results";
    }



}
