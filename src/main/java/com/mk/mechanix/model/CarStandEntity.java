package com.mk.mechanix.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CarStandEntity extends BaseEntity {

    private String name;

    private double weightLimit;
}
