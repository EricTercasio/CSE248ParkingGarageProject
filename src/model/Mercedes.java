package model;

/**
 * Created by Eric on 6/8/2017.
 */
public class Mercedes extends Car{

    public Mercedes(String licensePlate) {
        super(licensePlate);
    }
    public String getVehicleType(){
        return "Mercedes";
    }
}
