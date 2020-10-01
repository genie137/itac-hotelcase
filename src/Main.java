import nl.hotel.Booking;
import nl.hotel.Guest;
import nl.hotel.Hotel;

import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Hotel h = new Hotel(Hotel.getStartRooms());
        System.out.println(h.getRooms());

        ArrayList<Guest> guests1 = new ArrayList<>();
        guests1.add(new Guest("Joris", "Oosterhuis", "0677895469", "joris@home.com"));
        guests1.add(new Guest("Marte", "Hobbelink", "0676697468", "marte@home.com"));
        guests1.add(new Guest("Erwin", "Nijboer", "0614564689", "erwin@home.com"));

        Booking b1 = new Booking(h, LocalDateTime.now(), LocalDateTime.of(2020, Month.OCTOBER, 3, 12, 0), guests1);
        h.addBooking(b1);
        System.out.println(b1);

        ArrayList<Guest> guests2 = new ArrayList<>();
        guests2.add(new Guest("Joris1", "Oosterhuis", "0677895469", "joris@home.com"));
        guests2.add(new Guest("Marte1", "Hobbelink", "0676697468", "marte@home.com"));
        guests2.add(new Guest("Erwin1", "Nijboer", "0614564689", "erwin@home.com"));

        Booking b2 = new Booking(h, LocalDateTime.now(), LocalDateTime.of(2020, Month.OCTOBER, 3, 12, 0), guests2);
        h.addBooking(b2);

        System.out.println(b2);


    }
}
