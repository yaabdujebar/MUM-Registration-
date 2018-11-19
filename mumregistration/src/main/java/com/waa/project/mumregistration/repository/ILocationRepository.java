package com.waa.project.mumregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.waa.project.mumregistration.model.entity.Location;
import com.waa.project.mumregistration.model.entity.Merchant;

@Repository
public interface ILocationRepository extends JpaRepository<Location, Long> {
//    Location findByMerchant(Merchant merchant);
    Location findByLocationId(Long id);
    Location findByLocationName(String locationName);
}
