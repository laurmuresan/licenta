package com.gym.sync.entity.diet;

import java.io.Serializable;
import java.util.Objects;

public class Diet implements Serializable {

    private static final long serialVersionUID = -3303888932946436785L;

    private long id;
    private String name;
    private int calories;
    private String details;
    private DietType dietType;

    public Diet() {
    }

    public Diet(long id, String name, int calories, String details, DietType dietType) {
        this.id = id;
        this.name = name;
        this.calories = calories;
        this.details = details;
        this.dietType = dietType;
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

    public long getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public DietType getDietType() {
        return dietType;
    }

    public void setDietType(DietType dietType) {
        this.dietType = dietType;
    }

    @Override
    public String toString() {
        return "Diet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", calories=" + calories +
                ", details='" + details + '\'' +
                ", dietType=" + dietType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Diet diet = (Diet) o;
        return id == diet.id &&
                calories == diet.calories &&
                Objects.equals(name, diet.name) &&
                Objects.equals(details, diet.details) &&
                dietType == diet.dietType;
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, calories, details, dietType);
    }
}
