package com.github.theresajayne.jewelry.dao;

import com.github.theresajayne.jewelry.entity.Category;

import java.util.List;

/**
 * Dao interface
 * Created by Theresa on 27/12/2015.
 */
public interface CategoryDao {
    List<Category> list();

    List<Category> listActive();

    Category get(long id);

    Category get(String name);

    void saveOrUpdate(Category category);

    void delete(long id);
}
