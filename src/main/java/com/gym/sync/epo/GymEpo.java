package com.gym.sync.epo;

import java.io.Serializable;
import java.time.LocalTime;
import java.util.Objects;

/**
 * @author laurmuresan
 */
public class GymEpo implements Serializable {

    private static final long serialVersionUID = -921377306588723386L;

    private long id;
    private String name;
    private LocationEpo location;
    private String website;
    private String details;
    private String phone;
    private String gymType;
    private LocalTime mondayFridayOpen;
    private LocalTime mondayFridayClose;
    private LocalTime saturdayOpen;
    private LocalTime saturdayClose;
    private LocalTime sundayOpen;
    private LocalTime sundayClose;
    private CompanyEpo company;

    private GymEpo() {
    }

    public GymEpo(long id, String name, LocationEpo location, String website, String details, String phone, String gymType,
                  LocalTime mondayFridayOpen, LocalTime mondayFridayClose, LocalTime saturdayOpen,
                  LocalTime saturdayClose, LocalTime sundayOpen, LocalTime sundayClose, CompanyEpo company) {
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
        this.company = company;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocationEpo getLocation() {
        return location;
    }

    public String getWebsite() {
        return website;
    }

    public String getDetails() {
        return details;
    }

    public String getPhone() {
        return phone;
    }

    public String getGymType() {
        return gymType;
    }

    public LocalTime getMondayFridayOpen() {
        return mondayFridayOpen;
    }

    public LocalTime getMondayFridayClose() {
        return mondayFridayClose;
    }

    public LocalTime getSaturdayOpen() {
        return saturdayOpen;
    }

    public LocalTime getSaturdayClose() {
        return saturdayClose;
    }

    public LocalTime getSundayOpen() {
        return sundayOpen;
    }

    public LocalTime getSundayClose() {
        return sundayClose;
    }

    public CompanyEpo getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "GymEpo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location=" + location +
                ", website='" + website + '\'' +
                ", details='" + details + '\'' +
                ", phone='" + phone + '\'' +
                ", gymType='" + gymType + '\'' +
                ", mondayFridayOpen=" + mondayFridayOpen +
                ", mondayFridayClose=" + mondayFridayClose +
                ", saturdayOpen=" + saturdayOpen +
                ", saturdayClose=" + saturdayClose +
                ", sundayOpen=" + sundayOpen +
                ", sundayClose=" + sundayClose +
                ", company=" + company +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GymEpo gymEpo = (GymEpo) o;
        return id == gymEpo.id &&
                Objects.equals(name, gymEpo.name) &&
                Objects.equals(location, gymEpo.location) &&
                Objects.equals(website, gymEpo.website) &&
                Objects.equals(details, gymEpo.details) &&
                Objects.equals(phone, gymEpo.phone) &&
                Objects.equals(gymType, gymEpo.gymType) &&
                Objects.equals(mondayFridayOpen, gymEpo.mondayFridayOpen) &&
                Objects.equals(mondayFridayClose, gymEpo.mondayFridayClose) &&
                Objects.equals(saturdayOpen, gymEpo.saturdayOpen) &&
                Objects.equals(saturdayClose, gymEpo.saturdayClose) &&
                Objects.equals(sundayOpen, gymEpo.sundayOpen) &&
                Objects.equals(sundayClose, gymEpo.sundayClose) &&
                Objects.equals(company, gymEpo.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, location, website, details, phone, gymType, mondayFridayOpen, mondayFridayClose, saturdayOpen, saturdayClose, sundayOpen, sundayClose, company);
    }
}
