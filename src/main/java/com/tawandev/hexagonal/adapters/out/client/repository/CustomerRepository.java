package com.tawandev.hexagonal.adapters.out.client.repository;

import com.tawandev.hexagonal.adapters.out.repository.entity.CustomerEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepository extends MongoRepository<CustomerEntity, String> {
}
