package com.sudagoarth.GoRide.entities;

import com.sudagoarth.GoRide.utils.LocaledData;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "permissions", uniqueConstraints = {@UniqueConstraint(name = "unique_permission_key", columnNames = "permission_key")})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Permission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 100)
    private String permissionKey;

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "english", column = @Column(name = "name_en")), @AttributeOverride(name = "arabic", column = @Column(name = "name_ar"))})
    private LocaledData name;

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "english", column = @Column(name = "description_en")), @AttributeOverride(name = "arabic", column = @Column(name = "description_ar"))})
    private LocaledData description;

    @Column(name = "created_at")
    @Builder.Default
    private LocalDateTime createdAt = LocalDateTime.now();
}
