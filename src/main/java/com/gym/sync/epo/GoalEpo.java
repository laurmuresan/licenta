package com.gym.sync.epo;


import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 * @author laurmuresan
 */
public class GoalEpo implements Serializable {

    private static final long serialVersionUID = -5246866122584072605L;

    private long id;
    private double weight;
    private LocalDate deadline;

    private GoalEpo() {
    }

    public GoalEpo(long id, double weight, LocalDate deadline) {
        this.id = id;
        this.weight = weight;
        this.deadline = deadline;
    }

    public long getId() {
        return id;
    }

    public double getWeight() {
        return weight;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    @Override
    public String toString() {
        return "GoalEpo{" +
                "id=" + id +
                ", weight=" + weight +
                ", deadline=" + deadline +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoalEpo goalEpo = (GoalEpo) o;
        return id == goalEpo.id &&
                Double.compare(goalEpo.weight, weight) == 0 &&
                Objects.equals(deadline, goalEpo.deadline);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, weight, deadline);
    }
}
