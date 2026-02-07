package com.vsglamstudio.dto;

public class GalleryItemDto {
    private String id;
    private String title;
    private String category;
    private String image;

    public GalleryItemDto() {}
    public GalleryItemDto(String id, String title, String category, String image) { this.id = id; this.title = title; this.category = category; this.image = image; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }
}