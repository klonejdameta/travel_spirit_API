package com.project.travel_spirit_api.service;

import com.project.travel_spirit_api.dto.BookingDTO;
import com.project.travel_spirit_api.utils.ServiceResponse;

import java.util.List;

public interface BookingService {
    ServiceResponse addReservation(BookingDTO bookingDTO);

    List<BookingDTO> getReservations();
}
