package com.parul.bootcamp.project.repos;

import com.parul.bootcamp.project.entities.Customer;
import com.parul.bootcamp.project.entities.Seller;
import org.springframework.data.repository.CrudRepository;

public interface SellerRepository extends CrudRepository<Seller, Integer> {
}
