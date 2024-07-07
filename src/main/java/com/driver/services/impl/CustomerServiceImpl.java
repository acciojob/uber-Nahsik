package com.driver.services.impl;

import com.driver.model.Cab;
import com.driver.model.TripBooking;
import com.driver.services.CustomerService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.driver.model.Customer;
import com.driver.model.Driver;
import com.driver.repository.CustomerRepository;
import com.driver.repository.DriverRepository;
import com.driver.repository.TripBookingRepository;
import com.driver.model.TripStatus;

import java.util.ArrayList;
import java.util.List;

import io.swagger.annotations.Example;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository2;

    @Autowired
    DriverRepository driverRepository2;

    @Autowired
    TripBookingRepository tripBookingRepository2;

    @Override
    public void register(Customer customer) {
        customerRepository2.save(customer);
        //Save the customer in the database
    }

    @Override
    public void deleteCustomer(Integer customerId) {
        customerRepository2.deleteById(customerId);
        // Delete customer without using deleteById function

    }

    @Override
    public TripBooking bookTrip(int customerId, String fromLocation, String toLocation, int distanceInKm) throws Exception {
        Customer customer = customerRepository2.getOne(customerId);
        List<Driver> drivers = driverRepository2.findAll();

        Driver driver = null;
        for (Driver eachDriver : drivers) {
            if (!eachDriver.getCab().getAvailable()) {
                continue;
            }
            if (null == driver) {
                driver = eachDriver;
            } else if (eachDriver.getDriverId() < driver.getDriverId()) {
                driver = eachDriver;
            }
        }
        if (null == driver) {
            throw new Exception("No cab available!");
        }
        TripBooking tripBooking = new TripBooking(customer, fromLocation, toLocation, distanceInKm, driver);
        tripBookingRepository2.save(tripBooking);
        Cab cab = driver.getCab();
        cab.setAvailable(false);
        driver.setCab(cab);
        driverRepository2.save(driver);
        return tripBooking;
        //Book the driver with lowest driverId who is free (cab available variable is Boolean.TRUE). If no driver is available, throw "No cab available!" exception
        //Avoid using SQL query

    }

    @Override
    public void cancelTrip(Integer tripId) {
		TripBooking trip = tripBookingRepository2.getOne(tripId);
		trip.setStatus(TripStatus.CANCELED);
		tripBookingRepository2.save(trip);
		Driver driver = trip.getDriver();
        Cab cab = driver.getCab();
        cab.setAvailable(false);
        driver.setCab(cab);
        driverRepository2.save(driver);
        //Cancel the trip having given trip Id and update TripBooking attributes accordingly

    }

    @Override
    public void completeTrip(Integer tripId) {
		TripBooking trip = tripBookingRepository2.getOne(tripId);
		trip.setStatus(TripStatus.COMPLETED);
		tripBookingRepository2.save(trip);
		Driver driver = trip.getDriver();
        Cab cab = driver.getCab();
        cab.setAvailable(false);
        driver.setCab(cab);
        driverRepository2.save(driver);
        //Complete the trip having given trip Id and update TripBooking attributes accordingly
    }

}
