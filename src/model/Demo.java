package model;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Kitcatski on 6/6/2017.
 */
public class Demo {
    public static void main(String[] args) {
        Ticket ticket = new Ticket(new RegularParkingSpace(),new Audi("81424"));
        Ticket ticket1 = new Ticket(new RegularParkingSpace(), new Mercedes("123141"));
        ticket.valetPark();
        System.out.println(ticket.getTotalPrice());

//        TicketBag ticketBag = new TicketBag();
//        ticketBag.add(ticket);
//        ticketBag.add(ticket1);
//        ticketBag.display();
//        System.out.println(ticketBag.findByLicense("81424").getParkingSpace().isParked());
//        ticket.getParkingSpace().park();
//        System.out.println(ticketBag.findByLicense("81424").getParkingSpace().isParked());
//        ticket.getParkingSpace().unPark(10);
//        System.out.println(ticketBag.findByLicense("81424").getParkingSpace().isParked());
//        ticket.calculateTotalPrice();
//        System.out.println(ticket.getTotalPrice());
//        RegularParkingSpace r = new RegularParkingSpace();
//        RegularParkingSpace r1 = new RegularParkingSpace();
//        RegularParkingSpace r2 = new RegularParkingSpace();
//        RegularParkingSpace r3 = new RegularParkingSpace();
//        RegularParkingSpace r4 = new RegularParkingSpace();
//        RegularParkingSpace r5 = new RegularParkingSpace();
//        RegularParkingSpace r6 = new RegularParkingSpace();
//        RegularParkingSpace r7 = new RegularParkingSpace();
//        HandicappedParkingSpace h = new HandicappedParkingSpace();
//        HandicappedParkingSpace h1 = new HandicappedParkingSpace();
//        ParkingSpaceBag parkingSpaceBag = new ParkingSpaceBag();
//        System.out.println("------------");
//        parkingSpaceBag.add(r);
//        parkingSpaceBag.add(r1);
//        parkingSpaceBag.add(r2);
//        parkingSpaceBag.add(r3);
//        parkingSpaceBag.add(r4);
//        parkingSpaceBag.add(r5);
//        parkingSpaceBag.add(r6);
//        parkingSpaceBag.add(r7);
//        parkingSpaceBag.add(h);
//        parkingSpaceBag.add(h1);
//        parkingSpaceBag.display();
//        System.out.println("------------");
//        parkingSpaceBag.remove(r6);
//        parkingSpaceBag.display();
//        System.out.println("------------");
//        parkingSpaceBag.add(r6);
//        parkingSpaceBag.display();




    }
}
