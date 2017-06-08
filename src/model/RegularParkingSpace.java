package model;

/**
 * Created by Kitcatski on 6/6/2017.
 */
public class RegularParkingSpace extends ParkingSpace {
    private int hourlyRate = 10;

    public RegularParkingSpace() {
        super();


    }
    public int getHourlyRate(){
        return hourlyRate;
    }


    @Override
    public String toString() {
        return "RegularParkingSpace{" +
                "hourlyRate=" + hourlyRate +
                '}';
    }
}
