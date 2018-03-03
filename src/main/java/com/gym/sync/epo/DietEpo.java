package com.gym.sync.epo;

import com.gym.sync.epo.list.MealEpoList;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author laurmuresan
 */
public class DietEpo implements Serializable {

    private static final long serialVersionUID = 3926618961121289234L;

    private long id;
    private String name;
    private int calories;
    private String details;
    private String dietType;
    private MealEpoList mealList;

    private DietEpo() {
    }

    public DietEpo(long id, String name, int calories, String details, String dietType, MealEpoList mealList) {
        this.id = id;
        this.name = name;
        this.calories = calories;
        this.details = details;
        this.dietType = dietType;
        this.mealList = mealList;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public String getDetails() {
        return details;
    }

    public String getDietType() {
        return dietType;
    }

    public MealEpoList getMealList() {
        return mealList;
    }

    @Override
    public String toString() {
        return "DietEpo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", calories=" + calories +
                ", details='" + details + '\'' +
                ", dietType='" + dietType + '\'' +
                ", mealList=" + mealList +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DietEpo dietEpo = (DietEpo) o;
        return id == dietEpo.id &&
                calories == dietEpo.calories &&
                Objects.equals(name, dietEpo.name) &&
                Objects.equals(details, dietEpo.details) &&
                Objects.equals(dietType, dietEpo.dietType) &&
                Objects.equals(mealList, dietEpo.mealList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, calories, details, dietType, mealList);
    }
}
