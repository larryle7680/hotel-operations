package com.pluralsight;

public class Employee {
private int employeeId;
private String name;
private String department;
private double payRate;
private double hoursWorked;

    public Employee(double hoursWorked, double payRate, String department, String name, int employeeId) {
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
        this.department = department;
        this.name = name;
        this.employeeId = employeeId;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
    double wage = 0;
    public double getRegularHours(){
        if (hoursWorked <= 40){
             return getRegularHours();
        }else{
            return 40;
        }

    }
    double overtimeHours;
    public double getOvertimeHours(){
        if(getHoursWorked() > 40){
            overtimeHours = hoursWorked - 40;
        }
        return overtimeHours;
    }

    public double getTotalPay(){
        if(getHoursWorked() < 40){
            wage = getPayRate() * getHoursWorked();
        }else if (getHoursWorked() > 40){
            wage = overtimeHours * 1.5;
        }
        return wage;
    }
}
