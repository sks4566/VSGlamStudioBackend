package com.vsglamstudio.controllers;

import com.vsglamstudio.dto.ServiceDto;
import com.vsglamstudio.services.DataService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServicesController {
    private final DataService dataService;

    public ServicesController(DataService dataService) { this.dataService = dataService; }

    @GetMapping("/services")
    public List<ServiceDto> services() { return dataService.getServices(); }

    @GetMapping("/services/{slug}")
    public ResponseEntity<ServiceDto> service(@PathVariable String slug) {
        return dataService.getService(slug).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
