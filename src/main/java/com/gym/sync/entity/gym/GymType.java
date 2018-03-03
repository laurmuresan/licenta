package com.gym.sync.entity.gym;

/**
 * @author laurmuresan
 */
public enum GymType {

    CROSSFIT("CROSSFIT"),
    AEROBIC("AEROBIC"),
    FITNESS("FITNESS"),
    PILATES("PILATES"),
    ZUMBA("ZUMBA"),
    KANGOO("KANGOO"),
    YOGA("YOGA"),
    SPINNING("SPINNING"),
    SWIMMING("SWIMMING"),
    CYCLING("CYCLING");

    private String type;

    GymType(String type) {
        this.type = type;
    }

    public static String getNameByType(GymType dietType) {
        if ("CROSSFIT".equals(dietType.name())) {
            return "Cross Fit";
        } else if ("AEROBIC".equals(dietType.name())) {
            return "Aerobic";
        } else if ("FITNESS".equals(dietType.name())) {
            return "Fitness";
        } else if ("PILATES".equals(dietType.name())) {
            return "Pilates";
        } else if ("ZUMBA".equals(dietType.name())) {
            return "Zumba";
        } else if ("KANGOO".equals(dietType.name())) {
            return "Kangoo";
        } else if ("YOGA".equals(dietType.name())) {
            return "Yoga";
        } else if ("SPINNING".equals(dietType.name())) {
            return "Spinning";
        } else if ("SWIMMING".equals(dietType.name())) {
            return "Swimming";
        } else if ("CYCLING".equals(dietType.name())) {
            return "Cycling";
        } else {
            return null;
        }
    }

    public static GymType getTypeByName(String name) {
        if ("Cross Fit".equals(name)) {
            return GymType.CROSSFIT;
        } else if ("Aerobic".equals(name)) {
            return GymType.AEROBIC;
        } else if ("Fitness".equals(name)) {
            return GymType.FITNESS;
        } else if ("Pilates".equals(name)) {
            return GymType.PILATES;
        } else if ("Zumba".equals(name)) {
            return GymType.ZUMBA;
        } else if ("Kangoo".equals(name)) {
            return GymType.KANGOO;
        } else if ("Yoga".equals(name)) {
            return GymType.YOGA;
        } else if ("Spinning".equals(name)) {
            return GymType.SPINNING;
        } else if ("Swimming".equals(name)) {
            return GymType.SWIMMING;
        } else if ("Cycling".equals(name)) {
            return GymType.CYCLING;
        } else {
            return null;
        }
    }
}
