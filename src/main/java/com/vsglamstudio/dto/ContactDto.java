package com.vsglamstudio.dto;

public class ContactDto {
    private String email;
    private String phone;
    private String studio;
    private String hours;
    private String mapEmbed;

    public ContactDto() {}
    public ContactDto(String email, String phone, String studio, String hours, String mapEmbed) {
        this.email = email; this.phone = phone; this.studio = studio; this.hours = hours; this.mapEmbed = mapEmbed;
    }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
    public String getPhone() { return phone; }
    public void setPhone(String phone) { this.phone = phone; }
    public String getStudio() { return studio; }
    public void setStudio(String studio) { this.studio = studio; }
    public String getHours() { return hours; }
    public void setHours(String hours) { this.hours = hours; }
    public String getMapEmbed() { return mapEmbed; }
    public void setMapEmbed(String mapEmbed) { this.mapEmbed = mapEmbed; }
}