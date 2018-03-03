package com.gym.sync.epo;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author laurmuresan
 */
public class LocationEpo implements Serializable {

    private static final long serialVersionUID = 1690868917208338492L;

    private long id;
    private String address;
    private double longitude;
    private double latitude;

    private LocationEpo() {
    }

    public LocationEpo(long id, String address, double longitude, double latitude) {
        this.id = id;
        this.address = address;
        this.longitude = longitude;
        this.latitude = latitude;
    }

    public long getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public double getLongitude() {
        return longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    @Override
    public String toString() {
        return "LocationEpo{" +
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
        LocationEpo that = (LocationEpo) o;
        return id == that.id &&
                Double.compare(that.longitude, longitude) == 0 &&
                Double.compare(that.latitude, latitude) == 0 &&
                Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, address, longitude, latitude);
    }
}
