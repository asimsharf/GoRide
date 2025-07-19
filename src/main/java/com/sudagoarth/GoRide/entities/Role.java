package com.sudagoarth.GoRide.entities;

import com.sudagoarth.GoRide.utils.LocaledData;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "roles", uniqueConstraints = {@UniqueConstraint(name = "unique_role_key", columnNames = "role_key")})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false, length = 50)
    private String roleKey;

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
