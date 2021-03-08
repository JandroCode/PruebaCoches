package com.example.clevercoches.controllers;

import com.example.clevercoches.models.dao.ICocheDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CocheController {

    @Autowired
    private ICocheDAO cocheDAO;

    @GetMapping("/")
    public String home(Model model){
        model.addAttribute("coches", cocheDAO.findAll());
        return "home";
    }
    
}
