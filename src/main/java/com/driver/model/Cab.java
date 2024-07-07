package com.driver.model;

import javax.persistence.Id;


public class Cab {

    @Id
    private Integer id;
    private Integer ratePerKm = 10;
    private boolean availability = true;


    public Cab(Integer ratePerKm, boolean availability) {
        this.ratePerKm = ratePerKm;
        this.availability = availability;
    }

    public Integer getPerKmRate() {
        return ratePerKm;
    }

    public boolean getAvailable() {
        return availability;
    }

    public void setAvailable(boolean availability) {
        this.availability = availability;
    }

    public void setPerKmRate(Integer ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }



}