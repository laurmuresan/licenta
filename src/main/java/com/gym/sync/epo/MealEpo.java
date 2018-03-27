package com.gym.sync.epo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @author laurmuresan
 */
public class MealEpo implements Serializable {

    private static final long serialVersionUID = 47466276649098965L;

    private long id;
    private int calories;
    private String mealType;
    private List<FoodEpo> foodList;

    private MealEpo() {
    }

    public MealEpo(long id, int calories, String mealType, List<FoodEpo> foodList) {
        this.id = id;
        this.calories = calories;
        this.mealType = mealType;
        this.foodList = foodList;
    }

    public long getId() {
        return id;
    }

    public int getCalories() {
        return calories;
    }

    public String getMealType() {
        return mealType;
    }

    public List<FoodEpo> getFoodList() {
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
