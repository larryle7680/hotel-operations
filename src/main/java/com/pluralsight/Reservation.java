package com.pluralsight;

public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;

    //Contructor
    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    //Setters/Getters


    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getGetPrice() {
        if(this.roomType.equalsIgnoreCase("King")){
            return 139.00;
        }else {
            return 124.00;
        }
    }


    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }
    double total = 0;
    public double getReservationTotal(){

        total = this.getNumberOfNights() * this.getGetPrice();
        if(this.isWeekend()){
            total = total + (total *.1);
        }

        return total;
    }

}
