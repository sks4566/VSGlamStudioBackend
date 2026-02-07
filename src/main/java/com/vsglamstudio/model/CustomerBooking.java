package com.vsglamstudio.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "bookings")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerBooking {
    @Id
    private String id;
    private String name;
    private String phone;
    private String email;
    private String eventType;
    private String eventDate;
    private String city;
    private String notes;
}
