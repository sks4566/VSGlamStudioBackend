package com.vsglamstudio.repository;

import com.vsglamstudio.model.CustomerBooking;
import com.vsglamstudio.model.CustomerInqury;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerInquryRepository extends MongoRepository<CustomerInqury, String> {
}
