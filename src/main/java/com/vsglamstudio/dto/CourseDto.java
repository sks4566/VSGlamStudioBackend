package com.vsglamstudio.dto;

import java.util.List;

public class CourseDto {
    private String slug;
    private String title;
    private String duration;
    private String level;
    private String summary;
    private String image;
    private List<String> modules;

    public CourseDto() {}
    public CourseDto(String slug, String title, String duration, String level, String summary, String image, List<String> modules) {
        this.slug = slug; this.title = title; this.duration = duration; this.level = level; this.summary = summary; this.image = image; this.modules = modules;
    }

    public String getSlug() { return slug; }
    public void setSlug(String slug) { this.slug = slug; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDuration() { return duration; }
    public void setDuration(String duration) { this.duration = duration; }
    public String getLevel() { return level; }
    public void setLevel(String level) { this.level = level; }
    public String getSummary() { return summary; }
    public void setSummary(String summary) { this.summary = summary; }
    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }
    public List<String> getModules() { return modules; }
    public void setModules(List<String> modules) { this.modules = modules; }
}