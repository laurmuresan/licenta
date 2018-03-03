package com.gym.sync.entity.meal;

/**
 * @author laurmuresan
 */
public enum MealType {

    BREAKFAST("BREAKFAST"),
    LUNCH("LUNCH"),
    SNACK("SNACK"),
    DINNER("DINNER");

    private String type;

    MealType(String type) {
        this.type = type;
    }

    public static String getNameByType(MealType mealType) {
        if ("BREAKFAST".equals(mealType.name())) {
            return "Breakfast";
        } else if ("LUNCH".equals(mealType.name())) {
            return "Lunch";
        } else if ("SNACK".equals(mealType.name())) {
            return "Snack";
        } else if ("DINNER".equals(mealType.name())) {
            return "Dinner";
        } else {
            return null;
        }
    }

    public static MealType getTypeByName(String name) {
        if ("Breakfast".equals(name)) {
            return MealType.BREAKFAST;
        } else if ("Lunch".equals(name)) {
            return MealType.LUNCH;
        } else if ("Snack".equals(name)) {
            return MealType.SNACK;
        } else if ("Dinner".equals(name)) {
            return MealType.DINNER;
        } else {
            return null;
        }
    }
}
