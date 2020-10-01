package nl.hotel;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Booking {
    LocalDateTime startTime;
    LocalDateTime endTime;
    ArrayList<RoomBooking> roomBookings;

    public Booking(Hotel hotel, LocalDateTime startTime, LocalDateTime endTime, ArrayList<Guest> guests) throws Exception {
        this.startTime = startTime;
        this.endTime = endTime;
        this.roomBookings = this.moveGuestsToRooms(hotel, startTime, endTime, guests);
    }

    private ArrayList<RoomBooking> moveGuestsToRooms(Hotel hotel, LocalDateTime startTime, LocalDateTime endTime, ArrayList<Guest> guests) throws Exception {
        ArrayList<RoomBooking> roomBookings = new ArrayList<>();
        ArrayList<Room> usedRoomsInBooking = new ArrayList<>();
        GUEST_LOOP: for (int i = 0; i < guests.size(); i++) {
            Room availableRoom = hotel.getAvailableRoom(startTime, endTime, usedRoomsInBooking);
            usedRoomsInBooking.add(availableRoom);
            if (availableRoom == null){
                throw new Exception("Cannot find room for booking!");
            }

            ArrayList<Guest> roomGuests = new ArrayList<>();
            for (int mg = 0; mg < availableRoom.getMaxGuests(); mg++) {
                roomGuests.add(guests.get(i));
                if (i != (guests.size() -1)){
                    if (mg != availableRoom.getMaxGuests() -1){
                        i++;
                    }
                } else {
                    roomBookings.add(new RoomBooking(availableRoom, roomGuests));
                    break GUEST_LOOP;
                }
            }
            roomBookings.add(new RoomBooking(availableRoom, roomGuests));
        }

        return roomBookings;
    }

    public ArrayList<Room> getRooms(){
        ArrayList<Room> rooms = new ArrayList<>();
        for (RoomBooking roomBooking : this.roomBookings) {
            rooms.add(roomBooking.getRoom());
        }
        return rooms;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                ", roomBookings=" + roomBookings +
                '}';
    }
}
