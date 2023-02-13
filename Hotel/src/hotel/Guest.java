package hotel;

import java.time.LocalDate;

class Guest{
    private String name;
    private String surname;
    private LocalDate birthDate;
    
    public Guest(String name, String surname, int day, int month, int year){
        this.name = name;
        this.surname = surname;
        this.birthDate = LocalDate.of(day, month, year);
    }
    public String getName(){
        return name;
    }
    public String getSurname(){
        return surname;
    }
}
