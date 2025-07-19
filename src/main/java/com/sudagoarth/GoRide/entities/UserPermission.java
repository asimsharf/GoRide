package com.sudagoarth.GoRide.entities;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name = "user_permissions")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserPermission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "FK_user_permission_user_id"))
    private User user;

    @ManyToOne(optional = false)
    @JoinColumn(name = "permission_id", foreignKey = @ForeignKey(name = "FK_user_permission_permission_id"))
    private Permission permission;
}
