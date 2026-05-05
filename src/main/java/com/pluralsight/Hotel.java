package com.pluralsight;

public class Hotel {
    private String name;
    private int numbersOfSuites;
    private int numberOfRooms;
    private int bookedSuites;
    private int bookedBasicRooms;

    public Hotel(String name, int numbersOfSuites, int numberOfRooms) {
        this.name = name;
        this.numbersOfSuites = numbersOfSuites;
        this.numberOfRooms = numberOfRooms;
    }

    public Hotel(String name, int numbersOfSuites, int numberOfRooms, int bookedSuites, int bookedBasicRooms) {
        this.name = name;
        this.numbersOfSuites = numbersOfSuites;
        this.numberOfRooms = numberOfRooms;
        this.bookedSuites = bookedSuites;
        this.bookedBasicRooms = bookedBasicRooms;
    }

    public boolean bookRoom(int numberOfRooms, boolean isSuite){
            if(isSuite){
                if(getAvailableSuites() >= numberOfRooms){
                    bookedSuites += numberOfRooms;
                    return true;
                }
            }else{
                if(getAvailableRooms() >= numberOfRooms){
                    bookedBasicRooms += numberOfRooms;
                    return true;
                }
            }

        return false;
    }

    public int getAvailableSuites(){
        if(this.numbersOfSuites < this.bookedSuites){
            return this.numbersOfSuites - this.bookedSuites;
        }
        return 0;
    }

    public int getAvailableRooms(){
        if (this.numberOfRooms < this.bookedBasicRooms){
            return this.numberOfRooms - this.bookedBasicRooms;
        }
        return 0;
    }

    public String getName() {
        return name;
    }

    public int getNumbersOfSuites() {
        return numbersOfSuites;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public int getBookedSuites() {
        return bookedSuites;
    }

    public int getBookedBasicRooms() {
        return bookedBasicRooms;
    }
}
