package com.gym.sync.epo;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author laurmuresan
 */
public class PhotoEpo implements Serializable {

    private static final long serialVersionUID = 6383620140832667479L;

    private long id;
    private String photo;

    public PhotoEpo() {
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
    public String toString() {
        return "PhotoEpo{" +
                "id=" + id +
                ", photo='" + photo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PhotoEpo photoEpo = (PhotoEpo) o;
        return id == photoEpo.id &&
                Objects.equals(photo, photoEpo.photo);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, photo);
    }
}
