package com.sudagoarth.GoRide.enumerations;

import lombok.Getter;

@Getter
public enum DriverStatusEnum {

    AVAILABLE("Available"),             // Driver is available for rides
    ON_RIDE("On Ride"),                 // Driver is currently on a ride
    OFFLINE("Offline"),                 // Driver is not available for rides
    BUSY("Busy");                       // Driver is occupied with other tasks

    private final String label;

    DriverStatusEnum(String label) {
        this.label = label;
    }

}
