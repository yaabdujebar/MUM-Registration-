package com.waa.project.mumregistration.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import com.waa.project.mumregistration.model.entity.User;

@Entity
@Table(name = "tbl_salesman")
public class Salesman {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long salesmanId;
    private String staffId;
    @OneToOne
    @JoinColumn(name = "userId")
    @NotNull
    private User user;

    public long getSalesmanId() {
        return salesmanId;
    }

    public void setSalesmanId(long salesmanId) {
        this.salesmanId = salesmanId;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
