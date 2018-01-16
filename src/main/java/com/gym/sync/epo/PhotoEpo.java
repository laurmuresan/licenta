package com.gym.sync.epo;

import java.io.Serializable;

public class PhotoEpo implements Serializable {

    private static final long serialVersionUID = 6383620140832667479L;

    private long id;
    private String photo;

    private PhotoEpo () {
    }

    public PhotoEpo(long id, String photo) {
        this.id = id;
        this.photo = photo;
    }

    public long getId() {
        return id;
    }

    public String getPhoto() {
        return photo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PhotoEpo photoEpo = (PhotoEpo) o;

        if (id != photoEpo.id) return false;
        return photo != null ? photo.equals(photoEpo.photo) : photoEpo.photo == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "PhotoEpo{" +
                "id=" + id +
                ", photo='" + photo + '\'' +
                '}';
    }
}
