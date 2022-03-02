package com.seerbit.demo.repository;

import java.util.Optional;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.seerbit.demo.models.ERole;
import com.seerbit.demo.models.Role;


public interface RoleRepository extends MongoRepository<Role, String> {
  Optional<Role> findByName(ERole name);
}
