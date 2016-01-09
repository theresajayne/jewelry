package com.github.theresajayne.jewelry.services;

import com.github.theresajayne.jewelry.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Theresa on 31/12/2015.
 */

public interface CategoryService {

    List<Category> getAllCategories();

    List<Category> getAllActive();

    Category getCategory(String name);

}
