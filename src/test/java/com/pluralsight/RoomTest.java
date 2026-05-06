package com.pluralsight;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {
    @Test
    public void getCheckIn_should_push_isOccupiedAndisOccupiedToBeFalse(){
    //Arrange
    Room room = new Room (2, 139, true, true);
    room.checkIn();
    //Act

        //assert
       assertTrue(room.isOccupied());
        assertTrue(room.isDirty());

    }

}
