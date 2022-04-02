package com.parul.bootcamp.project.entities;

import javax.persistence.Id;

public class UserRole {
    @Id
    private int id;
    private User userId;
    private Role roleId;

    public User getUserId() {
        return userId;
    }

    public void setUserId(User userId) {
        this.userId = userId;
    }

    public Role getRoleId() {
        return roleId;
    }

    public void setRoleId(Role roleId) {
        this.roleId = roleId;
    }
}
