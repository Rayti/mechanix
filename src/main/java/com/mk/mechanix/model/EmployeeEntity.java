package com.mk.mechanix.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class EmployeeEntity extends BaseEntity {

    private String name;

    private String lastname;

    private String position;

}
