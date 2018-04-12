package com.gym.sync.service;

import com.gym.sync.entity.Photo;
import com.gym.sync.epo.PhotoEpo;
import com.gym.sync.mapper.PhotoEpoMapper;
import com.gym.sync.repository.PhotoRepository;
import com.gym.sync.service.interfaces.IPhotoService;
import jersey.repackaged.com.google.common.collect.Lists;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author laurmuresan
 */
@Service
@Transactional
public class PhotoServiceImpl implements IPhotoService {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(PhotoServiceImpl.class);

    @Autowired
    private PhotoRepository photoRepository;
    @Autowired
    private PhotoEpoMapper photoEpoMapper;

    @Override
    public Photo create(PhotoEpo epo) {
        Photo photo = photoEpoMapper.toInternal(epo);
        LOGGER.info("Creating photo: " + photo + ".");
        return photoRepository.save(photo);
    }

    @Override
    public List<PhotoEpo> getAll() {
        LOGGER.info("Getting all photos.");
        return photoEpoMapper.toExternals(Lists.newArrayList(photoRepository.findAll()));
    }

    @Override
    public Photo update(PhotoEpo epo) {
        Photo photo = photoRepository.findOne(epo.getId());
        LOGGER.info("Updating photo: " + photo + ".");
        photo.setPhoto(epo.getPhoto());
        return photo;
    }

    @Override
    public Photo delete(long id) {
        Photo photo = photoRepository.findOne(id);
        LOGGER.info("Deleting photo: " + photo + ".");
        photoRepository.delete(photo);
        return photo;
    }
}
