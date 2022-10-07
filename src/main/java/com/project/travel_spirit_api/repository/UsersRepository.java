package com.project.travel_spirit_api.repository;

import com.project.travel_spirit_api.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users, Long> {
}
