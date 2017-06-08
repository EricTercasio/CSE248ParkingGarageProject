package model;

import java.util.ArrayList;

/**
 * Created by Kitcatski on 6/7/2017.
 */
public class ParkingSpaceBag {
    private ArrayList<ParkingSpace> parkingSpaces;

    public ParkingSpaceBag(){
        parkingSpaces = new ArrayList<ParkingSpace>();

    }
    public void add(ParkingSpace parkingSpace){
        parkingSpaces.add(parkingSpace);
    }
    public void display(){
        for(int i = 0; i < parkingSpaces.size(); i++){
            System.out.println(parkingSpaces.get(i).getParkingNumber());
        }
    }
    public ParkingSpace findByParkingNumber(int number){
        for (int i = 0; i < parkingSpaces.size();i++){
            if(parkingSpaces.get(i).getParkingNumber() == number){
                return parkingSpaces.get(i);
            }
        }
        return null;
    }

}
