package com.github.theresajayne.jewelry.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Theresa on 12/09/2015.
 */
@Controller
public class HomeController {
    @RequestMapping(value = {"/","/home"})
    public String home() {
        System.out.println("HomeController Passing through....");
        return "index";
    }

}
