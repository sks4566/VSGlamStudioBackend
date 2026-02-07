package com.vsglamstudio.dto;

public class BlogPostDto {
    private String slug;
    private String title;
    private String excerpt;
    private String date;
    private String cover;
    private String content;

    public BlogPostDto() {}
    public BlogPostDto(String slug, String title, String excerpt, String date, String cover, String content) {
        this.slug = slug; this.title = title; this.excerpt = excerpt; this.date = date; this.cover = cover; this.content = content;
    }

    public String getSlug() { return slug; }
    public void setSlug(String slug) { this.slug = slug; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getExcerpt() { return excerpt; }
    public void setExcerpt(String excerpt) { this.excerpt = excerpt; }
    public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }
    public String getCover() { return cover; }
    public void setCover(String cover) { this.cover = cover; }
    public String getContent() { return content; }
    public void setContent(String content) { this.content = content; }
}