package com.gym.sync.mapper;

import com.gym.sync.entity.Photo;
import com.gym.sync.epo.PhotoEpo;
import org.springframework.stereotype.Service;

/**
 * @author laurmuresan
 */
@Service
public class PhotoEpoMapper extends GenericMapper<Photo, PhotoEpo> {

    @Override
    public Photo toInternal(PhotoEpo epo) {
        return new Photo(epo.getId(), epo.getPhoto());
    }

    @Override
    public PhotoEpo toExternal(Photo model) {
        return new PhotoEpo(model.getId(), model.getPhoto());
    }
}
