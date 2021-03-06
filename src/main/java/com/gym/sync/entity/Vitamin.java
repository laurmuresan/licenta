package com.gym.sync.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author laurmuresan
 */
@Entity
@Table(name = "vitamin")
@SequenceGenerator(sequenceName = "diet_seq", allocationSize = 1, name = "diet_seq")
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

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "diet_seq")
    @Column(name = "vitamin_id", unique = true, nullable = false)
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

    @Column(name = "percent", nullable = false)
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
