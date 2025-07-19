package com.sudagoarth.GoRide.enumerations;

import lombok.Getter;

@Getter
public enum RideStatusEnum {

    PENDING("Pending"),                 // Ride is waiting for acceptance
    ACCEPTED("Accepted"),               // Ride has been accepted by a driver
    STARTED("Started"),                 // Ride has started
    COMPLETED("Completed"),             // Ride has been completed
    CANCELLED("Cancelled");             // Ride has been cancelled by either the rider or driver

    private final String label;

    RideStatusEnum(String label) {
        this.label = label;
    }

}
