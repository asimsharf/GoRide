package com.sudagoarth.GoRide.repositories;

import com.sudagoarth.GoRide.entities.UserPermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface UserPermissionRepository extends JpaRepository<UserPermission, Long> {
    List<UserPermission> findByUserId(UUID userId);

    boolean existsByUserIdAndPermissionId(UUID userId, Long permissionId);
}
