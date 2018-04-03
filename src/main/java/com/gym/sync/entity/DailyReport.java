package com.gym.sync.entity;

import org.joda.time.LocalDate;

import javax.persistence.*;
import java.io.Serializable;
/*
    STILL IN PROGRESS
 */
/**
 * @author laurmuresan
 */
@Entity
@Table(name = "daily_report")
@SequenceGenerator(sequenceName = "daily_report_seq", allocationSize = 1, name = "daily_report_seq")
public class DailyReport implements Serializable{

    private static final long serialVersionUID = 3040023761979009702L;

    private long id;
    private LocalDate date;
    private double weight;
    private int calories;
    private int messageReport;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "daily_report_seq")
    @Column(name = "daily_report_id", unique = true, nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "date", nullable = false)
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Column(name = "weight", nullable = false)
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Column(name = "calories", nullable = false)
    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    @Column(name = "message_report", nullable = false)
    public int getMessageReport() {
        return messageReport;
    }

    public void setMessageReport(int messageReport) {
        this.messageReport = messageReport;
    }

    @Override
    public String toString() {
        return "DailyReport{" +
                "id=" + id +
                ", date=" + date +
                ", weight=" + weight +
                ", calories=" + calories +
                ", messageReport=" + messageReport +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DailyReport that = (DailyReport) o;

        if (id != that.id) return false;
        if (Double.compare(that.weight, weight) != 0) return false;
        if (calories != that.calories) return false;
        if (messageReport != that.messageReport) return false;
        return date != null ? date.equals(that.date) : that.date == null;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (id ^ (id >>> 32));
        result = 31 * result + (date != null ? date.hashCode() : 0);
        temp = Double.doubleToLongBits(weight);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + calories;
        result = 31 * result + messageReport;
        return result;
    }
}

