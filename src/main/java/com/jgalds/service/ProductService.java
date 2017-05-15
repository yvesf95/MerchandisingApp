package com.jgalds.service;

import com.jgalds.model.Product;

import java.util.List;

/**
 * Created by Admin on 5/14/2017.
 */
public interface ProductService {
    List<Product> findAllProducts();
    Product save(Product product);
}
