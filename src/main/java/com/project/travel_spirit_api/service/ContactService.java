package com.project.travel_spirit_api.service;

import com.project.travel_spirit_api.dto.ContactDTO;
import com.project.travel_spirit_api.utils.ServiceResponse;

public interface ContactService {
    ServiceResponse addContact(ContactDTO contactDTO); //forma qe mund te na kontaktoje useri

}
