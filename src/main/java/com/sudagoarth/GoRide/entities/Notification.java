package com.sudagoarth.GoRide.entities;

import com.sudagoarth.GoRide.enumerations.NotificationTypeEnum;
import com.sudagoarth.GoRide.utils.LocaledData;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "notifications")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Notification {

    @Id
    @GeneratedValue
    private UUID id;

    @ManyToOne
    private User user;

    @Enumerated(EnumType.STRING)
    private NotificationTypeEnum type;

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "english", column = @Column(name = "title_en")), @AttributeOverride(name = "arabic", column = @Column(name = "title_ar"))})
    private LocaledData title;

    @Embedded
    @AttributeOverrides({@AttributeOverride(name = "english", column = @Column(name = "message_en")), @AttributeOverride(name = "arabic", column = @Column(name = "message_ar"))})
    private LocaledData message;

    private boolean isRead = false;

    @Builder.Default
    private LocalDateTime createdAt = LocalDateTime.now();
}
