package com.project.travel_spirit_api.dto;

import lombok.Data;

@Data
public class NewsletterDTO {
    private Long id;
    private String email;
    private Boolean active;
}
