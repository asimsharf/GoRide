package com.sudagoarth.GoRide.repositories;

import com.sudagoarth.GoRide.entities.Permission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface PermissionRepository extends JpaRepository<Permission, UUID> {
    Optional<Permission> findByPermissionKey(String permissionKey);
}
