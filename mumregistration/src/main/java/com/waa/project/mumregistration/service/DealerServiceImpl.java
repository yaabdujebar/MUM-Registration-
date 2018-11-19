package com.waa.project.mumregistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waa.project.mumregistration.model.entity.Dealer;
import com.waa.project.mumregistration.repository.IDealerRepository;
import com.waa.project.mumregistration.service.contract.DealerService;

import java.util.List;

@Service
public class DealerServiceImpl implements DealerService {

    @Autowired
    IDealerRepository dealerRepository;

    @Override
    public List<Dealer> findAll() {
        return dealerRepository.findAll();
    }

    @Override
    public Dealer save(Dealer dealer) {
        return dealerRepository.save(dealer);
    }

    @Override
    public Dealer findOne(Long id) {
        return dealerRepository.findById(id).orElse(null);
    }

    @Override
    public void delete(Dealer dealer) {
        dealerRepository.delete(dealer);
    }

    @Override
    public void delete(Long id) {
        dealerRepository.deleteById(id);
    }
}
