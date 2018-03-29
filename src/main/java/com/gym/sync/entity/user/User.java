package com.gym.sync.entity.user;

import com.gym.sync.entity.utility.Goal;
import org.joda.time.LocalDate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author laurmuresan
 */
@Entity
@Table(name = "user")
@SequenceGenerator(sequenceName = "user_seq", allocationSize = 1, name = "UserSeq")
public class User implements Serializable {

    private static final long serialVersionUID = -4799064125572011553L;

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private Gender gender;
    private LocalDate birthDate;
    private double height;
    private double weight;
    private String phoneNumber;
    private String address;
    private Role role;
    private Photo photo;
    private Goal goal;

    public User() {
    }

    public User(long id, String firstName, String lastName, String email, String username, Gender gender,
                LocalDate birthDate, double height, double weight, String phoneNumber, String address,
                Role role, Photo photo, Goal goal) {
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
        this.goal = goal;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "UserSeq")
    @Column(name = "user_id", unique = true, nullable = false)
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Column(name = "first_name", nullable = false)
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "last_name", nullable = false)
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "email", nullable = false)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "username", nullable = false)
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "gender", nullable = false)
    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Column(name = "birth_date", nullable = false)
    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Column(name = "height", nullable = false)
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Column(name = "weight", nullable = false)
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Column(name = "phone_number", nullable = false)
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Column(name = "address", nullable = false)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Column(name = "role", nullable = false)
    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    @Column(name = "photo", nullable = false)
    public Photo getPhoto() {
        return photo;
    }

    public void setPhoto(Photo photo) {
        this.photo = photo;
    }

    @Column(name = "goal")
    public Goal getGoal() {
        return goal;
    }

    public void setGoal(Goal goal) {
        this.goal = goal;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", birthDate=" + birthDate +
                ", height=" + height +
                ", weight=" + weight +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", role=" + role +
                ", photo=" + photo +
                ", goal=" + goal +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id &&
                Double.compare(user.height, height) == 0 &&
                Double.compare(user.weight, weight) == 0 &&
                Objects.equals(firstName, user.firstName) &&
                Objects.equals(lastName, user.lastName) &&
                Objects.equals(email, user.email) &&
                Objects.equals(username, user.username) &&
                gender == user.gender &&
                Objects.equals(birthDate, user.birthDate) &&
                Objects.equals(phoneNumber, user.phoneNumber) &&
                Objects.equals(address, user.address) &&
                Objects.equals(role, user.role) &&
                Objects.equals(photo, user.photo) &&
                Objects.equals(goal, user.goal);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, email, username, gender, birthDate, height, weight, phoneNumber, address, role, photo, goal);
    }
}
