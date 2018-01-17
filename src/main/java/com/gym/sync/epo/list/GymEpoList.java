package com.gym.sync.epo.list;

import com.gym.sync.epo.GymEpo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class GymEpoList implements Serializable {

    private static final long serialVersionUID = 4269333983166457359L;

    private List<GymEpo> gymEpoList;

    private GymEpoList() {
    }

    public GymEpoList(List<GymEpo> gymEpoList) {
        this.gymEpoList = gymEpoList;
    }

    public List<GymEpo> getGymEpoList() {
        return gymEpoList;
    }

    @Override
    public String toString() {
        return "GymEpoList{" +
                "gymEpoList=" + gymEpoList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GymEpoList that = (GymEpoList) o;
        return Objects.equals(gymEpoList, that.gymEpoList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(gymEpoList);
    }
}
