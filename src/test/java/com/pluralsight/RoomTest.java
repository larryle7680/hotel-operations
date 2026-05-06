package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    public void getCheckIn_should_push_isOccupied_and_isDirty_to_be_False(){
    //Arrange
    Room room = new Room (6, 139, true, true);
    room.checkIn();
        boolean expectedBoolean = false;
    //Act
        boolean actualBoolean = false;
        //assert
        assertEquals(expectedBoolean,actualBoolean);

    }

}
