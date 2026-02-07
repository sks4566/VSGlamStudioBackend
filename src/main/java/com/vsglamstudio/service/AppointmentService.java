package com.vsglamstudio.service;

import com.vsglamstudio.dto.AppointmentDTO;
import com.vsglamstudio.model.CustomerBooking;
import com.vsglamstudio.repository.BookingRepository;
import com.vsglamstudio.services.EmailService;
import com.vsglamstudio.utility.EmailTemplateUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private EmailService emailService;

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
        // Booking created, send sms and email notifications to admin
        String emailBody = "<!doctype html>\n" +
                "<html lang=\"en\">\n" +
                "  <head>\n" +
                "    <meta charset=\"utf-8\" />\n" +
                "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n" +
                "    <title>Booking Confirmed</title>\n" +
                "  </head>\n" +
                "  <body style=\"margin:0; padding:0; background:#f8f2f0; font-family: 'Georgia', 'Times New Roman', serif; color:#2a2422;\">\n" +
                "    <table role=\"presentation\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" style=\"background:#f8f2f0; padding:24px 0;\">\n" +
                "      <tr>\n" +
                "        <td align=\"center\">\n" +
                "          <table role=\"presentation\" width=\"640\" cellpadding=\"0\" cellspacing=\"0\" style=\"width:640px; background:#fffaf8; border-radius:16px; overflow:hidden;\">\n" +
                "            <tr>\n" +
                "              <td style=\"padding:24px 32px; background:linear-gradient(135deg,#f7efeb 0%, #f3dcd2 100%);\">\n" +
                "                <div style=\"font-family:'Brush Script MT','Segoe Script','Lucida Handwriting',cursive; font-size:22px; color:#2a2422;\">\n" +
                "                  VS Glam Studio\n" +
                "                </div>\n" +
                "                <div style=\"letter-spacing:2px; text-transform:uppercase; font-size:11px; color:#a5675a; margin-top:6px;\">\n" +
                "                  Makeup Artist & Educator\n" +
                "                </div>\n" +
                "              </td>\n" +
                "            </tr>\n" +
                "\n" +
                "            <tr>\n" +
                "              <td style=\"padding:32px;\">\n" +
                "                <div style=\"font-size:36px; line-height:1.1; font-weight:700; margin:0 0 12px;\">\n" +
                "                  Booking confirmed\n" +
                "                </div>\n" +
                "                <div style=\"font-size:15px; color:#6f615b; line-height:1.6; margin-bottom:24px;\">\n" +
                "                  Hi {{name}}, your appointment is booked. We can’t wait to glam you up.\n" +
                "                </div>\n" +
                "\n" +
                "                <table role=\"presentation\" width=\"100%\" cellpadding=\"0\" cellspacing=\"0\" style=\"border-collapse:collapse; font-family: Arial, Helvetica, sans-serif; font-size:14px;\">\n" +
                "                  <tr>\n" +
                "                    <td style=\"padding:12px 0; border-bottom:1px solid #eaded7; font-weight:600;\">Event Type</td>\n" +
                "                    <td style=\"padding:12px 0; border-bottom:1px solid #eaded7; text-align:right;\">{{eventType}}</td>\n" +
                "                  </tr>\n" +
                "                  <tr>\n" +
                "                    <td style=\"padding:12px 0; border-bottom:1px solid #eaded7; font-weight:600;\">Event Date</td>\n" +
                "                    <td style=\"padding:12px 0; border-bottom:1px solid #eaded7; text-align:right;\">{{eventDate}}</td>\n" +
                "                  </tr>\n" +
                "                  <tr>\n" +
                "                    <td style=\"padding:12px 0; border-bottom:1px solid #eaded7; font-weight:600;\">City</td>\n" +
                "                    <td style=\"padding:12px 0; border-bottom:1px solid #eaded7; text-align:right;\">{{city}}</td>\n" +
                "                  </tr>\n" +
                "                  <tr>\n" +
                "                    <td style=\"padding:12px 0; border-bottom:1px solid #eaded7; font-weight:600;\">Phone</td>\n" +
                "                    <td style=\"padding:12px 0; border-bottom:1px solid #eaded7; text-align:right;\">{{phone}}</td>\n" +
                "                  </tr>\n" +
                "                  <tr>\n" +
                "                    <td style=\"padding:12px 0; font-weight:600;\">Email</td>\n" +
                "                    <td style=\"padding:12px 0; text-align:right;\">{{email}}</td>\n" +
                "                  </tr>\n" +
                "                </table>\n" +
                "\n" +
                "                {{#if notes}}\n" +
                "                <div style=\"margin-top:20px; padding:14px 16px; background:#f9efea; border:1px solid #eaded7; border-radius:12px; font-family: Arial, Helvetica, sans-serif;\">\n" +
                "                  <div style=\"font-weight:600; margin-bottom:6px;\">Notes</div>\n" +
                "                  <div style=\"white-space:pre-wrap; font-size:14px; line-height:1.6;\">{{notes}}</div>\n" +
                "                </div>\n" +
                "                {{/if}}\n" +
                "\n" +
                "                <div style=\"margin-top:24px; font-family: Arial, Helvetica, sans-serif; font-size:13px; color:#7a6a63;\">\n" +
                "                  Need changes? Reply to this email or call us.\n" +
                "                </div>\n" +
                "              </td>\n" +
                "            </tr>\n" +
                "\n" +
                "            <tr>\n" +
                "              <td style=\"padding:16px 32px; background:#f7efeb; text-align:center; font-family: Arial, Helvetica, sans-serif; font-size:12px; color:#8a7a73;\">\n" +
                "                © {{year}} VS Glam Studio\n" +
                "              </td>\n" +
                "            </tr>\n" +
                "          </table>\n" +
                "        </td>\n" +
                "      </tr>\n" +
                "    </table>\n" +
                "  </body>\n" +
                "</html>\n";


        String finalEmail = EmailTemplateUtil.buildBookingEmail(appointmentDto, emailBody);
        emailService.sendHtmlEmail("vsglamstudio03@gmail.com", "New Appointment Booking", finalEmail);
    }
}
