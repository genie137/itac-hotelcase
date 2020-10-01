package nl.hotel;

public class Room {
    public static int nextRoomNumber = 1;
    private int roomNumber;
    private int maxGuests;

//    public Room(int roomNumber, int maxGuests) {
//        this.roomNumber = roomNumber;
//        this.maxGuests = maxGuests;
//    }

    public Room(int maxGuests) {
        this.roomNumber = nextRoomNumber;
        this.maxGuests = maxGuests;
        nextRoomNumber++;
    }

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

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", maxGuests=" + maxGuests +
                '}';
    }
}
