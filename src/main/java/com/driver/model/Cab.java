package com.driver.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Cab {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer ratePerKm = 10;
    private boolean availability = true;

    @OneToOne(mappedBy = "cab",cascade = CascadeType.ALL)
    private Driver driver;

    public Cab () {}

    public Cab(Integer ratePerKm, boolean availability) {
        this.ratePerKm = ratePerKm;
        this.availability = availability;
    }

    public Cab(Integer ratePerKm, boolean availability, Driver driver) {
        this.ratePerKm = ratePerKm;
        this.availability = availability;
        this.driver = driver;
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

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }


}