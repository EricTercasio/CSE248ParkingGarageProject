package model;

/**
 * Created by Kitcatski on 6/6/2017.
 */
public class Bus implements Vehicle{
    private String licensePlate;

    public Bus(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String getLicensePlate() {
        return null;
    }

    @Override
    public void move() {

    }
}
