package com.gym.sync.entity.gym;

import com.gym.sync.entity.utility.Location;
import org.joda.time.LocalTime;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author laurmuresan
 */
@Entity
@Table(name = "gym")
@SequenceGenerator(sequenceName = "gym_seq", allocationSize = 1, name = "GymSeq")
public class Gym implements Serializable {

    private static final long serialVersionUID = 7873859243956216412L;

    private long id;
    private String name;
    private Location location;
    private String website;
    private String details;
    private String phone;
    private GymType gymType;
    private LocalTime mondayFridayOpen;
    private LocalTime mondayFridayClose;
    private LocalTime saturdayOpen;
    private LocalTime saturdayClose;
    private LocalTime sundayOpen;
    private LocalTime sundayClose;

    public Gym() {
    }

    public Gym(long id, String name, Location location, String website, String details, String phone, GymType gymType,
               LocalTime mondayFridayOpen, LocalTime mondayFridayClose, LocalTime saturdayOpen,
               LocalTime saturdayClose, LocalTime sundayOpen, LocalTime sundayClose) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.website = website;
        this.details = details;
        this.phone = phone;
        this.gymType = gymType;
        this.mondayFridayOpen = mondayFridayOpen;
        this.mondayFridayClose = mondayFridayClose;
        this.saturdayOpen = saturdayOpen;
        this.saturdayClose = saturdayClose;
        this.sundayOpen = sundayOpen;
        this.sundayClose = sundayClose;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GymSeq")
    @Column(name = "gym_id", unique = true, nullable = false)
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

    @Column(name = "location", nullable = false)
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Column(name = "website", nullable = false)
    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    @Column(name = "details", nullable = false)
    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @Column(name = "phone", nullable = false)
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "type", nullable = false)
    @Enumerated(EnumType.STRING)
    public GymType getGymType() {
        return gymType;
    }

    public void setGymType(GymType gymType) {
        this.gymType = gymType;
    }

    @Column(name = "monday_friday_open", nullable = false)
    public LocalTime getMondayFridayOpen() {
        return mondayFridayOpen;
    }

    public void setMondayFridayOpen(LocalTime mondayFridayOpen) {
        this.mondayFridayOpen = mondayFridayOpen;
    }

    @Column(name = "monday_friday_close", nullable = false)
    public LocalTime getMondayFridayClose() {
        return mondayFridayClose;
    }

    public void setMondayFridayClose(LocalTime mondayFridayClose) {
        this.mondayFridayClose = mondayFridayClose;
    }

    @Column(name = "saturday_open", nullable = false)
    public LocalTime getSaturdayOpen() {
        return saturdayOpen;
    }

    public void setSaturdayOpen(LocalTime saturdayOpen) {
        this.saturdayOpen = saturdayOpen;
    }

    @Column(name = "saturday_close", nullable = false)
    public LocalTime getSaturdayClose() {
        return saturdayClose;
    }

    public void setSaturdayClose(LocalTime saturdayClose) {
        this.saturdayClose = saturdayClose;
    }

    @Column(name = "sunday_open", nullable = false)
    public LocalTime getSundayOpen() {
        return sundayOpen;
    }

    public void setSundayOpen(LocalTime sundayOpen) {
        this.sundayOpen = sundayOpen;
    }

    @Column(name = "sunday_close", nullable = false)
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
                ", gymType=" + gymType +
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
                gymType == gym.gymType &&
                Objects.equals(mondayFridayOpen, gym.mondayFridayOpen) &&
                Objects.equals(mondayFridayClose, gym.mondayFridayClose) &&
                Objects.equals(saturdayOpen, gym.saturdayOpen) &&
                Objects.equals(saturdayClose, gym.saturdayClose) &&
                Objects.equals(sundayOpen, gym.sundayOpen) &&
                Objects.equals(sundayClose, gym.sundayClose);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, name, location, website, details, phone, gymType, mondayFridayOpen, mondayFridayClose, saturdayOpen, saturdayClose, sundayOpen, sundayClose);
    }
}

