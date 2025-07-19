package com.sudagoarth.GoRide.enumerations;

import lombok.Getter;

@Getter
public enum UserTypeEnum {

    PASSENGER("Passenger"),         // App rider
    DRIVER("Driver"),               // App driver
    ADMIN("Admin"),                 // Admin panel
    DISPATCHER("Dispatcher"),       // Assigns rides manually or oversees flow
    OPERATOR("Operator"),           // Call center or operational staff
    SUPPORT("Support"),             // Support staff managing tickets/issues
    SUPER_ADMIN("Super Admin");     // System owner or top-level admin

    private final String label;

    UserTypeEnum(String label) {
        this.label = label;
    }

}
