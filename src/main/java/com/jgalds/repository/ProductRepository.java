package com.jgalds.repository;

import com.jgalds.model.Product;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Admin on 5/6/2017.
 */

@Repository
public interface ProductRepository extends PagingAndSortingRepository<Product, Long> {

}
