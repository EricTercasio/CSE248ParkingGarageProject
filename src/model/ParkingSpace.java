package model;


/**
 * Created by Kitcatski on 6/6/2017.
 */
public abstract class ParkingSpace {
    private int parkingNumber;
    private static int parkingNumberInt = 0;
    private boolean isParked;
    private int hoursParked;


    public ParkingSpace(){
        parkingNumber = parkingNumberInt++;

    }
    public int getParkingNumber(){
        return parkingNumber;
    }
    public void park(){
        isParked = true;
    }
    public void unPark(int hours){
        hoursParked = hours;
        isParked = false;
    }
    public boolean isParked(){
        return isParked;
    }
    public int getHoursParked(){
        return hoursParked;
    }

    @Override
    public String toString() {
        return "ParkingSpace{" +
                "parkingNumber=" + parkingNumber +
                ", isParked=" + isParked +
                ", hoursParked=" + hoursParked +
                '}';
    }
}
