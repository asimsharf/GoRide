package com.sudagoarth.GoRide.enumerations;

import lombok.Getter;

@Getter
public enum NotificationTypeEnum {

    RIDE_REQUEST("Ride Request"),           // Ride request notification
    RIDE_ACCEPTED("Ride Accepted"),         // Ride accepted notification
    RIDE_STARTED("Ride Started"),           // Ride started notification
    RIDE_COMPLETED("Ride Completed"),       // Ride completed notification
    RIDE_CANCELLED("Ride Cancelled"),       // Ride cancelled notification
    DRIVER_ARRIVED("Driver Arrived"),       // Driver has arrived at the pickup location
    DRIVER_ASSIGNED("Driver Assigned"),     // Driver has been assigned to a ride
    DRIVER_RATED("Driver Rated"),           // Driver has been rated by the passenger
    PAYMENT_SUCCESS("Payment Success"),     // Payment successful notification
    PAYMENT_FAILED("Payment Failed"),       // Payment failed notification
    REFUND_ISSUED("Refund Issued"),         // Refund has been issued
    PROMOTION("Promotion"),                 // Promotional notification
    SYSTEM_ALERT("System Alert"),           // System alert notification
    ACCOUNT_WARNING("Account Warning"),     // Account warning notification
    ACCOUNT_BAN("Account Banned"),          // Account has been banned
    CHAT_MESSAGE("Chat Message"),           // New chat message notification
    SUPPORT_REPLY("Support Reply");         // Reply from support team

    private final String label;

    NotificationTypeEnum(String label) {
        this.label = label;
    }

}
