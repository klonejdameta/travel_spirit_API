package com.project.travel_spirit_api.repository;

import com.project.travel_spirit_api.entity.Packages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface PackagesRepository extends JpaRepository<Packages, Long> {
    @Query("SELECT p FROM Packages p WHERE p.featured = true and p.active = true")
    List<Packages> findFeaturedOffers();

    @Query("SELECT p FROM Packages p WHERE p.name = :name")
    List<Packages> getByName(String name);

    @Query("SELECT p FROM Packages p WHERE (:packageName is not null and p.name like %:packageName%) or (:cityId is not null and p.cityId = :cityId) ")
    List<Packages> search(Long cityId, String packageName);

    @Query("SELECT p FROM Packages p WHERE p.promotionalOffer = true and p.active = true")
    List<Packages> findPromotionalOffers();

    @Query("SELECT p FROM Packages p where p.active = true and p.promotionalOffer = false and (:query is null or p.name like %:query%)")
    List<Packages> getDestinations(String query);

    @Query("SELECT p FROM Packages p where p.id=:id")
    List<Packages> getBookingPackage(Long id);
}
