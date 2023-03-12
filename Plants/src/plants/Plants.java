package plants;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Plants {
    
    public static void main(String[] args) throws FileNotFoundException, PlantException, IOException {
        PlantsList list = new PlantsList();
        list.loadData();
        list.writeWateringInfo();
        list.removePlantAt(2);
        list.addPlant(new Plant("bazalka v kuchyni", "", LocalDate.of(2021, 9, 4), LocalDate.of(2021, 9, 4), 3));
        list.saveData();
    }
}
