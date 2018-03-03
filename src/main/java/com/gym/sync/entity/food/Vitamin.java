package com.gym.sync.entity.food;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author laurmuresan
 */
public class Vitamin implements Serializable {

    private static final long serialVersionUID = -1317718451030840366L;

    private long id;
    private String name;
    private int percent;

    public Vitamin() {
    }

    public Vitamin(long id, String name, int percent) {
        this.id = id;
        this.name = name;
        this.percent = percent;
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

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    @Override
    public String toString() {
        return "Vitamin{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", percent=" + percent +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vitamin vitamin = (Vitamin) o;
        return id == vitamin.id &&
                percent == vitamin.percent &&
                Objects.equals(name, vitamin.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, percent);
    }
}
