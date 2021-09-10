package com.DevLomoSE.SBWeb.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * IndexController at: src/main/java/com/DevLomoSE/SBWeb/app/controllers
 * Created by @DevLomoSE at 10/9/21 15:07.
 */
@Controller
@RequestMapping
public class IndexController {

    @GetMapping({"/index", "/"})
    public String showIndex(Model model){
        model.addAttribute("titulo", "Index Controller");
        return "index";
    }

    @GetMapping({"/home"})
    public ModelAndView showHome(ModelAndView modelAndView){
        modelAndView.addObject("titulo", "Index Controller");
        modelAndView.addObject("encabezado", "Hola Spring");
        modelAndView.setViewName("index");
        return modelAndView;
    }

}
