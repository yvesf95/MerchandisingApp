package com.jgalds.repository;

import com.jgalds.model.Picture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Admin on 5/12/2017.
 */

@Repository
public interface PictureRepository extends JpaRepository<Picture, Long> {
}
