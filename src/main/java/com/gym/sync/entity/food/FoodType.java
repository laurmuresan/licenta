package com.gym.sync.entity.food;

/**
 * @author laurmuresan
 */
public enum FoodType {

    VEGETABLE("VEGETABLE"),
    FRUIT("FRUIT"),
    DAIRY("DAIRY"),
    MEAT("MEAT"),
    GRAIN("GRAIN"),
    LEAN("LEAN");

    private String type;

    FoodType(String type) {
        this.type = type;
    }

    public static String getNameByType(FoodType foodType) {
        if ("VEGETABLE".equals(foodType.name())) {
            return "Vegetable";
        } else if ("FRUIT".equals(foodType.name())) {
            return "Fruit";
        } else if ("DAIRY".equals(foodType.name())) {
            return "Dairy Product";
        } else if ("MEAT".equals(foodType.name())) {
            return "Meat";
        } else if ("GRAIN".equals(foodType.name())) {
            return "Grain";
        } else if ("LEAN".equals(foodType.name())) {
            return "Lean";
        } else {
            return null;
        }
    }

    public static FoodType getTypeByName(String name) {
        if ("Vegetable".equals(name)) {
            return FoodType.VEGETABLE;
        } else if ("Fruit".equals(name)) {
            return FoodType.FRUIT;
        } else if ("Dairy product".equals(name)) {
            return FoodType.DAIRY;
        } else if ("Meat".equals(name)) {
            return FoodType.MEAT;
        } else if ("Grain".equals(name)) {
            return FoodType.GRAIN;
        } else if ("Lean".equals(name)) {
            return FoodType.LEAN;
        } else {
            return null;
        }
    }

}
