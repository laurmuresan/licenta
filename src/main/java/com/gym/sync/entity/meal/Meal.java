package com.gym.sync.entity.meal;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "meal")
@SequenceGenerator(name = "meal_seq", sequenceName = "meal_seq",allocationSize = 1)
public class Meal implements Serializable {

    private static final long serialVersionUID = 1752981763245024791L;

    private long id;
    private int calories;
    private MealType mealType;

    public Meal() {
    }

    public Meal(long id, int calories, MealType mealType) {
        this.id = id;
        this.calories = calories;
        this.mealType = mealType;
    }

    @Id
    @Column(name = "meal_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "meal_seq")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "calories")
    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
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
