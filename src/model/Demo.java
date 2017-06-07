package model;

/**
 * Created by Kitcatski on 6/6/2017.
 */
public class Demo {
    public static void main(String[] args) {
        Ticket ticket = new Ticket();
        RegularParkingSpace regularParkingSpace = new RegularParkingSpace(5);
        regularParkingSpace.carPark(ticket);

        System.out.println(regularParkingSpace.getAmount());
        System.out.println(regularParkingSpace.isParked());
        regularParkingSpace.unPark();
        System.out.println(regularParkingSpace.isParked());



    }
}
