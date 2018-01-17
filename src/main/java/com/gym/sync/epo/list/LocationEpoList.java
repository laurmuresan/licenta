package com.gym.sync.epo.list;

import com.gym.sync.epo.LocationEpo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class LocationEpoList implements Serializable {

    private static final long serialVersionUID = -21865981244993020L;

    private List<LocationEpo> locationEpoList;

    private LocationEpoList() {
    }

    public LocationEpoList(List<LocationEpo> locationEpoList) {
        this.locationEpoList = locationEpoList;
    }

    public List<LocationEpo> getLocationEpoList() {
        return locationEpoList;
    }

    @Override
    public String toString() {
        return "LocationEpoList{" +
                "locationEpoList=" + locationEpoList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LocationEpoList that = (LocationEpoList) o;
        return Objects.equals(locationEpoList, that.locationEpoList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(locationEpoList);
    }
}
