package com.gym.sync.entity.meal;

import java.io.Serializable;
import java.util.Objects;

public class Meal implements Serializable {

    private static final long serialVersionUID = 1752981763245024791L;

    private long id;
    private long calories;
    private MealType mealType;

    public Meal() {
    }

    public Meal(long id, long calories, MealType mealType) {
        this.id = id;
        this.calories = calories;
        this.mealType = mealType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCalories() {
        return calories;
    }

    public void setCalories(long calories) {
        this.calories = calories;
    }

    public MealType getMealType() {
        return mealType;
    }

    public void setMealType(MealType mealType) {
        this.mealType = mealType;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "id=" + id +
                ", calories=" + calories +
                ", mealType=" + mealType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meal meal = (Meal) o;
        return id == meal.id &&
                calories == meal.calories &&
                mealType == meal.mealType;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, calories, mealType);
    }
}
