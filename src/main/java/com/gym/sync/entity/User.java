package com.gym.sync.entity;


import org.joda.time.LocalDate;

import java.io.Serializable;

public class User implements Serializable{

    private static final long serialVersionUID = -4799064125572011553L;

    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String username;
    private Role role;
    private Gender gender;
    private LocalDate birthDate;
    private double height;
    private double weight;
    private String phoneNumber;
    private String address;
    private Photo photo;




    public User() {

    }


}
