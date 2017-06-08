package model;

/**
 * Created by Eric on 6/8/2017.
 */
public class ParkingLot {
    private TicketBag ticketBag;
    private ParkingSpaceBag parkingSpaceBag;

    public ParkingLot(TicketBag ticketBag, ParkingSpaceBag parkingSpaceBag) {
        this.ticketBag = ticketBag;
        this.parkingSpaceBag = parkingSpaceBag;
    }

    public TicketBag getTicketBag() {
        return ticketBag;
    }

    public void setTicketBag(TicketBag ticketBag) {
        this.ticketBag = ticketBag;
    }

    public ParkingSpaceBag getParkingSpaceBag() {
        return parkingSpaceBag;
    }

    public void setParkingSpaceBag(ParkingSpaceBag parkingSpaceBag) {
        this.parkingSpaceBag = parkingSpaceBag;
    }

    @Override
    public String toString() {
        return "ParkingLot{" +
                "ticketBag=" + ticketBag +
                ", parkingSpaceBag=" + parkingSpaceBag +
                '}';
    }
}
