package nl.hotel;

import java.util.ArrayList;

public class RoomBooking {
    Room room;
    ArrayList<Guest> guests;

    public RoomBooking(Room room, ArrayList<Guest> guests) {
        this.room = room;
        this.guests = guests;
    }

    public ArrayList<Guest> getGuests() {
        return guests;
    }

    public Room getRoom() {
        return room;
    }
}
