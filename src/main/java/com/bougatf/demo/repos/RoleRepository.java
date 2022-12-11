package com.bougatf.demo.repos;

import org.springframework.data. jpa.repository . JpaRepository;

import com.bougatf.demo.entites.Role;

public interface RoleRepository extends JpaRepository <Role, Long>{
  Role findByRole (String role);

}
