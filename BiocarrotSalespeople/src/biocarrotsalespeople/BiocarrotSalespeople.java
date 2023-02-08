/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package biocarrotsalespeople;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author jstas
 */
public class BiocarrotSalespeople {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "Kristýna";
        String surname = "Ráčková";
        LocalDate birthDate = LocalDate.of(1978, 3, 18);
        int totalContracts = 34;
        int totalCarrotSold = 96;
        String location = "Skalice";
        String registrationPlate = "13LN 36Z8";
        double vehicleFuelComsumption = 5.85;
        String computerIPAdress = "364.249.19.28";
        
        System.out.println(name + " " + surname + " prodala průměrně " + (double)totalCarrotSold/totalContracts + " tun mrkve na smlouvu.");
    }
}
