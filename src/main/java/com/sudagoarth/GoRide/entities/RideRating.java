package com.sudagoarth.GoRide.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "ride_ratings")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RideRating {

    @Id
    @GeneratedValue
    private UUID id;

    @OneToOne
    private Ride ride;

    private Integer passengerRating;
    private Integer driverRating;
    private String comments;

    @Builder.Default
    private LocalDateTime createdAt = LocalDateTime.now();
}
