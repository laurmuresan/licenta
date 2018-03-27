package com.gym.sync.epo;

import org.joda.time.LocalDate;

import java.io.Serializable;

/**
 * @author laurmuresan
 */
public class DailyReportEpo implements Serializable {

    private long id;
    private LocalDate date;
    private double weight;
    private int calories;
    private int messageReport;

    private DailyReportEpo() {
    }

    public DailyReportEpo(long id, LocalDate date, double weight, int calories, int messageReport) {
        this.id = id;
        this.date = date;
        this.weight = weight;
        this.calories = calories;
        this.messageReport = messageReport;
    }

    public long getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getWeight() {
        return weight;
    }

    public int getCalories() {
        return calories;
    }

    public int getMessageReport() {
        return messageReport;
    }

    @Override
    public String toString() {
        return "DailyReportEpo{" +
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

        DailyReportEpo that = (DailyReportEpo) o;

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
