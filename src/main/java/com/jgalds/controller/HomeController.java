package com.jgalds.controller;

import com.jgalds.model.Account;
import org.springframework.security.core.context.SecurityContextHolder;
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
    public String index(){
        return "index";
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    public String getProducts(){
        return "products";
    }

    @RequestMapping(value = "/error403", method = RequestMethod.GET)
    public String errorPage(){
        return "error403";
    }

}
