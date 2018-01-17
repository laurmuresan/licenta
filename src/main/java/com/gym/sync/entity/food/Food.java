package com.gym.sync.entity.food;

import java.io.Serializable;
import java.util.Objects;

public class Food implements Serializable {

    private static final long serialVersionUID = -3318443581493541532L;

    private long id;
    private String name;
    private FoodType foodType;
    private long calories;
    private double saturatedFat;
    private double transFat;
    private double cholesterol;
    private double sodium;
    private double dietaryFiber;
    private double sugars;
    private double protein;

    public Food() {
    }

    public Food(long id, String name, FoodType foodType, long calories, double saturatedFat, double transFat,
                double cholesterol, double sodium, double dietaryFiber, double sugars, double protein) {
        this.id = id;
        this.name = name;
        this.foodType = foodType;
        this.calories = calories;
        this.saturatedFat = saturatedFat;
        this.transFat = transFat;
        this.cholesterol = cholesterol;
        this.sodium = sodium;
        this.dietaryFiber = dietaryFiber;
        this.sugars = sugars;
        this.protein = protein;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    public long getCalories() {
        return calories;
    }

    public void setCalories(long calories) {
        this.calories = calories;
    }

    public double getSaturatedFat() {
        return saturatedFat;
    }

    public void setSaturatedFat(double saturatedFat) {
        this.saturatedFat = saturatedFat;
    }

    public double getTransFat() {
        return transFat;
    }

    public void setTransFat(double transFat) {
        this.transFat = transFat;
    }

    public double getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(double cholesterol) {
        this.cholesterol = cholesterol;
    }

    public double getSodium() {
        return sodium;
    }

    public void setSodium(double sodium) {
        this.sodium = sodium;
    }

    public double getDietaryFiber() {
        return dietaryFiber;
    }

    public void setDietaryFiber(double dietaryFiber) {
        this.dietaryFiber = dietaryFiber;
    }

    public double getSugars() {
        return sugars;
    }

    public void setSugars(double sugars) {
        this.sugars = sugars;
    }

    public double getProtein() {
        return protein;
    }

    public void setProtein(double protein) {
        this.protein = protein;
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", foodType=" + foodType +
                ", calories=" + calories +
                ", saturatedFat=" + saturatedFat +
                ", transFat=" + transFat +
                ", cholesterol=" + cholesterol +
                ", sodium=" + sodium +
                ", dietaryFiber=" + dietaryFiber +
                ", sugars=" + sugars +
                ", protein=" + protein +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return id == food.id &&
                calories == food.calories &&
                Double.compare(food.saturatedFat, saturatedFat) == 0 &&
                Double.compare(food.transFat, transFat) == 0 &&
                Double.compare(food.cholesterol, cholesterol) == 0 &&
                Double.compare(food.sodium, sodium) == 0 &&
                Double.compare(food.dietaryFiber, dietaryFiber) == 0 &&
                Double.compare(food.sugars, sugars) == 0 &&
                Double.compare(food.protein, protein) == 0 &&
                Objects.equals(name, food.name) &&
                foodType == food.foodType;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, foodType, calories, saturatedFat, transFat, cholesterol, sodium, dietaryFiber, sugars, protein);
    }
}
