package hotel;

import java.time.LocalDate;
import java.util.ArrayList;

class Booking{
    Room room;
    ArrayList<Guest> guests;
    LocalDate startDate;
    LocalDate endDate;
    String vacationType;
    
    public Booking(Room room, LocalDate startDate, LocalDate endDate, String vacationtType){
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
        this.guests = new ArrayList<>();
        this.vacationType = vacationType;
    }
    public void addGuest(Guest guest){
        if(room.beds > guests.size()){
            guests.add(guest);
        }else{
            System.out.println("Varování: Pokoj neobsahuje dost lůžek.");
        }
    }
}
