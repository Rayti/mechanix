package com.mk.mechanix.model;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class CarEntity extends BaseEntity {

    private String brand;

    private String model;

    private String generation;

    private String vin;

    private String productionYear;

}
