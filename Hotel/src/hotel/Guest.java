package hotel;

import java.time.LocalDate;

class Guest{
    String name;
    String surname;
    LocalDate birthDate;
    
    public Guest(String name, String surname, int day, int month, int year){
        this.name = name;
        this.surname = surname;
        this.birthDate = LocalDate.of(day, month, year);
    }
}
