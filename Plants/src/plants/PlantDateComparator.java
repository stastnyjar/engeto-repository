package plants;

import java.util.Comparator;

class PlantDateComparator implements Comparator<Plant>{
    @Override
    public int compare(Plant first, Plant second){
        return first.getLastWatered().compareTo(second.getLastWatered());
    }
}
