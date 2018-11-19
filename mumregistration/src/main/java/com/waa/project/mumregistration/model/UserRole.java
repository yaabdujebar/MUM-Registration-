package com.waa.project.mumregistration.model;

import java.util.List;

import com.waa.project.mumregistration.model.entity.User;

public class UserRole extends User {
    private List<User> userList;

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
