package plants;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class PlantsList{
    String FILE_NAME;
    String SPLITTER;
    private ArrayList<Plant> plantsList;
    
    public PlantsList(){
        FILE_NAME = "kvetiny.txt";
        SPLITTER = "\t";
        plantsList = new ArrayList<>();
    }
    public void loadData() throws FileNotFoundException, PlantException{
        File file = new File(FILE_NAME);
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()){
            String rawText = scanner.nextLine();
            String[] texts = rawText.split(SPLITTER);
            LocalDate dateLastWatered = LocalDate.parse(texts[3]);
            LocalDate datePlanted = LocalDate.parse(texts[4]);
            Plant plant = new Plant(texts[0], texts[1], datePlanted, dateLastWatered, Integer.parseInt(texts[2]));
            plantsList.add(plant);
        }
    }

    public ArrayList<Plant> getPlantsList() {
        return new ArrayList<>(plantsList);
    }
    public void addPlant(Plant plant){
        plantsList.add(plant);
    }
    public void removePlantAt(int index){
        plantsList.remove(index);
    }
    public Plant getPlantAt(int index){
        return plantsList.get(index);
    }
    public void writeWateringInfo(){
        for(Plant plant: plantsList){
            System.out.println(plant.getWateringInfo());
        }
    }
    public void saveData() throws FileNotFoundException, IOException{
        PrintWriter writer = new PrintWriter(new FileWriter(FILE_NAME));
        for(Plant plant: plantsList){
            writer.println(plant.getName() + SPLITTER + plant.getNotes() + SPLITTER + plant.getWateringFrequency() + SPLITTER + plant.getLastWatered() + SPLITTER + plant.getPlanted());
        }
        writer.flush();
    }
    public void sortByName(){
        Collections.sort(plantsList);
    }
    public void sortByLastWatered(){
        Collections.sort(plantsList, new PlantDateComparator());
    }
}
