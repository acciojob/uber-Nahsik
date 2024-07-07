package com.driver.model;

import javax.persistence.Id;

public class Driver {

    @Id
    private Integer driverId;
    private String mobile;
    private String password;
    private Cab cab;

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
}