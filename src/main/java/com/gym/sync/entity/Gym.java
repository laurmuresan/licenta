package com.gym.sync.entity;

import org.joda.time.LocalTime;

import java.io.Serializable;

public class Gym implements Serializable {

    private static final long serialVersionUID = 7873859243956216412L;

    private long id;
    private String name;
    private Location location;
    private String website;
    private String details;
    private String phone;
    private LocalTime mondayFridayOpen;
    private LocalTime mondayFridayClose;
    private LocalTime saturdayOpen;
    private LocalTime saturdayClose;
    private LocalTime sundayOpen;
    private LocalTime sundayClose;
    private GymType gymtype;

    public Gym(){

    }

}

