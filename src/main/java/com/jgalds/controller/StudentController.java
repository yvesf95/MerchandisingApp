package com.jgalds.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Admin on 5/12/2017.
 */

@Controller
@RequestMapping(value = "/student")
public class StudentController {

    @RequestMapping(value = "/")
    public String index(){
        return "student/index";
    }
}
