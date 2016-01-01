package com.github.theresajayne.jewelry.controllers;

import com.github.theresajayne.jewelry.dao.CategoryDao;
import com.github.theresajayne.jewelry.entity.Category;
import com.github.theresajayne.jewelry.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Theresa on 12/09/2015.
 */
@Controller
public class AdminController
{

    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = "/admin",method = RequestMethod.GET)
    public ModelAndView admin()
    {
        System.out.println("Admin Controller");
        List<Category> list = categoryService.getAllCategories();

        //show admin page
        ModelAndView model = new ModelAndView("admin");
        model.addObject("lists", list);

        return model;
    }

}
