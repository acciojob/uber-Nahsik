package com.driver.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Driver {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer driverId;
    private String mobile;
    private String password;

    @OneToOne
    @JoinColumn
    private Cab cab;

    @OneToMany
    private List<TripBooking> tripBookingList=new ArrayList<>();

    public Driver() {
    }

    public Driver(String mobile, String password, Cab cab) {
        this.mobile = mobile;
        this.password = password;
        this.cab = cab;
    }

    public Integer getDriverId() {
        return driverId;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Cab getCab() {
        return cab;
    }

    public void setCab(Cab cab) {
        this.cab = cab;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

    public List<TripBooking> getTripBookingList() {
        return tripBookingList;
    }

    public void setTripBookingList(List<TripBooking> tripBookingList) {
        this.tripBookingList = tripBookingList;
    }
}