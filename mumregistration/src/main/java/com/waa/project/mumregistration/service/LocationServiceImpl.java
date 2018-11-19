package com.waa.project.mumregistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waa.project.mumregistration.dao.LocationDao;
import com.waa.project.mumregistration.model.entity.Location;
import com.waa.project.mumregistration.model.entity.Merchant;
import com.waa.project.mumregistration.service.contract.LocationService;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {
    private final LocationDao locationDao;

    @Autowired
    public LocationServiceImpl(LocationDao locationDao){
        this.locationDao = locationDao;
    }

    @Override
    public Location findByLocationName(String locationName) {
        return locationDao.findByLocationName(locationName);
    }

    @Override
    public Location findMerchant(Merchant merchant) {
        return locationDao.findMerchant(merchant);
    }

    @Override
    public Location create(Location location) {
        return locationDao.createLocation(location);
    }

    @Override
    public Location findById(Long id) {
        return locationDao.findById(id);
    }

    @Override
    public List<Location> findAll() {
        return locationDao.findAll();
    }

    @Override
    public void delete(Location location) {
        locationDao.delete(location);
    }

    @Override
    public void deleteById(long id) {
        locationDao.deleteById(id);
    }

    @Override
    public Location update(Location location) {
        return locationDao.update(location);
    }
}
