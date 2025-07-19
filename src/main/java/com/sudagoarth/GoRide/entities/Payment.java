package com.sudagoarth.GoRide.entities;

import com.sudagoarth.GoRide.enumerations.PaymentMethodEnum;
import com.sudagoarth.GoRide.enumerations.PaymentStatusEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "payments")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Payment {

    @Id
    @GeneratedValue
    private UUID id;

    @OneToOne
    private Ride ride;

    @Enumerated(EnumType.STRING)
    private PaymentMethodEnum method;

    @Enumerated(EnumType.STRING)
    private PaymentStatusEnum status;

    private Double amount;
    private String transactionId;

    @Builder.Default
    private LocalDateTime createdAt = LocalDateTime.now();
}
