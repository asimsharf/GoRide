package com.sudagoarth.GoRide.enumerations;

import lombok.Getter;

@Getter
public enum PaymentStatusEnum {

    PENDING("Pending"),                     // Payment is pending
    PAID("Paid"),                           // Payment has been made
    FAILED("Failed"),                       // Payment has failed
    CANCELLED("Cancelled"),                 // Payment has been cancelled
    REFUNDED("Refunded");                   // Payment has been refunded

    private final String label;

    PaymentStatusEnum(String label) {
        this.label = label;
    }

}
