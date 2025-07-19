package com.sudagoarth.GoRide.repositories;

import com.sudagoarth.GoRide.entities.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, UUID> {
    List<Vehicle> findByDriverId(UUID driverId);

    Optional<Vehicle> findByPlateNumber(String plateNumber);
}
