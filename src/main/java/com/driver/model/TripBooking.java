package com.driver.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class TripBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer tripBookingId;
    @Enumerated(value = EnumType.STRING)
    private TripStatus status;
    private String fromLocation;
    private String toLocation;
    private Integer distanceInKm;
    private Integer bill;
    //it is child w.r.t Customer
    @ManyToOne
    @JoinColumn
    private Customer customer;

    //it is child w.r.t Driver
    @ManyToOne
    @JoinColumn
    private Driver driver;

    public TripBooking() {
    }

    public TripBooking(Customer customer, String fromLocation, String toLocation, int distanceInKm) {
        this.customer = customer;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.distanceInKm = distanceInKm;
        status = TripStatus.CONFIRMED;
    }

    public TripBooking(Customer customer, String fromLocation, String toLocation, int distanceInKm, Driver driver) {
        this.customer = customer;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.distanceInKm = distanceInKm;
        this.driver = driver;
        status = TripStatus.CONFIRMED;
    }

    public Integer getTripBookingId() {
        return tripBookingId;
    }

    public void setTripBookingId(Integer tripBookingId) {
        this.tripBookingId = tripBookingId;
    }

    public TripStatus getStatus() {
        return status;
    }

    public void setStatus(TripStatus status) {
        this.status = status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public Integer getDistanceInKm() {
        return distanceInKm;
    }

    public void setDistanceInKm(Integer distanceInKm) {
        this.distanceInKm = distanceInKm;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public Integer getBill(){
        return bill;
    }

    public void setBill(Integer bill){
        this.bill = bill;
    }

}