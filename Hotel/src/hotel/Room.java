package hotel;

class Room{
    private int number;
    private int beds;
    private boolean balcony;
    private boolean view;
    private int price;
    
    public Room(int number, byte beds, boolean balcony, boolean view, int price){
        this.number = number;
        this.beds = beds;
        this.balcony = balcony;
        this.view = view;
        this.price = price;
    }
    public int getNumber(){
        return number;
    }
    public int getBeds(){
        return beds;
    }
    public int getPrice(){
        return price;
    }
    public boolean hasBalcony(){
        return balcony;
    }
    public boolean hasView(){
        return view;
    }
}
