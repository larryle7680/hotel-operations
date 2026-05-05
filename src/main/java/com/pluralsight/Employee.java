package com.pluralsight;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Employee {
private int employeeId;
private String name;
private String department;
private double payRate;
private double hoursWorked;
private int punchInTime;


    public Employee(double hoursWorked, double payRate, String department, String name, int employeeId) {
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
        this.department = department;
        this.name = name;
        this.employeeId = employeeId;
    }

    public double getHoursWorked(){
        return this.hoursWorked;
    }
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

    public void punchIn(int time){
    this.punchInTime = time;

    }

    public void punchOut(int time){
    int currentHoursWorked = time - this.punchInTime;

    this.hoursWorked += currentHoursWorked;

    }

    //Overload Methods
    public void punchIn(){
        LocalTime currentTime = LocalTime.now();
        this.punchIn(currentTime.getHour());
    }

    public void punchOut(){
        LocalTime currentTime = LocalTime.now();
        this.punchOut(currentTime.getHour());
    }

    public void punchTimeCard(int time, String action){
        if(action.equalsIgnoreCase("in")){
            this.punchIn(time);
        }
        if(action.equalsIgnoreCase("out")){
            this.punchOut(time);
        }
    }

    public void punchTimeCard(int start, int endTime){
        this.punchIn(start);
        this.punchOut(endTime);
    }
}
