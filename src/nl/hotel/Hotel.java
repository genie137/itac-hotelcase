package nl.hotel;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Optional;

public class Hotel {
    ArrayList<Room> rooms;
    ArrayList<Booking> bookings;

    public Hotel(ArrayList<Room> rooms) {
        this.rooms = rooms;
        this.bookings = new ArrayList<>();
    }

    public boolean addBooking(Booking booking){
        return this.bookings.add(booking);
    }

    public Room getAvailableRoom(LocalDateTime startTime, LocalDateTime endTime, ArrayList<Room> usedRoomsInBooking){
        //todo find room within date range that is not occupied
        ROOM_LOOP: for (Room room : getRooms()) {
            if (usedRoomsInBooking.contains(room)) {
                continue;
            }
            for (Booking booking : bookings) {
                // check if new booking ends before old booking starts ||
                // if new booking starts after old booking ends
                if (booking.startTime.compareTo(endTime) < 0 || booking.endTime.compareTo(startTime) > 0) {
                    if (booking.getRooms().contains(room)) {
                        continue ROOM_LOOP;
                    }
                }
            }
            return room;
        }
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
