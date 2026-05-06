package com.pluralsight;

public class HotelApp {
    public static void main(String[] args) {
        Room room1 = new Room(2, 129.99, false, false);

        // Create a room that is occupied

        Room room2 = new Room(1, 89.99, true, false);

        // Create a room that is dirty

        Room room3 = new Room(2, 149.99, false, true);

        // Create a room that is occupied and dirty

        Room room4 = new Room(1, 99.99, true, true);

        // Display the details for room 1

        System.out.println("Room 1");

        System.out.println("Beds: " + room1.getNumberOfBeds());

        System.out.println("Price: $" + room1.getPrice());

        System.out.println("Occupied: " + room1.isOccupied());

        System.out.println("Dirty: " + room1.isDirty());

        System.out.println("Available: " + room1.isAvailable());

        System.out.println();

        // Display the details for room 2

        System.out.println("Room 2");

        System.out.println("Beds: " + room2.getNumberOfBeds());

        System.out.println("Price: $" + room2.getPrice());

        System.out.println("Occupied: " + room2.isOccupied());

        System.out.println("Dirty: " + room2.isDirty());

        System.out.println("Available: " + room2.isAvailable());

        System.out.println();

        // Display the details for room 3

        System.out.println("Room 3");

        System.out.println("Beds: " + room3.getNumberOfBeds());

        System.out.println("Price: $" + room3.getPrice());

        System.out.println("Occupied: " + room3.isOccupied());

        System.out.println("Dirty: " + room3.isDirty());

        System.out.println("Available: " + room3.isAvailable());

        System.out.println();

        // Display the details for room 4

        System.out.println("Room 4");

        System.out.println("Beds: " + room4.getNumberOfBeds());

        System.out.println("Price: $" + room4.getPrice());

        System.out.println("Occupied: " + room4.isOccupied());

        System.out.println("Dirty: " + room4.isDirty());

        System.out.println("Available: " + room4.isAvailable());

        System.out.println();

        Employee employee1 = new Employee(35, 25, "Receptionist", "Larry Le", 12323432);

        System.out.println("Employee 1 Get hours worked: " + employee1.getTotalPay());
        employee1.punchIn(1);
        employee1.punchOut();
        System.out.println("Employee 1 Get hours worked: " + employee1.getTotalPay());

        //Creating the hotel Objects
        Hotel hotel = new Hotel("Larry Tipton", 4, 20);
        Hotel hotel2 = new Hotel("TK Hotel", 10, 20,3,3);

        //Testing the object
        System.out.println("Hotel Name: " + hotel.getName());
        System.out.println("Number of Suites: " + hotel.getNumbersOfSuites());
        System.out.println("Number of Rooms: " + hotel.getNumberOfRooms());
        System.out.println();

        //Testing the Object
        System.out.println("Hotel Name: " + hotel2.getName());
        System.out.println("Number of Suites: " + hotel2.getNumbersOfSuites());
        System.out.println("Number of Rooms: " + hotel2.getNumberOfRooms());
        System.out.println("Booked Suites: " + hotel2.getBookedSuites());
        System.out.println("Booked Rooms: " + hotel2.getBookedBasicRooms());
        System.out.println();

        //Testing out book room
        hotel2.bookRoom(2,false);

        System.out.println();
        //Hotel got 20 rooms, so it should be 18
        System.out.println("Hotel Name: " + hotel.getName());
        System.out.println("Number of Rooms: " + hotel.getNumberOfRooms());
        System.out.println("Number of Suites: " + hotel.getNumbersOfSuites());

        System.out.println( hotel2.getAvailableSuites());

        //Testing out book room
        hotel2.bookRoom(2,true);

        //Hotel got 20 rooms, so it should be 18
        System.out.println("Hotel Name: " + hotel2.getName());
        System.out.println("Number of Rooms: " + hotel2.getNumberOfRooms());
        System.out.println("Number of Suites: " + hotel2.getNumbersOfSuites());

        System.out.println( hotel2.getAvailableSuites());





    }

}

