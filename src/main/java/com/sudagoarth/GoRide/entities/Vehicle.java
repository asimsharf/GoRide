package com.sudagoarth.GoRide.entities;

import com.sudagoarth.GoRide.utils.LocaledData;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@Entity
@Table(name = "vehicles")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Vehicle {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    @JoinColumn(name = "driver_id")
    private User driver;

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "english", column = @Column(name = "type_en")), @AttributeOverride(name = "arabic", column = @Column(name = "type_ar"))})
    private LocaledData type;

    private String brand;
    private String model;

    @Column(unique = true)
    private String plateNumber;

    private String color;
}
