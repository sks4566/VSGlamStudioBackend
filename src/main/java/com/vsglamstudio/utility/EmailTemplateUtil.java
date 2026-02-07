package com.vsglamstudio.utility;

import com.vsglamstudio.dto.AppointmentDTO;

import java.time.Year;
import java.util.HashMap;
import java.util.Map;

public class EmailTemplateUtil {

    public static String buildBookingEmail(AppointmentDTO dto, String template) {
        Map<String, String> values = new HashMap<>();
        values.put("name", safe(dto.getName()));
        values.put("email", safe(dto.getEmail()));
        values.put("phone", safe(dto.getPhone()));
        values.put("eventType", safe(dto.getEventType()));
        values.put("eventDate", safe(dto.getEventDate()));
        values.put("city", safe(dto.getCity()));
        values.put("notes", safe(dto.getNotes()));
        values.put("year", String.valueOf(Year.now().getValue()));

        String html = template;

        // Optional notes block
        if (values.get("notes").isBlank()) {
            html = html.replace("{{#if notes}}", "")
                       .replace("{{/if}}", "")
                       .replaceFirst("(?s)<div[^>]*>\\s*<div[^>]*>Notes</div>.*?</div>", "");
        } else {
            html = html.replace("{{#if notes}}", "").replace("{{/if}}", "");
        }

        for (Map.Entry<String, String> entry : values.entrySet()) {
            html = html.replace("{{" + entry.getKey() + "}}", entry.getValue());
        }
        return html;
    }

    private static String safe(String v) {
        if (v == null) return "";
        return v.replace("&", "&amp;")
                .replace("<", "&lt;")
                .replace(">", "&gt;")
                .replace("\"", "&quot;")
                .replace("'", "&#39;");
    }
}
