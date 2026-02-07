package com.vsglamstudio.services;

import com.vsglamstudio.dto.*;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class DataService {
    private final SiteDto site;
    private final List<ServiceDto> services = new ArrayList<>();
    private final List<CourseDto> courses = new ArrayList<>();
    private final List<GalleryItemDto> gallery = new ArrayList<>();
    private final List<ReviewDto> reviews = new ArrayList<>();
    private final List<BlogPostDto> posts = new ArrayList<>();
    
    public DataService() {
        // Site
        site = new SiteDto();
        site.setBrand(new BrandDto("VS Glam Studio", "Makeup Artist & Educator", "Noida", ""));
        site.setHero(new HeroDto("Soft glam for modern brides", "Elevated bridal and fashion artistry with skin-first finishes and timeless technique.", "Book a consultation", "Explore services"));
        site.setContact(new ContactDto("vsglamstudio03@gmail.com", "+91 8707650187", "VS Glam Studio Noida Sector 121", "Mon-Sat · 10 AM - 7 PM", "https://maps.google.com"));

        // Services
        // Use first option direct Unsplash images for each category
        services.add(new ServiceDto("bridal","Bridal Makeup","Soft glam, HD-ready finish with premium skin prep and customization for your ceremony.", "https://res.cloudinary.com/dlajz9hrd/image/upload/v1769843885/7-1_wd4dtg.png", List.of(new PackageDto("Intimate Bride","₹25K","1 look + trial"))));
        services.add(new ServiceDto("party","Party Makeup","Fresh, camera-ready party looks for milestones and celebrations.", "https://res.cloudinary.com/dlajz9hrd/image/upload/v1770449912/female-model-wedding-bridal-makeup_okx1ki.jpg", List.of(new PackageDto("Classic","₹8K","Makeup + drape"))));
        services.add(new ServiceDto("nail","Nail Extension","Beautiful and Classy Nail Extensions for beautiful you.", "https://res.cloudinary.com/dlajz9hrd/image/upload/v1770450734/NailExtension_mkxjqw.jpg", List.of(new PackageDto("Classic","₹2K","Nail Extension + design"))));
        services.add(new ServiceDto("eyelash","Eyelash Extension","Fresh, camera-ready party looks for milestones and celebrations.", "https://res.cloudinary.com/dlajz9hrd/image/upload/v1770450874/pexels-n-voitkevich-5128267_clq7z0.jpg", List.of(new PackageDto("Classic","₹1K","Eyelash Extension"))));

        // Courses
        courses.add(new CourseDto("basic-pro","Basic to Pro Makeup","10 days","Beginner","Perfect for aspiring artists. Learn client consultation, complexion, and bridal basics.", "", List.of("Skin prep fundamentals","Day to night transformations")));

        // Gallery
        gallery.add(new GalleryItemDto("gal-1","Soft peach bridal","Bridal","https://res.cloudinary.com/dlajz9hrd/image/upload/v1769843882/2a38dd7dd5827a2e8b7951c69d9ed87c_qz30mm.jpg"));
        gallery.add(new GalleryItemDto("gal-2","Soft peach bridal","Bridal","https://res.cloudinary.com/dlajz9hrd/image/upload/v1769843883/2235d35fe1852a9e716d667df6af8082_dwz66q.jpg"));
        gallery.add(new GalleryItemDto("gal-3","Soft peach bridal","Bridal","https://res.cloudinary.com/dlajz9hrd/image/upload/v1769843882/bridal-makeup-aliganj-lucknow_ix0qml.jpg"));
        gallery.add(new GalleryItemDto("gal-4","Soft peach bridal","Bridal","https://res.cloudinary.com/dlajz9hrd/image/upload/v1769843882/72929d76-c33d-4685-8980-ce1bc942d1a1_rs_768.h-cr_0.238.1365_ylpxcl.jpg"));

        gallery.add(new GalleryItemDto("gal-5","Statement eyes","Hair","https://res.cloudinary.com/dlajz9hrd/image/upload/v1770450993/pexels-thefullonmonet-28994645_oblzaw.jpg"));

        // Reviews
        reviews.add(new ReviewDto("Riya Sharma","Bride","VS Glam Studio made me feel calm and radiant all day. The makeup was flawless even after hours of dancing."));
        reviews.add(new ReviewDto("Megha Nair","Fashion Stylist","Editorial ready, quick turnarounds, and stunning skin work. The VS Glam Studio team is a dream to collaborate with."));

        // Blog
        posts.add(new BlogPostDto("bridal-skin-prep","Bridal skin prep timeline","A step-by-step timeline so your glow peaks on the big day without stress.", "2026-01-18","https://images.unsplash.com/photo-1520975919578-3b6d5c6a6c54?auto=format&fit=crop&w=1200&q=80", "Plan facials and hydration routines 6-8 weeks in advance."));
        posts.add(new BlogPostDto("camera-ready-makeup","Camera-ready makeup tips","How to ensure your makeup reads soft and luminous on camera.", "2026-01-02","https://images.unsplash.com/photo-1501865550781-0b4e1e3c77d6?auto=format&fit=crop&w=1200&q=80", "Focus on skin prep, avoid heavy SPF flashback."));
    }

    public SiteDto getSite() { return site; }

    public List<ServiceDto> getServices() { return services; }

    public Optional<ServiceDto> getService(String slug) {
        return services.stream().filter(s -> s.getSlug().equals(slug)).findFirst();
    }

    public List<CourseDto> getCourses() { return courses; }

    public Optional<CourseDto> getCourse(String slug) {
        return courses.stream().filter(c -> c.getSlug().equals(slug)).findFirst();
    }

    public List<GalleryItemDto> getGallery() { return gallery; }

    public List<ReviewDto> getReviews() { return reviews; }

    public List<BlogPostDto> getPosts() { return posts; }

    public Optional<BlogPostDto> getPost(String slug) { return posts.stream().filter(p -> p.getSlug().equals(slug)).findFirst(); }
}
