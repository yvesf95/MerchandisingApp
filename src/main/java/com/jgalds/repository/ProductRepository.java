package com.jgalds.repository;

import com.jgalds.model.Category;
import com.jgalds.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Admin on 5/6/2017.
 */

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {

//    Page<Product> findAllByProductName(String productName);
//
//    Page<Product> findAllByCategory(Category category);
//
//    Page<Product> findAllByColor(String color);
//
//    Page<Product> findAllByPriceGreaterThan(double price);
//
//    Page<Product> findAllByPriceLessThan(double price);
//
//    Page<Product> findAllBySizeGreaterThan(double size);

}
