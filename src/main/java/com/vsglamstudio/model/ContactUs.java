package com.vsglamstudio.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "contacts")
public class ContactUs {
    @Id
    private String id;
    private String phoneNumber;
    private String email;
    private String address;
}
