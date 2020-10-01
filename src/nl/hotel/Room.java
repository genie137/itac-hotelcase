package nl.hotel;

public class Room {
    private int roomNumber;
    private int maxGuests;

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getMaxGuests() {
        return maxGuests;
    }

    public void setMaxGuests(int maxGuests) {
        this.maxGuests = maxGuests;
    }

    public Room(int roomNumber, int maxGuests) {
        this.roomNumber = roomNumber;
        this.maxGuests = maxGuests;
    }
}
