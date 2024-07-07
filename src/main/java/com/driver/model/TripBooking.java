package com.driver.model;

import javax.persistence.Id;

public class TripBooking {

    @Id
    private Integer tripBookingId;
    private TripStatus tripStatus;
    private Integer customerId;
    private Integer driverId;
    private String fromLocation;
    private String toLocation;
    private Integer distanceInKm;


    public TripBooking(Integer customerId, String fromLocation, String toLocation, Integer distanceInKm) {
        this.customerId = customerId;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.distanceInKm = distanceInKm;
        tripStatus = TripStatus.CONFIRMED;
    }

    public Integer getTripBookingId() {
        return tripBookingId;
    }

    public void setTripBookingId(Integer tripBookingId) {
        this.tripBookingId = tripBookingId;
    }

    public TripStatus getTripStatus() {
        return tripStatus;
    }

    public void setTripStatus(TripStatus tripStatus) {
        this.tripStatus = tripStatus;
    }

    public Integer getCustomerID() {
        return this.customerId;
    }

    public void setCustomer(Integer customerId) {
        this.customerId = customerId;
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

    public Integer getDriverId() {
        return driverId;
    }

    public void setDriverId(Integer driverId) {
        this.driverId = driverId;
    }

}