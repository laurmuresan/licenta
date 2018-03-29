package com.gym.sync.entity.company;

import com.gym.sync.entity.utility.Location;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author laurmuresan
 */
@Entity
@Table(name = "company")
@SequenceGenerator(sequenceName = "company_seq", allocationSize = 1, name = "CompanySeq")
public class Company implements Serializable {

    private static final long serialVersionUID = -6215243597099711036L;

    private long id;
    private String name;
    private Location location;
    private String phoneNumber;
    private String socialMediaLink;
    private String description;

    public Company() {
    }

    public Company(long id, String name, Location location, String phoneNumber, String socialMediaLink,
                   String description) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.phoneNumber = phoneNumber;
        this.socialMediaLink = socialMediaLink;
        this.description = description;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CompanySeq")
    @Column(name = "company_id", unique = true, nullable = false)
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

    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "location_id")
    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    @Column(name = "phone", nullable = false)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Column(name = "social_media_link", nullable = false)
    public String getSocialMediaLink() {
        return socialMediaLink;
    }

    public void setSocialMediaLink(String socialMediaLink) {
        this.socialMediaLink = socialMediaLink;
    }

    @Column(name = "description", nullable = false)
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Company{" +
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
        Company company = (Company) o;
        return id == company.id &&
                Objects.equals(name, company.name) &&
                Objects.equals(location, company.location) &&
                Objects.equals(phoneNumber, company.phoneNumber) &&
                Objects.equals(socialMediaLink, company.socialMediaLink) &&
                Objects.equals(description, company.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, location, phoneNumber, socialMediaLink, description);
    }
}
