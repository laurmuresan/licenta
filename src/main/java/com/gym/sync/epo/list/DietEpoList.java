package com.gym.sync.epo.list;


import com.gym.sync.epo.DietEpo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class DietEpoList implements Serializable {

    private static final long serialVersionUID = 4926099853984606621L;

    private List<DietEpo> dietEpoList;

    private DietEpoList() {
    }

    public DietEpoList(List<DietEpo> dietEpoList) {
        this.dietEpoList = dietEpoList;
    }

    public List<DietEpo> getDietEpoList() {
        return dietEpoList;
    }

    @Override
    public String toString() {
        return "DietEpoList{" +
                "dietEpoList=" + dietEpoList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DietEpoList that = (DietEpoList) o;
        return Objects.equals(dietEpoList, that.dietEpoList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(dietEpoList);
    }
}
