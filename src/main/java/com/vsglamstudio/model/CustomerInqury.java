package com.vsglamstudio.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "CustomerInquiries")
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerInqury {
    @Id
    private String id;
    private String name;
    private String email;
    private String phone;
    private String message;
}
