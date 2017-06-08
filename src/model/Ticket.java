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

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
    public void valetPark(){
        totalPrice = totalPrice + 5;
        parkingSpace.park();
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
