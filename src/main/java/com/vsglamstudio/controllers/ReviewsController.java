package com.vsglamstudio.controllers;

import com.vsglamstudio.dto.ReviewDto;
import com.vsglamstudio.services.DataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReviewsController {
    private final DataService dataService;

    public ReviewsController(DataService dataService) { this.dataService = dataService; }

    @GetMapping("/reviews")
    public List<ReviewDto> reviews() { return dataService.getReviews(); }
}
