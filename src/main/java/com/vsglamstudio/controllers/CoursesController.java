package com.vsglamstudio.controllers;

import com.vsglamstudio.dto.CourseDto;
import com.vsglamstudio.services.DataService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CoursesController {
    private final DataService dataService;

    public CoursesController(DataService dataService) { this.dataService = dataService; }

    @GetMapping("/courses")
    public List<CourseDto> courses() { return dataService.getCourses(); }

    @GetMapping("/courses/{slug}")
    public ResponseEntity<CourseDto> course(@PathVariable String slug) {
        return dataService.getCourse(slug).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
}
