package com.jgalds.repository;

import com.jgalds.model.Picture;
import com.jgalds.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Admin on 5/12/2017.
 */

@Repository
public interface PictureRepository extends JpaRepository<Picture, Long> {

    List<Picture> findAllByProduct_Id(Long id);
}
