package com.parul.bootcamp.project.repos;

import com.parul.bootcamp.project.entities.Address;
import org.springframework.data.repository.CrudRepository;

public interface AddressRepository extends CrudRepository<Address, Integer> {
}
