package com.parul.bootcamp.project.repos;

import com.parul.bootcamp.project.entities.Address;
import com.parul.bootcamp.project.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Integer> {
}
