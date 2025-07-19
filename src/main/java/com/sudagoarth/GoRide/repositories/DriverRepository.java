package com.sudagoarth.GoRide.repositories;

import com.sudagoarth.GoRide.entities.DriverProfile;
import com.sudagoarth.GoRide.enumerations.DriverStatusEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface DriverRepository extends JpaRepository<DriverProfile, UUID> {
    Optional<DriverProfile> findByUserId(UUID userId);

    List<DriverProfile> findByStatus(DriverStatusEnum status);
}
