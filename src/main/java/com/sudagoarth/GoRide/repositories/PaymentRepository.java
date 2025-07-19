package com.sudagoarth.GoRide.repositories;

import com.sudagoarth.GoRide.entities.Payment;
import com.sudagoarth.GoRide.enumerations.PaymentStatusEnum;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, UUID> {

    List<Payment> findByRideId(UUID rideId);

    List<Payment> findByStatus(PaymentStatusEnum status);
}
