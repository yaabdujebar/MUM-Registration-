package com.waa.project.mumregistration.dao;

import org.springframework.stereotype.Component;

import com.waa.project.mumregistration.model.entity.Location;
import com.waa.project.mumregistration.model.entity.Merchant;
import com.waa.project.mumregistration.repository.ILocationRepository;

import java.util.List;

@Component
public class LocationDao {

    ILocationRepository repository;

    public Location update(Location location) {
        return repository.save(location);
    }

    public void deleteById(long id) {
        repository.deleteById(id);
    }

    public void delete(Location location) {
        repository.delete(location);
    }

    public List<Location> findAll() {
        return repository.findAll();
    }

    public Location findById(Long id) {
        return repository.findByLocationId(id);
    }

    public Location findByLocationName(String locationName) {
        return repository.findByLocationName(locationName);
    }

    public Location findMerchant(Merchant merchant) {
        return null;//repository.findByMerchant(merchant);
    }

    public Location createLocation(Location location) {
        return repository.save(location);
    }
}
