package com.jgalds.service;

import com.jgalds.model.Picture;

import java.util.List;

/**
 * Created by Admin on 5/14/2017.
 */
public interface PictureService {
    List<Picture> findAll();
    Picture save(Picture picture);
}
