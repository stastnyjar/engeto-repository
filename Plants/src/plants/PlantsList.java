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
    private ArrayList<Plant> plantsList;
    
    public PlantsList(){
        plantsList = new ArrayList<>();
    }
    public void loadData() throws FileNotFoundException{
        File file = new File("C:\\Users\\jstas\\OneDrive\\Dokumenty\\kvetiny.txt");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNext()){
            try{
                String rawText = scanner.nextLine();
                String[] texts = rawText.split("\t");
                LocalDate dateLastWatered = LocalDate.parse(texts[3]);
                LocalDate datePlanted = LocalDate.parse(texts[4]);
                Plant plant = new Plant(texts[0], texts[1], datePlanted, dateLastWatered, Integer.parseInt(texts[2]));
                plantsList.add(plant);
            }catch(PlantException e){
                System.out.println("Načítání souboru selhalo.");
            }
        }
    }

    public ArrayList<Plant> getPlantsList() {
        return plantsList;
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
        try{
            PrintWriter writer = new PrintWriter(new FileWriter("C:\\Users\\jstas\\OneDrive\\Dokumenty\\kvetiny.txt"));
            for(Plant plant: plantsList){
                writer.println(plant.getName() + "\t" + plant.getNotes() + "\t" + plant.getWateringFrequency() + "\t" + plant.getLastWatered() + "\t" + plant.getPlanted());
                writer.flush();
            }
        }catch(Exception e){
            System.out.println("Ukládání selhalo.");
        }
    }
    public void sortByName(){
        Collections.sort(plantsList);
    }
    public void sortByLastWatered(){
        Collections.sort(plantsList, new PlantDateComparator());
    }
}
