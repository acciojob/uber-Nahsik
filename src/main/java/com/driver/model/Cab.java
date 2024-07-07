package com.driver.model;

import io.swagger.models.auth.In;

public class Cab {

    private Integer ratePerKm = 10;
    private boolean availability = true;


    public Cab(Integer ratePerKm, boolean availability) {
        this.ratePerKm = ratePerKm;
        this.availability = availability;
    }

    public Integer getRatePerKm() {
        return ratePerKm;
    }

    public boolean getAvailable() {
        return availability;
    }

    public void setAvailable(boolean availability) {
        this.availability = availability;
    }

    public void setRatePerKm(Integer ratePerKm) {
        this.ratePerKm = ratePerKm;
    }
}