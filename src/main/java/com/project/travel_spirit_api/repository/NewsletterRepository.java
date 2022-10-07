package com.project.travel_spirit_api.repository;

import com.project.travel_spirit_api.entity.Newsletter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsletterRepository extends JpaRepository<Newsletter, Long> {
}
