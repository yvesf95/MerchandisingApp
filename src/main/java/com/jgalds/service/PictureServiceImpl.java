package com.jgalds.service;

import com.jgalds.model.Picture;
import com.jgalds.repository.PictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by Admin on 5/14/2017.
 */

@Service
@Transactional
public class PictureServiceImpl implements PictureService {
    @Autowired
    private PictureRepository pictureRepository;

    @Override
    public List<Picture> findAll() {
        return pictureRepository.findAll();
    }

    @Override
    public Picture save(Picture picture) {
        return pictureRepository.save(picture);
    }
}
