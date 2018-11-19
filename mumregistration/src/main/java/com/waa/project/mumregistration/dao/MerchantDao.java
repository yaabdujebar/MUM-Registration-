package com.waa.project.mumregistration.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.waa.project.mumregistration.model.entity.Merchant;
import com.waa.project.mumregistration.model.entity.User;
import com.waa.project.mumregistration.repository.IMerchantRepository;

import java.util.List;

@Component
public class MerchantDao {
    @Autowired
    IMerchantRepository merchantRepository;

    public Merchant createMerchant(Merchant merchant){
        return merchantRepository.save(merchant);
    }
    public Merchant findByMerchantId(Long id){
        return merchantRepository.findByMerchantId(id);
    }
    public Merchant findByEmail(String email){
        return null;//merchantRepository.findByEmail(email);
    }
    public Merchant findByUsername(String userName){
        return null;//merchantRepository.findByUsername(userName);
    }
    public List<Merchant> findByAll(){
        return merchantRepository.findAll();
    }
    public void delete(Merchant merchant){
        merchantRepository.delete(merchant);
    }
    public void delete(long merchantId){
        merchantRepository.deleteById(merchantId);
    }
    public Merchant update(Merchant merchant){
        return merchantRepository.save(merchant);
    }

    public Merchant findByMerchantName(String merchantName) {
        return merchantRepository.findByMerchantName(merchantName);
    }

    public Merchant findByUser(User user) {
        return merchantRepository.findByUser(user);
    }
}
