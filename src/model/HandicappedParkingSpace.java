package model;

/**
 * Created by Kitcatski on 6/6/2017.
 */
public class HandicappedParkingSpace extends ParkingSpace {
    private int hourlyRate = 5;

    public HandicappedParkingSpace() {
        super();

    }
    public int getHourlyRate(){
        return hourlyRate;
    }
}
