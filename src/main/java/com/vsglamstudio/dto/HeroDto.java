package com.vsglamstudio.dto;

public class HeroDto {
    private String title;
    private String subtitle;
    private String primaryCta;
    private String secondaryCta;

    public HeroDto() {}

    public HeroDto(String title, String subtitle, String primaryCta, String secondaryCta) {
        this.title = title; this.subtitle = subtitle; this.primaryCta = primaryCta; this.secondaryCta = secondaryCta;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getSubtitle() { return subtitle; }
    public void setSubtitle(String subtitle) { this.subtitle = subtitle; }
    public String getPrimaryCta() { return primaryCta; }
    public void setPrimaryCta(String primaryCta) { this.primaryCta = primaryCta; }
    public String getSecondaryCta() { return secondaryCta; }
    public void setSecondaryCta(String secondaryCta) { this.secondaryCta = secondaryCta; }
}