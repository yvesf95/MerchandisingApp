package com.jgalds.repository;

import com.jgalds.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Admin on 5/11/2017.
 */

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
