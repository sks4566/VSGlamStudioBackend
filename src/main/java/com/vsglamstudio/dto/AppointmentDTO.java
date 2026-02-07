package com.vsglamstudio.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AppointmentDTO {
    private String name;
    private String email;
    private String phone;
    private String eventType;
    private String eventDate;
    private String city;
    private String notes;
}