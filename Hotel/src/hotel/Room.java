package hotel;

class Room{
    int number;
    byte beds;
    boolean balcony;
    boolean view;
    int price;
    
    public Room(int n, byte b, boolean bal, boolean v, int p){
        number = n;
        beds = b;
        balcony = bal;
        view = v;
        price = p;
    }
}
