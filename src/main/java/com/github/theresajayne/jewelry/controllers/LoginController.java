package com.github.theresajayne.jewelry.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Login Controller
 * Created by Theresa on 12/09/2015.
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/login")
    public String login()
    {
        System.out.println("Login Processor");
        return "login";
    }
}
