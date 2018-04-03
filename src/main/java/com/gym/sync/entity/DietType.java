package com.gym.sync.entity;

/**
 * @author laurmuresan
 */
public enum DietType {

    MAINTENANCE("MAINTENANCE"),
    GAIN("GAIN"),
    LOSS("LOSS");

    private String type;

    DietType(String type) {
        this.type = type;
    }

    public static String getNameByType(DietType dietType) {
        if ("MAINTENANCE".equals(dietType.name())) {
            return "Maintenance";
        } else if ("GAIN".equals(dietType.name())) {
            return "Gain";
        } else if ("LOSS".equals(dietType.name())) {
            return "Loss";
        } else {
            return null;
        }
    }

    public static DietType getTypeByName(String name) {
        if ("Maintenance".equals(name)) {
            return DietType.MAINTENANCE;
        } else if ("Gain".equals(name)) {
            return DietType.GAIN;
        } else if ("Loss".equals(name)) {
            return DietType.LOSS;
        } else {
            return null;
        }
    }
}
