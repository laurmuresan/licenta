package com.gym.sync.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @author laurmuresan
 */
@Entity
@Table(name = "meal")
@SequenceGenerator(name = "meal_seq", allocationSize = 1, sequenceName = "meal_seq")
public class Meal implements Serializable {

    private static final long serialVersionUID = 1752981763245024791L;

    private long id;
    private int calories;
    private MealType mealType;
    private List<Food> foodList;

    public Meal() {
    }

    public Meal(long id, int calories, MealType mealType, List<Food> foodList) {
        this.id = id;
        this.calories = calories;
        this.mealType = mealType;
        this.foodList = foodList;
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

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "meal_food", joinColumns = @JoinColumn(name = "meal_id", referencedColumnName = "meal_id"),
            inverseJoinColumns = @JoinColumn(name = "food_id", referencedColumnName = "food_id"))
    public List<Food> getFoodList() {
        return foodList;
    }

    public void setFoodList(List<Food> foodList) {
        this.foodList = foodList;
    }

    @Override
    public String toString() {
        return "Meal{" +
                "id=" + id +
                ", calories=" + calories +
                ", mealType=" + mealType +
                ", foodList=" + foodList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meal meal = (Meal) o;
        return id == meal.id &&
                calories == meal.calories &&
                mealType == meal.mealType &&
                Objects.equals(foodList, meal.foodList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, calories, mealType, foodList);
    }
}
