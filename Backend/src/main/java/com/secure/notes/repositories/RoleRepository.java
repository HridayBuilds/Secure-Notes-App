package com.secure.notes.repositories;

import com.secure.notes.models.AppRole;
import com.secure.notes.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByRoleName(AppRole appRole);
    // Using Optional prevents NullPointerException.
    // Optional<Role> → It may or may not find a role.
    //If a role exists → returns it
    //If not → returns Optional.empty()
}
