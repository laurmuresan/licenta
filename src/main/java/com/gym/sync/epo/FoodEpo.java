package com.gym.sync.epo;

import com.gym.sync.entity.food.FoodType;
import com.gym.sync.entity.food.Vitamin;

import java.io.Serializable;

public class FoodEpo implements Serializable {

    private static final long serialVersionUID = 1103206029508850164L;

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
    private Vitamin vitamin;

    private FoodEpo() {

    }
}
