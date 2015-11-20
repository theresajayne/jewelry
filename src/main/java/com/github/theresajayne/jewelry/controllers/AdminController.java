package com.github.theresajayne.jewelry.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Theresa on 12/09/2015.
 */
@Controller
public class AdminController
{


    @RequestMapping(value = "/admin")
    public String admin()
    {
        System.out.println("Admin Controller");
        return "admin";
    }

}
