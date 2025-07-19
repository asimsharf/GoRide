package com.sudagoarth.GoRide.entities;

import com.sudagoarth.GoRide.enumerations.UserTypeEnum;
import com.sudagoarth.GoRide.utils.LocaledData;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue
    private UUID id;

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "english", column = @Column(name = "full_name_en")), @AttributeOverride(name = "arabic", column = @Column(name = "full_name_ar"))})
    private LocaledData fullName;

    @Column(unique = true, nullable = false, length = 20)
    private String phoneNumber;

    @Column(unique = true)
    private String email;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 20)
    private UserTypeEnum userType;

    @Column(nullable = false)
    private boolean isPhoneVerified = false;

    @Column(nullable = false)
    private boolean isEmailVerified = false;

    private String profileImageUrl;
    private String nationalIdNumber;
    private String nationalIdImageUrl;

    private String fcmToken;
    private String preferredLanguage = "en";

    private boolean isDeleted = false;


    private boolean isBlocked = false;

    @Builder.Default
    private LocalDateTime createdAt = LocalDateTime.now();

    @Builder.Default
    private LocalDateTime updatedAt = LocalDateTime.now();
}
