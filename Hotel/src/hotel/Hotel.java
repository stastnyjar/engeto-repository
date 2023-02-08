/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hotel;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

/**
 *
 * @author jstas
 */
public class Hotel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BookingsList list = new BookingsList();
        list.rooms.put(1, new Room(1, (byte)1, true, true, 1000));
        list.rooms.put(2, new Room(2, (byte)1, true, true, 1000));
        list.rooms.put(3, new Room(3, (byte)3, false, true, 2400));
        Guest adéla = new Guest("Adéla", "Malíková", 1993, 3, 13);
        Guest jan = new Guest("Jan", "Dvořáček", 1995, 5, 5);
        LocalDate startDate = LocalDate.of(2021, 7, 19);
        LocalDate endDate = LocalDate.of(2021, 7, 26);
        ArrayList<Guest> guestList = new ArrayList<>();
        guestList.add(adéla);
        list.addBooking(1, guestList, startDate, endDate, "rekreační");
        guestList.add(jan);
        startDate = LocalDate.of(2021, 9, 1);
        endDate = LocalDate.of(2021, 9, 14);
        list.addBooking(3, guestList, startDate, endDate, "rekreační");
        list.listBookings();
    }
}
