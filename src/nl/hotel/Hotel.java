package nl.hotel;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Hotel {
    ArrayList<Room> rooms;
    ArrayList<Booking> roomBookings;

    public Hotel(ArrayList<Room> rooms) {
        this.rooms = rooms;
        this.roomBookings = new ArrayList<>();
    }

    public boolean addBooking(Booking roomBooking){
        //todo
        return false;
    }

    public ArrayList<Room> getAvailableRooms(LocalDateTime startTime, LocalDateTime endTime){
        //todo find room within date range that is not occupied
        return null;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public static ArrayList<Room> getStartRooms() {
        ArrayList<Room> allRooms = new ArrayList<>();
        allRooms.add(new Room(2));
        allRooms.add(new Room(2));
        allRooms.add(new Room(2));
        allRooms.add(new Room(2));
        allRooms.add(new Room(2));
        allRooms.add(new Room(2));
        allRooms.add(new Room(2));
        return allRooms;
    }

}
