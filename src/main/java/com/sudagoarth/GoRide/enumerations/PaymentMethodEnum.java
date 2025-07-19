package com.sudagoarth.GoRide.enumerations;

import lombok.Getter;

@Getter
public enum PaymentMethodEnum {

    CASH("Cash"),                           // Cash payment method
    CARD("Credit/Debit Card"),              // Credit or Debit Card payment method
    MADA("Mada"),                           // Mada payment method, a local payment network in Saudi Arabia
    APPLE_PAY("Apple Pay"),                 // Apple Pay payment method
    GOOGLE_PAY("Google Pay"),               // Google Pay payment method
    STC_PAY("STC Pay"),                     // STC Pay payment method, a popular mobile wallet in Saudi Arabia
    WALLET("In-App Wallet");                // In-App Wallet payment method

    private final String label;

    PaymentMethodEnum(String label) {
        this.label = label;
    }

}
