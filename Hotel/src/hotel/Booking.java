package hotel;

import java.time.LocalDate;
import java.util.ArrayList;

class Booking{
    private Room room;
    private ArrayList<Guest> guests;
    private LocalDate startDate;
    private LocalDate endDate;
    private String vacationType;
    
    public Booking(Room room, LocalDate startDate, LocalDate endDate, String vacationtType){
        this.room = room;
        this.startDate = startDate;
        this.endDate = endDate;
        this.guests = new ArrayList<>();
        this.vacationType = vacationType;
    }
    public void addGuest(Guest guest){
        if(room.getBeds() > guests.size()){
            guests.add(guest);
        }else{
            System.out.println("Varování: Pokoj neobsahuje dost lůžek.");
        }
    }
    public Room getRoom(){
        return room;
    }
    public ArrayList<Guest> getGuests(){
        return guests;
    }
    public LocalDate getStartDate(){
        return startDate;
    }
    public LocalDate getEndDate(){
        return endDate;
    }
    public int getDays(){
        return startDate.until(endDate).getDays();
    }
    public int getTotalPrice(){
        return getDays()*room.getPrice();
    }
}
