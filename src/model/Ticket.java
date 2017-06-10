package model;

/**
 * Created by Kitcatski on 6/6/2017.
 */
public class Ticket {
    private ParkingSpace parkingSpace;
    private double totalPrice;
    private Vehicle vehicle;
    private int ticketID;
    private static int ticketIDint = 1000;

    public Ticket(ParkingSpace parkingSpace, Vehicle vehicle){
        this.parkingSpace = parkingSpace;
        this.vehicle = vehicle;
        ticketID = ticketIDint++;
    }

    public ParkingSpace getParkingSpace() {
        return parkingSpace;
    }

    public void setParkingSpace(ParkingSpace parkingSpace) {
        this.parkingSpace = parkingSpace;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void valetPark(){
        totalPrice += totalPrice + 5;
        parkingSpace.park();
    }
    public void calculateTotalPrice(){
        if (parkingSpace instanceof RegularParkingSpace){
            totalPrice += parkingSpace.getHoursParked() * ((RegularParkingSpace) parkingSpace).getHourlyRate();
        }else if(parkingSpace instanceof HandicappedParkingSpace){
            totalPrice += parkingSpace.getHoursParked() * ((HandicappedParkingSpace) parkingSpace).getHourlyRate();
        }
    }
    public Vehicle getVehicle(){
        return vehicle;
    }
    public int getTicketID(){
        return ticketID;
    }
    @Override
    public String toString() {
        return "Ticket{" +
                "parkingSpace=" + parkingSpace +
                ", totalPrice=" + totalPrice +
                ", ticketID =" +ticketID +
                " licensePlate = "+vehicle.getLicensePlate() +
                '}';
    }
}
