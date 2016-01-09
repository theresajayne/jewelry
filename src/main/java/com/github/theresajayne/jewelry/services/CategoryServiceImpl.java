package com.github.theresajayne.jewelry.services;

import com.github.theresajayne.jewelry.dao.CategoryDao;
import com.github.theresajayne.jewelry.entity.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Theresa on 31/12/2015.
 */
@Service
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private CategoryDao categoryDao;

    @Override
    public List<Category> getAllCategories() {
        return categoryDao.list();
    }

    @Override
    public Category getCategory(String name)
    {
        return categoryDao.get(name);
    }
}
