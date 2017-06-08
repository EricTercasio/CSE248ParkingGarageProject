package model;

/**
 * Created by Kitcatski on 6/6/2017.
 */
public class Ticket {
    private ParkingSpace parkingSpace;
    private double totalPrice;
    private Car car;

    public Ticket(ParkingSpace parkingSpace, Car car){
        this.parkingSpace = parkingSpace;
        this.car = car;

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
        totalPrice = totalPrice + 5;
        parkingSpace.park();
    }
    public void calculateTotalPrice(){
        if (parkingSpace instanceof RegularParkingSpace){
            totalPrice = parkingSpace.getHoursParked() * ((RegularParkingSpace) parkingSpace).getHourlyRate();
        }else if(parkingSpace instanceof HandicappedParkingSpace){
            totalPrice = parkingSpace.getHoursParked() * ((HandicappedParkingSpace) parkingSpace).getHourlyRate();
        }
    }
    public Car getCar(){
        return car;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "parkingSpace=" + parkingSpace +
                ", totalPrice=" + totalPrice +
                '}';
    }
}
