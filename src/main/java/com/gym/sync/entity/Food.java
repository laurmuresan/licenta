package com.gym.sync.entity;

import java.io.Serializable;

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
    private Vitamin vitamin;



}
