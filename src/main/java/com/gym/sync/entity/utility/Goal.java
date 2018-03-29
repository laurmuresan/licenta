package com.gym.sync.entity.utility;

import org.joda.time.LocalDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author laurmuresan
 */
@Entity
@Table(name = "goal")
@SequenceGenerator(sequenceName = "goal_seq", allocationSize = 1, name = "GoalSeq")
public class Goal implements Serializable {

    private static final long serialVersionUID = -7841154153479546722L;

    private long id;
    private double weight;
    private LocalDate deadline;

    public Goal() {
    }

    public Goal(long id, double weight, LocalDate deadline) {
        this.id = id;
        this.weight = weight;
        this.deadline = deadline;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GoalSeq")
    @Column(name = "goal_id", unique = true, nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "weight", nullable = false)
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Column(name = "deadline", nullable = false)
    public LocalDate getDeadline() {
        return deadline;
    }

    public void setDeadline(LocalDate deadline) {
        this.deadline = deadline;
    }

    @Override
    public String toString() {
        return "Goal{" +
                "id=" + id +
                ", weight=" + weight +
                ", deadline=" + deadline +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Goal goal = (Goal) o;
        return id == goal.id &&
                Double.compare(goal.weight, weight) == 0 &&
                Objects.equals(deadline, goal.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, weight, deadline);
    }
}
