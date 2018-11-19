package com.waa.project.mumregistration.service.contract;

import java.util.List;

import com.waa.project.mumregistration.model.entity.Dealer;

public interface DealerService {
    List<Dealer> findAll();
    Dealer save(Dealer dealer);
    Dealer findOne(Long id);
    void delete(Dealer dealer);
    void delete(Long id);
}
