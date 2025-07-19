package com.sudagoarth.GoRide.repositories;

import com.sudagoarth.GoRide.entities.UserRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserRoleRepository extends JpaRepository<UserRole, Long> {
    List<UserRole> findByUserId(UUID userId);

    boolean existsByUserIdAndRoleId(UUID userId, Long roleId);
}
