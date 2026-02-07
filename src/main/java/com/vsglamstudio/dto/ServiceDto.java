package com.vsglamstudio.dto;

import java.util.List;

public class ServiceDto {
    private String slug;
    private String title;
    private String shortDescription;
    private String heroImage;
    private List<PackageDto> packages;

    public ServiceDto() {}
    public ServiceDto(String slug, String title, String shortDescription, String heroImage, List<PackageDto> packages) {
        this.slug = slug; this.title = title; this.shortDescription = shortDescription; this.heroImage = heroImage; this.packages = packages;
    }

    public String getSlug() { return slug; }
    public void setSlug(String slug) { this.slug = slug; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getShortDescription() { return shortDescription; }
    public void setShortDescription(String shortDescription) { this.shortDescription = shortDescription; }
    public String getHeroImage() { return heroImage; }
    public void setHeroImage(String heroImage) { this.heroImage = heroImage; }
    public List<PackageDto> getPackages() { return packages; }
    public void setPackages(List<PackageDto> packages) { this.packages = packages; }
}