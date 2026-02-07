package com.vsglamstudio.controllers;

import com.vsglamstudio.dto.SiteDto;
import com.vsglamstudio.services.DataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SiteController {
    private final DataService dataService;

    public SiteController(DataService dataService) { this.dataService = dataService; }

    @GetMapping("/site")
    public SiteDto site() { return dataService.getSite(); }
}
