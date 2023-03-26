package plants;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Plants {
    public static void main(String[] args) throws FileNotFoundException, PlantException, IOException {
        PlantsList list = new PlantsList();
        list.loadData();
        System.out.println("Podle názvu:");
        list.sortByName();
        list.writeWateringInfo();
        System.out.println("Podle data poslední zálivky:");
        list.sortByLastWatered();
        list.writeWateringInfo();
        HashSet<LocalDate> dates = new HashSet<>();
        for(Plant plant: list.getPlantsList()){
            dates.add(plant.getPlanted());
        }
        System.out.println("Datumy zasazení rostlin:");
        for(LocalDate date: dates){
            System.out.println(date);
        }
        System.out.println("Jen poslední měsíc:");
        //předpokládám, že myslíte kalendářní měsíc
        boolean noPlantsPlanted = true;
        for(LocalDate date: dates){
            if(date.getYear() == LocalDate.now().getYear() && date.getMonth().equals(LocalDate.now().getMonth())){
                System.out.println(date);
                noPlantsPlanted = false;
            }
        }
        if(noPlantsPlanted){
            System.out.println("tento měsíc žádné rostliny zasazeny nebyly.");
        }
    }
}
