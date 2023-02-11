package com.gokalp.springsecjwt.repository;


import com.gokalp.springsecjwt.models.ERole;
import com.gokalp.springsecjwt.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * @author Gokalp on 16.01.2023
 * @project SpringSecJwt
 */
@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(ERole name);
}
