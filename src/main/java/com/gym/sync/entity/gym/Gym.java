package com.gym.sync.entity.gym;

import com.gym.sync.entity.utility.Location;
import org.joda.time.LocalTime;

import java.io.Serializable;
import java.util.Objects;

public class Gym implements Serializable {

    private static final long serialVersionUID = 7873859243956216412L;

    private long id;
    private String name;
    private Location location;
    private String website;
    private String details;
    private String phone;
    private GymType gymtype;
    private LocalTime mondayFridayOpen;
    private LocalTime mondayFridayClose;
    private LocalTime saturdayOpen;
    private LocalTime saturdayClose;
    private LocalTime sundayOpen;
    private LocalTime sundayClose;

    public Gym() {
    }

    public Gym(long id, String name, Location location, String website, String details, String phone, GymType gymtype,
               LocalTime mondayFridayOpen, LocalTime mondayFridayClose, LocalTime saturdayOpen,
               LocalTime saturdayClose, LocalTime sundayOpen, LocalTime sundayClose) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.website = website;
        this.details = details;
        this.phone = phone;
        this.gymtype = gymtype;
        this.mondayFridayOpen = mondayFridayOpen;
        this.mondayFridayClose = mondayFridayClose;
        this.saturdayOpen = saturdayOpen;
        this.saturdayClose = saturdayClose;
        this.sundayOpen = sundayOpen;
        this.sundayClose = sundayClose;
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

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public GymType getGymtype() {
        return gymtype;
    }

    public void setGymtype(GymType gymtype) {
        this.gymtype = gymtype;
    }

    public LocalTime getMondayFridayOpen() {
        return mondayFridayOpen;
    }

    public void setMondayFridayOpen(LocalTime mondayFridayOpen) {
        this.mondayFridayOpen = mondayFridayOpen;
    }

    public LocalTime getMondayFridayClose() {
        return mondayFridayClose;
    }

    public void setMondayFridayClose(LocalTime mondayFridayClose) {
        this.mondayFridayClose = mondayFridayClose;
    }

    public LocalTime getSaturdayOpen() {
        return saturdayOpen;
    }

    public void setSaturdayOpen(LocalTime saturdayOpen) {
        this.saturdayOpen = saturdayOpen;
    }

    public LocalTime getSaturdayClose() {
        return saturdayClose;
    }

    public void setSaturdayClose(LocalTime saturdayClose) {
        this.saturdayClose = saturdayClose;
    }

    public LocalTime getSundayOpen() {
        return sundayOpen;
    }

    public void setSundayOpen(LocalTime sundayOpen) {
        this.sundayOpen = sundayOpen;
    }

    public LocalTime getSundayClose() {
        return sundayClose;
    }

    public void setSundayClose(LocalTime sundayClose) {
        this.sundayClose = sundayClose;
    }

    @Override
    public String toString() {
        return "Gym{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location=" + location +
                ", website='" + website + '\'' +
                ", details='" + details + '\'' +
                ", phone='" + phone + '\'' +
                ", gymtype=" + gymtype +
                ", mondayFridayOpen=" + mondayFridayOpen +
                ", mondayFridayClose=" + mondayFridayClose +
                ", saturdayOpen=" + saturdayOpen +
                ", saturdayClose=" + saturdayClose +
                ", sundayOpen=" + sundayOpen +
                ", sundayClose=" + sundayClose +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gym gym = (Gym) o;
        return id == gym.id &&
                Objects.equals(name, gym.name) &&
                Objects.equals(location, gym.location) &&
                Objects.equals(website, gym.website) &&
                Objects.equals(details, gym.details) &&
                Objects.equals(phone, gym.phone) &&
                gymtype == gym.gymtype &&
                Objects.equals(mondayFridayOpen, gym.mondayFridayOpen) &&
                Objects.equals(mondayFridayClose, gym.mondayFridayClose) &&
                Objects.equals(saturdayOpen, gym.saturdayOpen) &&
                Objects.equals(saturdayClose, gym.saturdayClose) &&
                Objects.equals(sundayOpen, gym.sundayOpen) &&
                Objects.equals(sundayClose, gym.sundayClose);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, location, website, details, phone, gymtype, mondayFridayOpen, mondayFridayClose, saturdayOpen, saturdayClose, sundayOpen, sundayClose);
    }
}

