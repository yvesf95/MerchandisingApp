package com.jgalds.service;

import com.jgalds.model.Category;

import java.util.List;

/**
 * Created by Admin on 5/14/2017.
 */
public interface CategoryService {
    List<Category> findAll();
    Category save(Category category);
}
