package com.pluralsight;

public class Room {
    //Attributes
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    //Constructor
    public Room(int numbersOfBeds, double price, boolean isOccupied, boolean isDirty) {
        this.numberOfBeds = numbersOfBeds;
        this.price = price;
        this.isOccupied = isOccupied;
        this.isDirty = isDirty;
    }

    //Setters/Getters

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numbersOfBeds) {
        this.numberOfBeds = numberOfBeds;
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

    public void checkIn(){
        this.isOccupied = true;
        this.isDirty = true;
        System.out.println("Someone is checked-in");
    }

    public void checkout(){
        this.isOccupied = false;
        cleanroom();
    }

    public void cleanroom(){
        this.isDirty = false;

    }
}
