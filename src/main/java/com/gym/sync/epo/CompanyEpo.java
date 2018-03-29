package com.gym.sync.epo;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author laurmuresan
 */
public class CompanyEpo implements Serializable {

    private static final long serialVersionUID = 6138971291726900210L;

    private long id;
    private String name;
    private LocationEpo location;
    private String phoneNumber;
    private String socialMediaLink;
    private String description;

    private CompanyEpo() {
    }

    public CompanyEpo(long id, String name, LocationEpo location, String phoneNumber, String socialMediaLink,
                      String description) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.socialMediaLink = socialMediaLink;
        this.description = description;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getSocialMediaLink() {
        return socialMediaLink;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "CompanyEpo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", location=" + location +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", socialMediaLink='" + socialMediaLink + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompanyEpo that = (CompanyEpo) o;
        return id == that.id &&
                Objects.equals(name, that.name) &&
                Objects.equals(location, that.location) &&
                Objects.equals(phoneNumber, that.phoneNumber) &&
                Objects.equals(socialMediaLink, that.socialMediaLink) &&
                Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, location, phoneNumber, socialMediaLink, description);
    }
}
