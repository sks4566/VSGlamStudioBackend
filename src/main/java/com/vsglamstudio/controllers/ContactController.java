package com.vsglamstudio.controllers;

import com.vsglamstudio.dto.ContactDto;
import com.vsglamstudio.dto.ContactFormDto;
import com.vsglamstudio.service.CustomerInquryService;
import com.vsglamstudio.services.DataService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
public class ContactController {
    private final DataService dataService;
    private final CustomerInquryService customerInquryService;

    public ContactController(DataService dataService, CustomerInquryService customerInquryService) {
        this.dataService = dataService;
        this.customerInquryService = customerInquryService;
    }

    @GetMapping("/contact")
    public ContactDto contact() { return dataService.getSite().getContact(); }

    @PostMapping("/contact")
    public ResponseEntity<?> submitContact(@RequestBody ContactFormDto contactFormDto) {
        // In a real app: persist and send email. Here we just acknowledge.
        try{
            customerInquryService.saveCustomerInqury(contactFormDto);
            return ResponseEntity.ok().body(java.util.Map.of("status","ok","message","Thanks! We'll be in touch shortly."));
        }catch (Exception e){
            return ResponseEntity.ok().body(java.util.Map.of("status","ok","message","Unable to process inquiry"));
        }
    }
}
