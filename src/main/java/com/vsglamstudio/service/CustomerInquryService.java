package com.vsglamstudio.service;

import com.vsglamstudio.dto.ContactFormDto;
import com.vsglamstudio.model.CustomerInqury;
import com.vsglamstudio.repository.CustomerInquryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerInquryService {

    @Autowired
    private CustomerInquryRepository customerInquryRepository;

    public void saveCustomerInqury(ContactFormDto contactFormDto) {
        CustomerInqury customerInqury = CustomerInqury.builder()
                .name(contactFormDto.getName())
                .email(contactFormDto.getEmail())
                .phone(contactFormDto.getPhone())
                .message(contactFormDto.getMessage())
                .build();
        customerInquryRepository.save(customerInqury);

    }
}
