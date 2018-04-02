package com.gym.sync.epo;

import org.joda.time.LocalDate;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @author laurmuresan
 */
public class UserEpo implements Serializable {

    private static final long serialVersionUID = -3590571318994602803L;

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private String gender;
    private LocalDate birthDate;
    private double height;
    private double weight;
    private String phoneNumber;
    private String address;
    private RoleEpo role;
    private PhotoEpo photo;
    private GoalEpo goal;
    private List<DietEpo> dietList;

    private UserEpo() {
    }

    public UserEpo(long id, String firstName, String lastName, String email, String username, String gender,
                   LocalDate birthDate, double height, double weight, String phoneNumber, String address,
                   RoleEpo role, PhotoEpo photo, GoalEpo goal, List<DietEpo> dietList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.gender = gender;
        this.birthDate = birthDate;
        this.height = height;
        this.weight = weight;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.role = role;
        this.photo = photo;
        this.dietList = dietList;
        this.goal = goal;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public RoleEpo getRole() {
        return role;
    }

    public PhotoEpo getPhoto() {
        return photo;
    }

    public List<DietEpo> getDietList() {
        return dietList;
    }

    public GoalEpo getGoal() {
        return goal;
    }

    @Override
    public String toString() {
        return "UserEpo{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate=" + birthDate +
                ", height=" + height +
                ", weight=" + weight +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", role=" + role +
                ", photo=" + photo +
                ", dietList=" + dietList +
                ", goal=" + goal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserEpo userEpo = (UserEpo) o;
        return id == userEpo.id &&
                Double.compare(userEpo.height, height) == 0 &&
                Double.compare(userEpo.weight, weight) == 0 &&
                Objects.equals(firstName, userEpo.firstName) &&
                Objects.equals(lastName, userEpo.lastName) &&
                Objects.equals(email, userEpo.email) &&
                Objects.equals(username, userEpo.username) &&
                Objects.equals(gender, userEpo.gender) &&
                Objects.equals(birthDate, userEpo.birthDate) &&
                Objects.equals(phoneNumber, userEpo.phoneNumber) &&
                Objects.equals(address, userEpo.address) &&
                Objects.equals(role, userEpo.role) &&
                Objects.equals(photo, userEpo.photo) &&
                Objects.equals(dietList, userEpo.dietList) &&
                Objects.equals(goal, userEpo.goal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, username, gender, birthDate, height, weight, phoneNumber, address, role, photo, dietList, goal);
    }
}
