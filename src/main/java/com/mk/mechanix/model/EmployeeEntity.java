package com.mk.mechanix.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity(name = "EMPLOYEE")
@Getter
@Setter
public class EmployeeEntity extends BaseEntity {

    private String name;

    private String lastname;

    private String position;

    @ManyToOne
    @JoinColumn(name = "COMPANY_ID")
    private CompanyEntity company;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
