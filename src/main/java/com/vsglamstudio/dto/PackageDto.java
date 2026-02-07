package com.vsglamstudio.dto;

public class PackageDto {
    private String name;
    private String price;
    private String details;

    public PackageDto() {}
    public PackageDto(String name, String price, String details) { this.name = name; this.price = price; this.details = details; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getPrice() { return price; }
    public void setPrice(String price) { this.price = price; }
    public String getDetails() { return details; }
    public void setDetails(String details) { this.details = details; }
}