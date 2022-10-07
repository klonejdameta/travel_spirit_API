package com.project.travel_spirit_api.service;

import com.project.travel_spirit_api.dto.NewsletterDTO;
import com.project.travel_spirit_api.utils.ServiceResponse;

import java.util.List;

public interface NewsletterService {
    ServiceResponse addNewsletter(NewsletterDTO newsletterDTO); //ben subscribe useri

    List<NewsletterDTO> getSubscriptions();

}
