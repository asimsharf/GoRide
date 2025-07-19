package com.sudagoarth.GoRide.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "locations")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Location {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    private User user;

    private Double latitude;
    private Double longitude;

    @Builder.Default
    private LocalDateTime updatedAt = LocalDateTime.now();
}
