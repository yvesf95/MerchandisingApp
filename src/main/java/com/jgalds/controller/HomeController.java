package com.jgalds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Admin on 5/4/2017.
 */

@Controller
public class HomeController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model){
//        model.addAttribute("name", "Yves");
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }
}
