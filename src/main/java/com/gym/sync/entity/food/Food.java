package com.gym.sync.entity.food;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author laurmuresan
 */
@Entity
@Table(name = "food")
@SequenceGenerator(sequenceName = "food_seq", allocationSize = 1, name = "FoodSeq")
public class Food implements Serializable {

    private static final long serialVersionUID = -3318443581493541532L;

    private long id;
    private String name;
    private FoodType foodType;
    private int calories;
    private double saturatedFat;
    private double transFat;
    private double cholesterol;
    private double sodium;
    private double dietaryFiber;
    private double sugars;
    private double protein;

    public Food() {
    }

    public Food(long id, String name, FoodType foodType, int calories, double saturatedFat, double transFat,
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

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FoodSeq")
    @Column(name = "food_id", unique = true, nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "type", nullable = false)
    @Enumerated(EnumType.STRING)
    public FoodType getFoodType() {
        return foodType;
    }

    public void setFoodType(FoodType foodType) {
        this.foodType = foodType;
    }

    @Column(name = "calories", nullable = false)
    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Column(name = "saturated_fat", nullable = false)
    public double getSaturatedFat() {
        return saturatedFat;
    }

    public void setSaturatedFat(double saturatedFat) {
        this.saturatedFat = saturatedFat;
    }

    @Column(name = "trans_fat", nullable = false)
    public double getTransFat() {
        return transFat;
    }

    public void setTransFat(double transFat) {
        this.transFat = transFat;
    }

    @Column(name = "cholesterol", nullable = false)
    public double getCholesterol() {
        return cholesterol;
    }

    public void setCholesterol(double cholesterol) {
        this.cholesterol = cholesterol;
    }

    @Column(name = "sodium", nullable = false)
    public double getSodium() {
        return sodium;
    }

    public void setSodium(double sodium) {
        this.sodium = sodium;
    }

    @Column(name = "dietary_fiber", nullable = false)
    public double getDietaryFiber() {
        return dietaryFiber;
    }

    public void setDietaryFiber(double dietaryFiber) {
        this.dietaryFiber = dietaryFiber;
    }

    @Column(name = "sugars", nullable = false)
    public double getSugars() {
        return sugars;
    }

    public void setSugars(double sugars) {
        this.sugars = sugars;
    }

    @Column(name = "protein", nullable = false)
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
