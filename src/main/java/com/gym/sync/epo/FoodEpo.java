package com.gym.sync.epo;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @author laurmuresan
 */
public class FoodEpo implements Serializable {

    private static final long serialVersionUID = -4334579996536335389L;

    private long id;
    private String name;
    private String foodType;
    private int calories;
    private double saturatedFat;
    private double transFat;
    private double cholesterol;
    private double sodium;
    private double dietaryFiber;
    private double sugars;
    private double protein;
    private List<VitaminEpo> vitaminList;

    private FoodEpo() {
    }

    public FoodEpo(long id, String name, String foodType, int calories, double saturatedFat, double transFat,
                   double cholesterol, double sodium, double dietaryFiber, double sugars,
                   double protein, List<VitaminEpo> vitaminList) {
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
        this.vitaminList = vitaminList;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getFoodType() {
        return foodType;
    }

    public int getCalories() {
        return calories;
    }

    public double getSaturatedFat() {
        return saturatedFat;
    }

    public double getTransFat() {
        return transFat;
    }

    public double getCholesterol() {
        return cholesterol;
    }

    public double getSodium() {
        return sodium;
    }

    public double getDietaryFiber() {
        return dietaryFiber;
    }

    public double getSugars() {
        return sugars;
    }

    public double getProtein() {
        return protein;
    }

    public List<VitaminEpo> getVitaminList() {
        return vitaminList;
    }

    @Override
    public String toString() {
        return "FoodEpo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", foodType='" + foodType + '\'' +
                ", calories=" + calories +
                ", saturatedFat=" + saturatedFat +
                ", transFat=" + transFat +
                ", cholesterol=" + cholesterol +
                ", sodium=" + sodium +
                ", dietaryFiber=" + dietaryFiber +
                ", sugars=" + sugars +
                ", protein=" + protein +
                ", vitaminList=" + vitaminList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FoodEpo foodEpo = (FoodEpo) o;
        return id == foodEpo.id &&
                calories == foodEpo.calories &&
                Double.compare(foodEpo.saturatedFat, saturatedFat) == 0 &&
                Double.compare(foodEpo.transFat, transFat) == 0 &&
                Double.compare(foodEpo.cholesterol, cholesterol) == 0 &&
                Double.compare(foodEpo.sodium, sodium) == 0 &&
                Double.compare(foodEpo.dietaryFiber, dietaryFiber) == 0 &&
                Double.compare(foodEpo.sugars, sugars) == 0 &&
                Double.compare(foodEpo.protein, protein) == 0 &&
                Objects.equals(name, foodEpo.name) &&
                Objects.equals(foodType, foodEpo.foodType) &&
                Objects.equals(vitaminList, foodEpo.vitaminList);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, foodType, calories, saturatedFat, transFat, cholesterol, sodium, dietaryFiber, sugars, protein, vitaminList);
    }
}
