package hotel;

import java.time.LocalDate;

class Guest{
    String name;
    String surname;
    LocalDate birthDate;
    
    public Guest(String n, String s, int day, int month, int year){
        name = n;
        surname = s;
        birthDate = LocalDate.of(day, month, year);
    }
}
