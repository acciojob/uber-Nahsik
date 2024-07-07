package com.driver.model;

import javax.persistence.Id;

public class Customer {


    @Id
    private Integer customerId;
    private String customerName;
    private String password;
    private String username;
    private String mobile;

    public Customer() {
    }

    public Customer(Integer customerId, String customerName, String password, String username, String mobile) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.password = password;
        this.username = username;
        this.mobile = mobile;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }



}