package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Permission;

/**
 * PermissionRepository
 */
@Repository
public interface PermissionRepository extends JpaRepository<Permission, Integer> {
    
}