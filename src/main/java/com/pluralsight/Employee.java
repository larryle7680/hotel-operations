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
        if (this.hoursWorked <= 40){
             return this.hoursWorked;
        }else{
            return 40;
        }

    }

    public double getOvertimeHours(){
        if(this.hoursWorked > 40){
            return this.hoursWorked - 40;
        }
        return 0;
    }

    public double getTotalPay(){
       double regularPay = this.payRate * this.getRegularHours();
       double overTimePay = this.payRate * this.getOvertimeHours() * 1.5;

       return regularPay + overTimePay;
    }
}
