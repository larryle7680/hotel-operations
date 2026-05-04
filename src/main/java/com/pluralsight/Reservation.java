package com.pluralsight;

public class Reservation {
    private String roomType;
    private double getPrice;
    private int numberOfNights;
    private boolean isWeekend;

    //Contructor
    public Reservation(String roomType, double getPrice, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.getPrice = getPrice;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;
    }

    //Setters/Getters


    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public double getGetPrice() {
        if(roomType.equalsIgnoreCase("King")){
            return 139.00;
        }else if (roomType.equalsIgnoreCase("Double")){
            return 124.00;
        }
        return getPrice;
    }

    public void setGetPrice(double getPrice) {
        this.getPrice = getPrice;

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
        if(isWeekend() == true){
            total = getGetPrice() * .9;
        }else{
            total = getGetPrice();
        }
        return total;
    }

}
