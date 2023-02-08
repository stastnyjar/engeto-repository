package hotel;

class Room{
    int number;
    byte beds;
    boolean balcony;
    boolean view;
    int price;
    
    public Room(int number, byte beds, boolean balcony, boolean view, int price){
        this.number = number;
        this.beds = beds;
        this.balcony = balcony;
        this.view = view;
        this.price = price;
    }
}
