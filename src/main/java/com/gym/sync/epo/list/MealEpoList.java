package com.gym.sync.epo.list;

import com.gym.sync.epo.MealEpo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class MealEpoList implements Serializable {

    private static final long serialVersionUID = 3453755323031312783L;

    private List<MealEpo> mealEpoList;

    public MealEpoList() {
    }

    public MealEpoList(List<MealEpo> mealEpoList) {
        this.mealEpoList = mealEpoList;
    }

    public List<MealEpo> getMealEpoList() {
        return mealEpoList;
    }

    @Override
    public String toString() {
        return "MealEpoList{" +
                "mealEpoList=" + mealEpoList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MealEpoList that = (MealEpoList) o;
        return Objects.equals(mealEpoList, that.mealEpoList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(mealEpoList);
    }
}
