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
        System.out.println("Podle názvu:");
        list.sortByName();
        list.writeWateringInfo();
        System.out.println("Podle data poslední zálivky:");
        list.sortByLastWatered();
        list.writeWateringInfo();
    }
}
