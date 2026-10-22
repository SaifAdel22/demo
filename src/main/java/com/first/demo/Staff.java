package com.first.demo;
import java.util.UUID;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public class Staff {
    private String staffId;
     @NotBlank(message = "satff Name cant be blank")
    private String staffName;
     @NotBlank(message = "satff Title cant be blank")
    private String staffTitle;
    @NotNull(message = "staff Salary cant be null")
     @Positive(message = "staff Salary must be greater than zero")
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

   
