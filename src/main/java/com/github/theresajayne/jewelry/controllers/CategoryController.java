package com.github.theresajayne.jewelry.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by Theresa on 28/12/2015.
 */
@Controller
public class CategoryController
{


    @RequestMapping(value = {"/category/{categoryName}"},method = RequestMethod.GET)
    public ModelAndView displayCategory(@PathVariable String categoryName)
    {
        return new ModelAndView("product");
    }

}
