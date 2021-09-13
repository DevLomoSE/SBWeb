package com.DevLomoSE.SBWeb.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * HomeController at: src/main/java/com/DevLomoSE/SBWeb/app/controllers
 * Created by @DevLomoSE at 13/9/21 9:35.
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String home(){
        return "redirect:/app/";
    }

    @GetMapping("/home")
    public String home2(){
        return "forward:/app/";
    }

}
