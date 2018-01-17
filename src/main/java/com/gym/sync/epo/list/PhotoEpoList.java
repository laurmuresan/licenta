package com.gym.sync.epo.list;

import com.gym.sync.epo.PhotoEpo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class PhotoEpoList implements Serializable {

    private static final long serialVersionUID = -9139993690207718390L;

    private List<PhotoEpo> photoEpoList;

    private PhotoEpoList() {
    }

    public PhotoEpoList(List<PhotoEpo> photoEpoList) {
        this.photoEpoList = photoEpoList;
    }

    public List<PhotoEpo> getPhotoEpoList() {
        return photoEpoList;
    }

    @Override
    public String toString() {
        return "PhotoEpoList{" +
                "photoEpoList=" + photoEpoList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoEpoList that = (PhotoEpoList) o;
        return Objects.equals(photoEpoList, that.photoEpoList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(photoEpoList);
    }
}
