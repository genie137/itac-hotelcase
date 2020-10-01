import nl.hotel.Booking;
import nl.hotel.Guest;
import nl.hotel.Hotel;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Hotel h = new Hotel(Hotel.getStartRooms());
        System.out.println(h.getRooms());

        ArrayList<Guest> guests1 = new ArrayList<>();
        guests1.add(new Guest("Joris", "Oosterhuis", "0677895469", "joris@home.com"));
        guests1.add(new Guest("Marte", "Hobbelink", "0676697468", "marte@home.com"));
        guests1.add(new Guest("Erwin", "Nijboer", "0614564689", "erwin@home.com"));

        Booking b = new Booking(h, null, null, guests1);

    }
}
