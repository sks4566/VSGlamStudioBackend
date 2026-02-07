package com.vsglamstudio.dto;

import java.util.List;

public class SiteDto {
    private BrandDto brand;
    private HeroDto hero;
    private ContactDto contact;

    public BrandDto getBrand() { return brand; }
    public void setBrand(BrandDto brand) { this.brand = brand; }
    public HeroDto getHero() { return hero; }
    public void setHero(HeroDto hero) { this.hero = hero; }
    public ContactDto getContact() { return contact; }
    public void setContact(ContactDto contact) { this.contact = contact; }
}