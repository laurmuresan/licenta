package com.gym.sync.epo.list;

import com.gym.sync.epo.FoodEpo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

public class FoodEpoList implements Serializable {

    private static final long serialVersionUID = -5640327109437651954L;

    private List<FoodEpo> foodEpoList;

    public FoodEpoList() {
    }

    public FoodEpoList(List<FoodEpo> foodEpoList) {
        this.foodEpoList = foodEpoList;
    }

    public List<FoodEpo> getFoodEpoList() {
        return foodEpoList;
    }

    @Override
    public String toString() {
        return "FoodEpoList{" +
                "foodEpoList=" + foodEpoList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoodEpoList that = (FoodEpoList) o;
        return Objects.equals(foodEpoList, that.foodEpoList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(foodEpoList);
    }
}
