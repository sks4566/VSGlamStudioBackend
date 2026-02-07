package com.vsglamstudio.dto;

public class BrandDto {
    private String name;
    private String tagline;
    private String location;
    private String heroImage;

    public BrandDto() { }

    public BrandDto(String name, String tagline, String location, String heroImage) {
        this.name = name;
        this.tagline = tagline;
        this.location = location;
        this.heroImage = heroImage;
    }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getTagline() { return tagline; }
    public void setTagline(String tagline) { this.tagline = tagline; }
    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }
    public String getHeroImage() { return heroImage; }
    public void setHeroImage(String heroImage) { this.heroImage = heroImage; }
}