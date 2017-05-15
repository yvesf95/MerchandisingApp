package com.jgalds.repository;

import com.jgalds.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Admin on 5/6/2017.
 */

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

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
