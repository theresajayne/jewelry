package com.github.theresajayne.jewelry.controllers;

import com.github.theresajayne.jewelry.entity.Category;
import com.github.theresajayne.jewelry.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Theresa on 12/09/2015.
 */
@Controller
public class HomeController {

    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = {"/","/home"})
    public ModelAndView home() {

        List<Category> list = categoryService.getAllCategories();

        ModelAndView model = new ModelAndView("index");
        model.addObject("lists",list);
        return model;
    }

}
