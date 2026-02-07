package com.vsglamstudio.service;

import com.vsglamstudio.dto.AppointmentDTO;
import com.vsglamstudio.model.CustomerBooking;
import com.vsglamstudio.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    @Autowired
    private BookingRepository bookingRepository;

    public void createAppointment(AppointmentDTO appointmentDto) {
        // Map all fields from DTO to model and save
        CustomerBooking customerBooking = CustomerBooking.builder()
                .name(appointmentDto.getName())
                .email(appointmentDto.getEmail())
                .phone(appointmentDto.getPhone())
                .eventType(appointmentDto.getEventType())
                .eventDate(appointmentDto.getEventDate())
                .city(appointmentDto.getCity())
                .notes(appointmentDto.getNotes())
                .build();

        bookingRepository.save(customerBooking);
    }
}
