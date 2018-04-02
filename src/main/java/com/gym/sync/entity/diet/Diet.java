package com.gym.sync.entity.diet;

import com.gym.sync.entity.meal.Meal;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @author laurmuresan
 */
@Entity
@Table(name = "diet")
@SequenceGenerator(sequenceName = "diet_seq", allocationSize = 1, name = "DietSeq")
public class Diet implements Serializable {

    private static final long serialVersionUID = -3303888932946436785L;

    private long id;
    private String name;
    private int calories;
    private String details;
    private DietType dietType;
    private List<Meal> mealList;

    public Diet() {
    }

    public Diet(long id, String name, int calories, String details, DietType dietType, List<Meal> mealList) {
        this.id = id;
        this.name = name;
        this.calories = calories;
        this.details = details;
        this.dietType = dietType;
        this.mealList = mealList;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DietSeq")
    @Column(name = "diet_id", unique = true, nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "calories", nullable = false)
    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Column(name = "details", nullable = false)
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    public DietType getDietType() {
        return dietType;
    }

    public void setDietType(DietType dietType) {
        this.dietType = dietType;
    }

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "diet_meal", joinColumns = @JoinColumn(name = "diet_id", referencedColumnName = "diet_id"),
            inverseJoinColumns = @JoinColumn(name = "meal_id", referencedColumnName = "meal_id"))
    public List<Meal> getMealList() {
        return mealList;
    }

    public void setMealList(List<Meal> mealList) {
        this.mealList = mealList;
    }

    @Override
    public String toString() {
        return "Diet{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", calories=" + calories +
                ", details='" + details + '\'' +
                ", dietType=" + dietType +
                ", mealList=" + mealList +
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
                dietType == diet.dietType &&
                Objects.equals(mealList, diet.mealList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, calories, details, dietType, mealList);
    }
}
