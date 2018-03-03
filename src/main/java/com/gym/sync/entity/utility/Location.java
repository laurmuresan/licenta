package com.gym.sync.entity.utility;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author laurmuresan
 */
public class Location implements Serializable {

    private static final long serialVersionUID = -4955660391712940457L;

    private long id;
    private String address;
    private double longitude;
    private double latitude;

    public Location() {
    }

    public Location(long id, String address, double longitude, double latitude) {
        this.id = id;
        this.address = address;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    @Override
    public String toString() {
        return "Location{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", longitude=" + longitude +
                ", latitude=" + latitude +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Location location = (Location) o;
        return id == location.id &&
                Double.compare(location.longitude, longitude) == 0 &&
                Double.compare(location.latitude, latitude) == 0 &&
                Objects.equals(address, location.address);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, address, longitude, latitude);
    }
}
