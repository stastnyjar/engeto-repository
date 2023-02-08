package hotel;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.HashMap;

class BookingsList{
    HashMap<Integer, Room> rooms;
    ArrayList<Booking> bookings;
    
    public BookingsList(){
        rooms = new HashMap<>();
        bookings = new ArrayList<>();
    }
    public void addBooking(int room, ArrayList<Guest> guests, LocalDate startDate, LocalDate endDate, String type){
        Booking b = new Booking(rooms.get(room), startDate, endDate, type);
        for(Guest g: guests){
            b.addGuest(g);
        }
        bookings.add(b);
    }
    public void listBookings(){
        for(Booking b: bookings){
            System.out.println("-----------------------------");
            System.out.println("Pokoj: " + b.room.number);
            int commas = b.guests.size()-1;
            System.out.print("Hosté: ");
            for(Guest g: b.guests){
                System.out.print(g.name + " " + g.surname);
                if(commas > 0){
                    System.out.print(", ");
                    commas--;
                }else{
                    System.out.println("");
                }
            }
            System.out.println("Začátek pobytu: " + b.startDate.toString());
            System.out.println("Konec pobytu: " + b.endDate.toString());
            Period days = b.startDate.until(b.endDate);
            System.out.println("Účtovaná částka: " + days.getDays()*b.room.price);
        }
    }
}
