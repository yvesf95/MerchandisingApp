package com.jgalds.service;

import com.jgalds.model.Picture;
import com.jgalds.model.Product;

import java.util.List;

/**
 * Created by Admin on 5/14/2017.
 */
public interface PictureService {
    List<Picture> findAll();
    List<Picture> findAllByProduct_Id(Long id);
    Picture save(Picture picture);
}
