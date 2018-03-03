package com.gym.sync.mapper;

import com.gym.sync.entity.user.Photo;
import com.gym.sync.epo.PhotoEpo;

/**
 * @author laurmuresan
 */
public class PhotoMapper extends GenericMapper<Photo, PhotoEpo> {
    @Override
    public Photo toInternal(PhotoEpo epo) {
        return new Photo(epo.getId(), epo.getPhoto());
    }

    @Override
    public PhotoEpo toExternal(Photo model) {
        return new PhotoEpo(model.getId(), model.getPhoto());
    }
}
