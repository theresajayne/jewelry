package com.github.theresajayne.jewelry.controllers;

import com.github.theresajayne.jewelry.entity.Category;
import com.github.theresajayne.jewelry.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by Theresa on 28/12/2015.
 */
@Controller
public class CategoryController
{

    @Autowired
    CategoryService categoryService;

    @RequestMapping(value = {"/category/{categoryName}"},method = RequestMethod.GET)
    public ModelAndView displayCategory(@PathVariable String categoryName)
    {
        Category category = categoryService.getCategory(categoryName);
        System.out.println("Category Name="+categoryName+" Category = "+category);
        ModelAndView model = new ModelAndView("product");
        model.addObject("category",category);
        return model;
    }

}
