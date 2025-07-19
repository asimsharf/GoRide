package com.sudagoarth.GoRide.repositories;

import com.sudagoarth.GoRide.entities.Ride;
import com.sudagoarth.GoRide.enumerations.RideStatusEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface RideRepository extends JpaRepository<Ride, UUID> {
    List<Ride> findByPassengerId(UUID passengerId);

    List<Ride> findByDriverId(UUID driverId);

    List<Ride> findByStatus(RideStatusEnum status);
}
