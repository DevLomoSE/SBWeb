package com.DevLomoSE.SBWeb.app.controllers;

import com.DevLomoSE.SBWeb.app.domain.Usuario;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 * IndexController at: src/main/java/com/DevLomoSE/SBWeb/app/controllers
 * Created by @DevLomoSE at 10/9/21 15:07.
 */
@Controller
@RequestMapping("/app")
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

    @GetMapping("/perfil")
    public String showPerfil(Model model){

        Usuario usuario = new Usuario();
        usuario.setNombre("Jonathan Cristobal");
        usuario.setApellido("Guzmán Guadarrama");

        model.addAttribute("usuario", usuario);
        model.addAttribute("titulo", false);

        return "usuarios/perfil";
    }

    @GetMapping("/usuarios")
    public String showUsuarios(Model model){

        //model.addAttribute("usuarios", usuarios);
        model.addAttribute("titulo", "Usuarios");

        return "usuarios/lista";
    }

    @GetMapping("/usuario")
    public String retrieveUser(@RequestParam String texto, Model model){
        model.addAttribute("titulo", "Ver Usuario");
        model.addAttribute("encabezado", "Detalle del usuario");
        model.addAttribute("request_param", texto);

        return "usuarios/detalle";
    }

    @ModelAttribute("usuarios")
    public List<Usuario> populateUserS(){
        List<Usuario> usuarios = new ArrayList<>();

        Usuario usuario = new Usuario();
        usuario.setNombre("Jonathan Cristobal");
        usuario.setApellido("Guzmán Guadarrama");

        usuarios.add(usuario);

        return usuarios;
    }

    @ModelAttribute("usuario")
    public Usuario fillUser(){
        Usuario usuario = new Usuario();
        usuario.setNombre("Jonathan Cristobal");
        usuario.setApellido("Guzmán Guadarrama");

        return usuario;
    }

}
