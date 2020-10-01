package nl.hotel;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Booking {
    LocalDateTime startTime;
    LocalDateTime endTime;
    ArrayList<RoomBooking> roomBookings;

    public Booking(Hotel hotel, LocalDateTime startTime, LocalDateTime endTime, ArrayList<Guest> guests){
        this.startTime = startTime;
        this.endTime = endTime;
        this.roomBookings = this.moveGuestsToRooms(hotel, startTime, endTime, guests);
    }

    private ArrayList<RoomBooking> moveGuestsToRooms(Hotel hotel, LocalDateTime localDateTime, LocalDateTime endTime, ArrayList<Guest> guests) {
        //todo assign guest to available rooms
        return null;
    }

}
