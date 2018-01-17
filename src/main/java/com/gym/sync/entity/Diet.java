package com.gym.sync.entity;

import java.io.Serializable;

public class Diet implements Serializable {

    private static final long serialVersionUID = -3303888932946436785L;

    private long id;
    private String name;
    private long calories;
    private String details;
    private DietType dietType;

}
