package hotel;

import java.time.LocalDate;
import java.util.ArrayList;

class Booking{
    Room room;
    ArrayList<Guest> guests;
    LocalDate startDate;
    LocalDate endDate;
    String vacationType;
    
    public Booking(Room r, LocalDate start, LocalDate end, String type){
        room = r;
        startDate = start;
        endDate = end;
        guests = new ArrayList<>();
        vacationType = type;
    }
    public void addGuest(Guest g){
        if(room.beds > guests.size()){
            guests.add(g);
        }else{
            System.out.println("Varování: Pokoj neobsahuje dost lůžek.");
        }
    }
}
