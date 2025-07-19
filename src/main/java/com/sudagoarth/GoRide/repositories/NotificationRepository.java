package com.sudagoarth.GoRide.repositories;

import com.sudagoarth.GoRide.entities.Notification;
import com.sudagoarth.GoRide.enumerations.NotificationTypeEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface NotificationRepository extends JpaRepository<Notification, UUID> {
    List<Notification> findByUserId(UUID userId);

    List<Notification> findByType(NotificationTypeEnum type);

    List<Notification> findByIsReadFalseAndUserId(UUID userId);
}
