package com.vsglamstudio.repository;

import com.vsglamstudio.model.CustomerBooking;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends MongoRepository<CustomerBooking, String> {
}
