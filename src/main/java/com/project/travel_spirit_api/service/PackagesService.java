package com.project.travel_spirit_api.service;

import com.project.travel_spirit_api.dto.PackageFilter;
import com.project.travel_spirit_api.dto.PackagesDTO;
import com.project.travel_spirit_api.entity.Packages;
import com.project.travel_spirit_api.utils.ServiceResponse;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface PackagesService {
    List<PackagesDTO> getFeaturedOffers(); //merr paketat me te reja

    ServiceResponse addPackages(PackagesDTO packagesDTO);

    List<PackagesDTO> getPackages(); //mer te gjitha paketat

    List<PackagesDTO> getPackageByName(String name);

    ResponseEntity<List<Packages>> search(PackageFilter filter);

    List<PackagesDTO> getPromotionalOffers();

    List<PackagesDTO> getDestinations(PackageFilter dto);

    List<PackagesDTO> getBookingPackage(Long id);
}
