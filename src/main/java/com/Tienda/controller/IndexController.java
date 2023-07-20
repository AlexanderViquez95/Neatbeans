/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.Tienda.controller;

import com.Tienda.dao.UsuarioDao;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author alexj
 */
@Controller
public class IndexController {
 
    @Autowired
    UsuarioDao usuarioDao;
    
    
    
    @RequestMapping("/url")
    public String page(Model model, HttpSession session) {
        String imagen = (String) session.getAttribute("usuarioImagen");
        model.addAttribute("avatar", imagen);

        return "index";
    }
    
}
