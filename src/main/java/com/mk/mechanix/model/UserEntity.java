package com.mk.mechanix.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "USER")
@Getter
@Setter
public class UserEntity extends BaseEntity {

    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
