package com.jgalds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Admin on 5/12/2017.
 */

@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @RequestMapping(value = "/")
    public String index(Model model){
        model.addAttribute("username", "Hello World");
        return "index";
    }
}
