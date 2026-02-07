package com.vsglamstudio.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Document(collection = "CustomerService")
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerService {

    @Id
    private String id;
    private Integer serviceTypeId;
    private String title;
    private String description;
    private String imageUrl;
    private BigDecimal price;
}
