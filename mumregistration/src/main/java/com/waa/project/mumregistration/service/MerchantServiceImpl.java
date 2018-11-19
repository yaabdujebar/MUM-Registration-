package com.waa.project.mumregistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waa.project.mumregistration.dao.MerchantDao;
import com.waa.project.mumregistration.model.entity.Location;
import com.waa.project.mumregistration.model.entity.Merchant;
import com.waa.project.mumregistration.model.entity.User;
import com.waa.project.mumregistration.service.contract.LocationService;
import com.waa.project.mumregistration.service.contract.MerchantService;
import com.waa.project.mumregistration.service.contract.UserService;

import java.util.List;

@Service
public class MerchantServiceImpl implements MerchantService {
    private final MerchantDao merchantDao;
    private final UserService userService;
    private final LocationService locationService;
    @Autowired
    public MerchantServiceImpl(MerchantDao merchantDao,UserService userService,LocationService locationService){
        this.merchantDao = merchantDao;
        this.userService = userService;
        this.locationService = locationService;
    }

    @Override
    public Merchant create(Merchant merchant) {
        userService.create(merchant.getUser());
//        locationService.create(new Location(merchant.getUser().getUsername(),merchant.getAddress()));
        return merchantDao.createMerchant(merchant);
    }

    @Override
    public Merchant findById(Long id) {
        return merchantDao.findByMerchantId(id);
    }

    @Override
    public Merchant findByEmail(String email) {
        return merchantDao.findByEmail(email);
    }

    @Override
    public Merchant findByUsername(String userName) {
        return merchantDao.findByUsername(userName);
    }

    @Override
    public Merchant findByMerchantName(String merchantName) {
        return merchantDao.findByMerchantName(merchantName);
    }

    @Override
    public Merchant findUser(User user) {
        return merchantDao.findByUser(user);
    }

    @Override
    public List<Merchant> findAll() {
        return merchantDao.findByAll();
    }

    @Override
    public void delete(Merchant merchant) {
        merchantDao.delete(merchant);
    }

    @Override
    public void deleteById(long merchantId) {
        merchantDao.delete(merchantId);
    }

    @Override
    public Merchant update(Merchant merchant) {
       return merchantDao.update(merchant);
    }
}
