package plants;

import java.time.LocalDate;

public class Plant {
    private String name;
    private String notes;
    private LocalDate planted;
    private LocalDate lastWatered;
    private int wateringFrequency;
    
    public Plant(String name, String notes, LocalDate planted, LocalDate lastWatered, int wateringFrequency) throws PlantException{
        this.name = name;
        this.notes = notes;
        this.planted = planted;
        if(lastWatered.isBefore(planted)){
            throw new PlantException("Poslední zálivka rostliny nemohla být před jejím zasazením.");
        }
        this.lastWatered = lastWatered;
        if(wateringFrequency < 1){
            throw new PlantException("Frekvence zálivky musí být nezáporné číslo.");
        }
        this.wateringFrequency = wateringFrequency;
    }
    public Plant(String name, LocalDate planted, int wateringFrequency){
        this.name = name;
        this.notes = "";
        this.planted = planted;
        this.lastWatered = LocalDate.now();
        this.wateringFrequency = wateringFrequency;
    }
    public Plant (String name){
        this.name = name;
        this.notes = "";
        this.planted = LocalDate.now();
        this.lastWatered = LocalDate.now();
        this.wateringFrequency = 7;
    }
    public String getName(){
        return name;
    }
    public String getNotes(){
        return notes;
    }
    public LocalDate getPlanted(){
        return planted;
    }
    public LocalDate getLastWatered(){
        return lastWatered;
    }
    public int getWateringFrequency(){
        return wateringFrequency;
    }
    public String getWateringInfo(){
        return(name + ", naposledy zalita " + lastWatered + ", doporučená další zálivka " + lastWatered.plusDays(7));
    }
}
