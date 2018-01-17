package com.gym.sync.epo;

import com.gym.sync.entity.utility.Location;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;

import java.io.Serializable;

public class EventEpo implements Serializable {

    private static final long serialVersionUID = 6586807749962157261L;

    private String id;
    private String name;
    private LocalDate date;
    private String details;
    private Location location;
    private LocalDateTime startEvent;
    private LocalDateTime endEvent;

    private EventEpo(){

    }
}
