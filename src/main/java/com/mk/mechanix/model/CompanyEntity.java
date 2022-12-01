package com.mk.mechanix.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity(name = "COMPANY")
public class CompanyEntity extends BaseEntity {
    private String companyName;

    @OneToMany(mappedBy = "company")
    private List<EmployeeEntity> employeeEntityList;

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<EmployeeEntity> getEmployeeEntityList() {
        return employeeEntityList;
    }

    public void setEmployeeEntityList(List<EmployeeEntity> employeeEntityList) {
        this.employeeEntityList = employeeEntityList;
    }
}
