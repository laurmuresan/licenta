package com.gym.sync.epo;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

/**
 * @author laurmuresan
 */
public class UserEpo implements Serializable {

    private static final long serialVersionUID = 4766570152191657103L;

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
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

    public UserEpo(long id, String firstName, String lastName, String email, String password, String username, String gender,
                   LocalDate birthDate, double height, double weight, String phoneNumber, String address,
                   RoleEpo role, PhotoEpo photo, GoalEpo goal, List<DietEpo> dietList) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.username = username;
        this.password = password;
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

    public String getPassword() {
        return password;
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
                ", password='" + password + '\'' +
                ", username='" + username + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDate=" + birthDate +
                ", height=" + height +
                ", weight=" + weight +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", role=" + role +
                ", photo=" + photo +
                ", goal=" + goal +
                ", dietList=" + dietList +
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
                Objects.equals(password, userEpo.password) &&
                Objects.equals(username, userEpo.username) &&
                Objects.equals(gender, userEpo.gender) &&
                Objects.equals(birthDate, userEpo.birthDate) &&
                Objects.equals(phoneNumber, userEpo.phoneNumber) &&
                Objects.equals(address, userEpo.address) &&
                Objects.equals(role, userEpo.role) &&
                Objects.equals(photo, userEpo.photo) &&
                Objects.equals(goal, userEpo.goal) &&
                Objects.equals(dietList, userEpo.dietList);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, firstName, lastName, email, password, username, gender, birthDate, height, weight, phoneNumber, address, role, photo, goal, dietList);
    }
}
