package com.sudagoarth.GoRide.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "admin_actions")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AdminAction {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    private User admin;

    private String actionType;
    private UUID targetId;
    private String description;

    @Builder.Default
    private LocalDateTime createdAt = LocalDateTime.now();
}
