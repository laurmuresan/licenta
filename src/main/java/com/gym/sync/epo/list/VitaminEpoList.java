package com.gym.sync.epo.list;

import com.gym.sync.epo.VitaminEpo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class VitaminEpoList implements Serializable {

    private static final long serialVersionUID = -8940792851241086105L;

    private List<VitaminEpo> vitaminEpoList;

    private VitaminEpoList() {
    }

    public VitaminEpoList(List<VitaminEpo> vitaminEpoList) {
        this.vitaminEpoList = vitaminEpoList;
    }

    public List<VitaminEpo> getVitaminEpoList() {
        return vitaminEpoList;
    }

    @Override
    public String toString() {
        return "VitaminEpoList{" +
                "vitaminEpoList=" + vitaminEpoList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VitaminEpoList that = (VitaminEpoList) o;
        return Objects.equals(vitaminEpoList, that.vitaminEpoList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(vitaminEpoList);
    }
}
