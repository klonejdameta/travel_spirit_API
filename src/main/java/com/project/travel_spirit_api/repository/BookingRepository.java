package com.project.travel_spirit_api.repository;

import com.project.travel_spirit_api.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
