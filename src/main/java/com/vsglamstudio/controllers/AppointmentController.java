package com.vsglamstudio.controllers;

import com.vsglamstudio.dto.AppointmentDTO;
import com.vsglamstudio.service.AppointmentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @PostMapping("/appointments")
    public ResponseEntity<?> submit(@RequestBody AppointmentDTO payload) {
        // persist/send notifications in real app
        try{
            appointmentService.createAppointment(payload);
            return ResponseEntity.status(200).body("Appointment created successfully");
        }catch (Exception e){
            log.error(e.getMessage(), e);
            return ResponseEntity.status(500).body("Failed to process appointment");
        }
    }
}
