package com.parul.bootcamp.project.repos;

import com.parul.bootcamp.project.Enum.RoleEnum;
import com.parul.bootcamp.project.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface RoleRepository extends JpaRepository<Role,Integer> {
    Set<Role> findById(int id);

    public Role findByAuthority(RoleEnum roleEnum);

}

