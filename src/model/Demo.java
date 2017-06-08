package model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Kitcatski on 6/6/2017.
 */
public class Demo {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(new RegularParkingSpace());
        Ticket ticket1 = new Ticket(new RegularParkingSpace());
        System.out.println(ticket.getParkingSpace().getParkingNumber());
        System.out.println(ticket1.getParkingSpace().getParkingNumber());
        RegularParkingSpace regularParkingSpace = new RegularParkingSpace();
        ParkingSpaceBag parkingSpaceBag = new ParkingSpaceBag();
        parkingSpaceBag.add(ticket.getParkingSpace());
        parkingSpaceBag.display();


    }
}
