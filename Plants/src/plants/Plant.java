package plants;

import java.time.LocalDate;

public class Plant implements Comparable<Plant>{
    private String name;
    private String notes;
    private LocalDate planted;
    private LocalDate lastWatered;
    private int wateringFrequency;
    
    public Plant(String name, String notes, LocalDate planted, LocalDate lastWatered, int wateringFrequency) throws PlantException{
        this.name = name;
        this.notes = notes;
        this.planted = planted;
        this.setLastWatered(lastWatered);
        this.setWateringFrequency(wateringFrequency);
    }
    public Plant(String name, LocalDate planted, int wateringFrequency) throws PlantException{
        this(name, "", planted, LocalDate.now(), wateringFrequency);
    }
    public Plant (String name) throws PlantException{
        this(name, LocalDate.now(), 7);
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
    public void setName(String name) {
        this.name = name;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }
    public void setPlanted(LocalDate planted) {
        this.planted = planted;
    }
    public void setLastWatered(LocalDate lastWatered) throws PlantException {
        if(lastWatered.isBefore(planted)){
            throw new PlantException("Poslední zálivka rostliny nemohla být před jejím zasazením.");
        }else{
            this.lastWatered = lastWatered;
        }
    }
    public void setWateringFrequency(int wateringFrequency) throws PlantException {
        if(wateringFrequency < 1){
            throw new PlantException("Frekvence zálivky musí být nezáporné číslo.");
        }
        this.wateringFrequency = wateringFrequency;
    }
    public String getWateringInfo(){
        return(name + ", naposledy zalita " + lastWatered + ", doporučená další zálivka " + lastWatered.plusDays(7));
    }
    @Override
    public int compareTo(Plant secondPlant) {
        return this.name.compareTo(secondPlant.name);
    }
}
