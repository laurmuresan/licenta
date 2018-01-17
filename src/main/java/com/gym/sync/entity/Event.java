package com.gym.sync.entity;

import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;

import java.io.Serializable;

public class Event implements Serializable{

    private static final long serialVersionUID = 5656903129153453979L;

    private String id;
    private String name;
    private LocalDate date;
    private String details;
    private Location location;
    private String phone;
    private LocalDateTime startEvent;
    private LocalDateTime endEvent;

    public Event (){

    }
}
