package com.mk.mechanix.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UserEntity extends BaseEntity {

    private String username;

    private String password;

    private String userRolesASENUM;

}
