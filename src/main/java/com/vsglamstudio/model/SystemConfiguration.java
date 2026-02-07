package com.vsglamstudio.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Document(collection = "systemConfigurations")
public class SystemConfiguration {

    @Id
    private String id;
    private String title;
    private String description;
    private String imageUrl;
    private BigDecimal price;
}
