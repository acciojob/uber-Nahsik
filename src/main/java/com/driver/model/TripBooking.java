package com.driver.model;

import javax.persistence.Id;

public class TripBooking {

    @Id
    private Integer tripBookingId;
    private TripStatus status;
    private Customer customer;
    private Driver driver;
    private String fromLocation;
    private String toLocation;
    private Integer distanceInKm;
    private Integer bill;


    public TripBooking(Customer customer, String fromLocation, String toLocation, Integer distanceInKm) {
        this.customer = customer;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.distanceInKm = distanceInKm;
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
        return distanceInKm * driver.getCab().getRatePerKm();
    }

}