package com.first.demo;
import java.util.UUID;

public class Staff {
    private String staffId;
    private String staffName;
    private String staffTitle;
    private double staffSalary;

     public Staff(String staffName, String staffTitle, double staffSalary , String staffId) {
        this.staffName = staffName;
        this.staffTitle = staffTitle;
        this.staffSalary = staffSalary;
        this.staffId = staffId;
    }

    public Staff() {
        this.staffId = UUID.randomUUID().toString();
    }

    public String getStaffId() {
        return this.staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }


    public String getStaffName() {
        return this.staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName;
    }

    public String getStaffTitle() {
        return this.staffTitle;
    }

    public void setStaffTitle(String staffTitle) {
        this.staffTitle = staffTitle;
    }

    public double getStaffSalary() {
        return this.staffSalary;
    }

    public void setStaffSalary(double staffSalary) {
        this.staffSalary = staffSalary;
    }

    
}

   
