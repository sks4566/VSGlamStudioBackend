package com.vsglamstudio.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "images")
public class Image {
    @Id
    private String id;
    private String title;
    private String serviceTypeId;
    private String imageUrl;
}
