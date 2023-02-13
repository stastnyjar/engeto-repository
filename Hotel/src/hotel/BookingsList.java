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
            System.out.println("Pokoj: " + b.getRoom().getNumber());
            int commas = b.getGuests().size()-1;
            System.out.print("Hosté: ");
            for(Guest g: b.getGuests()){
                System.out.print(g.getName() + " " + g.getSurname());
                if(commas > 0){
                    System.out.print(", ");
                    commas--;
                }else{
                    System.out.println("");
                }
            }
            System.out.println("Začátek pobytu: " + b.getStartDate().toString());
            System.out.println("Konec pobytu: " + b.getEndDate().toString());
            System.out.println("Účtovaná částka: " + b.getTotalPrice());
        }
    }
}
