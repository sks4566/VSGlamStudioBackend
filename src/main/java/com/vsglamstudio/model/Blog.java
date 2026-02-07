package com.vsglamstudio.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Data
@Document(collection = "blogs")
public class Blog {
    @Id
    private String id;
    private String title;
    private String description;
    private String category;
    private BigDecimal price;
}
