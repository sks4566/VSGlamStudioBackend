package com.vsglamstudio.controllers;

import com.vsglamstudio.dto.GalleryItemDto;
import com.vsglamstudio.services.DataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GalleryController {
    private final DataService dataService;

    public GalleryController(DataService dataService) { this.dataService = dataService; }

    @GetMapping("/gallery")
    public List<GalleryItemDto> gallery() { return dataService.getGallery(); }
}
