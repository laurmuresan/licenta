package com.gym.sync.entity.utility;

import org.joda.time.LocalDate;

import java.io.Serializable;
/*
    STILL IN PROGRESS
 */
public class DailyReport implements Serializable{

    private static final long serialVersionUID = 3040023761979009702L;

    private long id;
    private long userId;
    private LocalDate date;
    private double weight;
}
