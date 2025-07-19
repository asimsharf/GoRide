package com.sudagoarth.GoRide.entities;

import com.sudagoarth.GoRide.enumerations.RideStatusEnum;
import com.sudagoarth.GoRide.utils.LocaledData;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "rides")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Ride {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    private User passenger;

    @ManyToOne
    private User driver;

    private Double pickupLat;
    private Double pickupLng;

    private Double dropLat;
    private Double dropLng;

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "english", column = @Column(name = "pickup_address_en")), @AttributeOverride(name = "arabic", column = @Column(name = "pickup_address_ar"))})
    private LocaledData pickupAddress;

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "english", column = @Column(name = "drop_address_en")), @AttributeOverride(name = "arabic", column = @Column(name = "drop_address_ar"))})
    private LocaledData dropAddress;

    @Enumerated(EnumType.STRING)
    private RideStatusEnum status;

    private Double fareEstimate;
    private Double fareFinal;
    private Float distanceKm;
    private Float durationMin;

    private LocalDateTime requestedAt;
    private LocalDateTime completedAt;
}
