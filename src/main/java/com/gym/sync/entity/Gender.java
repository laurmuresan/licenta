package com.gym.sync.entity;

/**
 * @author laurmuresan
 */
public enum Gender {

    MALE("MALE"),
    FEMALE("FEMALE");

    private String type;

    Gender(String type) {
        this.type = type;
    }

    public static String getNameByType(Gender gender) {
        if ("MALE".equals(gender.name())) {
            return "Male";
        } else if ("FEMALE".equals(gender.name())) {
            return "Female";
        } else {
            return null;
        }
    }

    public static Gender getTypeByName(String name) {
        if ("Male".equals(name)) {
            return Gender.MALE;
        } else if ("Female".equals(name)) {
            return Gender.FEMALE;
        } else {
            return null;
        }
    }
}
