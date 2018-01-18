package com.gym.sync.entity.user;

import java.io.Serializable;

public class Photo implements Serializable {

    private static final long serialVersionUID = -7895278894696727922L;

    private long id;
    private String photo;

    public Photo() {
    }

    public Photo(long id, String photo) {
        this.id = id;
        this.photo = photo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "id=" + id +
                ", photo='" + photo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Photo photo1 = (Photo) o;

        if (id != photo1.id) return false;
        return photo != null ? photo.equals(photo1.photo) : photo1.photo == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (photo != null ? photo.hashCode() : 0);
        return result;
    }
}