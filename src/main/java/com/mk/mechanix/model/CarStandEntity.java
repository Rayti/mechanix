package com.mk.mechanix.model;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "CAR_STAND")
@Getter
@Setter
public class CarStandEntity extends BaseEntity {

    private String name;

    private double weightLimit;

    @OneToOne
    private CarEntity carInStand;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeightLimit() {
        return weightLimit;
    }

    public void setWeightLimit(double weightLimit) {
        this.weightLimit = weightLimit;
    }
}
