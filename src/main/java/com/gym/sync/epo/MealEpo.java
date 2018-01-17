package com.gym.sync.epo;

import com.gym.sync.epo.list.FoodEpoList;

import java.io.Serializable;
import java.util.Objects;

public class MealEpo implements Serializable {

    private static final long serialVersionUID = 47466276649098965L;

    private long id;
    private long calories;
    private String mealType;
    private FoodEpoList foodList;

    private MealEpo() {
    }

    public MealEpo(long id, long calories, String mealType, FoodEpoList foodList) {
        this.id = id;
        this.calories = calories;
        this.mealType = mealType;
        this.foodList = foodList;
    }

    public long getId() {
        return id;
    }

    public long getCalories() {
        return calories;
    }

    public String getMealType() {
        return mealType;
    }

    public FoodEpoList getFoodList() {
        return foodList;
    }

    @Override
    public String toString() {
        return "MealEpo{" +
                "id=" + id +
                ", calories=" + calories +
                ", mealType='" + mealType + '\'' +
                ", foodList=" + foodList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MealEpo mealEpo = (MealEpo) o;
        return id == mealEpo.id &&
                calories == mealEpo.calories &&
                Objects.equals(mealType, mealEpo.mealType) &&
                Objects.equals(foodList, mealEpo.foodList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, calories, mealType, foodList);
    }
}
