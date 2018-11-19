package com.waa.project.mumregistration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.waa.project.mumregistration.dao.UserDao;
import com.waa.project.mumregistration.model.entity.User;
import com.waa.project.mumregistration.service.contract.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserDao dao;
    @Autowired
    public UserServiceImpl(UserDao dao){
        this.dao = dao;
    }

    @Override
    public User findByFirstName(String firstName) {
        return dao.findByFirstName(firstName);
    }

    @Override
    public User findByLastName(String lastName) {
        return dao.findByLastName(lastName);
    }

    @Override
    public User findByMobile(String mobile) {
        return dao.findByMobile(mobile);
    }

    @Override
    public User findByEmail(String email) {
        return dao.findByEmail(email);
    }

    @Override
    public User findByUserName(String userName) {
        return dao.findByUserName(userName);
    }

    @Override
    public User findByUserNameAndPassword(String userName, String password) {
        return dao.findByUserNameAndPassword(userName,password);
    }

    @Override
    public User create(User user) {
        return dao.create(user);
    }

    @Override
    public User findById(Long id) {
        return dao.findById(id);
    }

    @Override
    public List<User> findAll() {
        return dao.findByAll();
    }

    @Override
    public void delete(User user) {
        dao.delete(user);
    }

    @Override
    public void deleteById(long id) {
        dao.deleteById(id);
    }

    @Override
    public User update(User user) {
        return dao.update(user);
    }
}
