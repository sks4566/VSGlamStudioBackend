package com.vsglamstudio.controllers;

import com.vsglamstudio.dto.BlogPostDto;
import com.vsglamstudio.services.DataService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BlogController {
    private final DataService dataService;

    public BlogController(DataService dataService) { this.dataService = dataService; }

    @GetMapping("/blog")
    public List<BlogPostDto> list() { return dataService.getPosts(); }

    @GetMapping("/blog/{slug}")
    public ResponseEntity<BlogPostDto> post(@PathVariable String slug) {
        return dataService.getPost(slug).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}