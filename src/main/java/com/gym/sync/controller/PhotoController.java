package com.gym.sync.controller;

import com.gym.sync.entity.Photo;
import com.gym.sync.epo.PhotoEpo;
import com.gym.sync.service.interfaces.IPhotoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author laurmuresan
 */
@RestController
@CrossOrigin(origins = "http://localhost:2121/photo")
@RequestMapping(value = "/photo")
public class PhotoController implements ICrudController<Photo, PhotoEpo> {

    @Autowired
    private IPhotoService photoService;

    @Override
    public Photo create(PhotoEpo epo) {
        return photoService.create(epo);
    }

    @Override
    public List<PhotoEpo> getAll() {
        return photoService.getAll();
    }

    @Override
    public Photo update(PhotoEpo epo) {
        return photoService.update(epo);
    }

    @Override
    public Photo delete(long id) {
        return photoService.delete(id);
    }
}
