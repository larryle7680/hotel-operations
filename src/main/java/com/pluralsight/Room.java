package com.pluralsight;

public class Room {
    //Attributes
    private int numbersOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    //Constructor
    public Room(int numbersOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numbersOfBeds = numbersOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    //Setters/Getters

    public int getNumbersOfBeds() {
        return numbersOfBeds;
    }

    public void setNumbersOfBeds(int numbersOfBeds) {
        this.numbersOfBeds = numbersOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public void setDirty(boolean dirty) {
        isDirty = dirty;
    }

    public boolean isAvailable(){
        if(this.isOccupied() && this.isDirty() ){
            return false;
        }
        return true;
    }
}
