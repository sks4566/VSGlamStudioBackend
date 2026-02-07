package com.vsglamstudio.repository;

import com.vsglamstudio.model.CustomerService;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerServiceRepository extends MongoRepository<CustomerService, String> {
}
