package com.gym.sync.epo;

import com.gym.sync.entity.gym.GymType;
import com.gym.sync.entity.utility.Location;
import org.joda.time.LocalTime;

import java.io.Serializable;

public class GymEpo implements Serializable {

    private static final long serialVersionUID = -921377306588723386L;

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

    public GymEpo(){

    }
}
