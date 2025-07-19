package com.sudagoarth.GoRide.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "role_permissions", uniqueConstraints = {@UniqueConstraint(name = "unique_role_permission", columnNames = {"role_id", "permission_id"})})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RolePermission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "role_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_role_permission_role_id"))
    private Role role;

    @ManyToOne(optional = false)
    @JoinColumn(name = "permission_id", referencedColumnName = "id", foreignKey = @ForeignKey(name = "FK_role_permission_permission_id"))
    private Permission permission;
}
