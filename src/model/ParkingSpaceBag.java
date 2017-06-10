package model;

import java.util.ArrayList;
import java.util.Collections;

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
        selectionSort();

    }
    public void remove(ParkingSpace parkingSpace){
        for(int i = 0; i < parkingSpaces.size(); i++){
            if(parkingSpaces.get(i).equals(parkingSpace)){
                parkingSpaces.remove(parkingSpace);
            }
        }
    }
    public void display(){
        for(int i = 0; i < parkingSpaces.size(); i++){
            System.out.println(parkingSpaces.get(i).toString());
        }
    }
    public ParkingSpace findByParkingNumber(int number){
        for (int i = 0; i < parkingSpaces.size();i++){
            if(parkingSpaces.get(i).getParkingNumber() == number){
                remove(parkingSpaces.get(i));
                return parkingSpaces.get(i);

            }
        }
        return null;
    }
    public RegularParkingSpace getRegularSpot(){
        for (int i = 0; i < parkingSpaces.size(); i++){
            if (parkingSpaces.get(i) instanceof RegularParkingSpace){
                RegularParkingSpace temp = (RegularParkingSpace) parkingSpaces.get(i);
                remove(parkingSpaces.get(i));
                return temp;
            }
        }
        return null;
    }
    public HandicappedParkingSpace getHandicappedSpot(){
        for(int i = 0; i < parkingSpaces.size(); i++){
            if(parkingSpaces.get(i) instanceof HandicappedParkingSpace){
                HandicappedParkingSpace temp = (HandicappedParkingSpace) parkingSpaces.get(i);
                remove(parkingSpaces.get(i));
                return temp;
            }

        }
        return null;
    }
    public void selectionSort(){
            int out;
            int in;
            int min;
            for (out = 0; out < parkingSpaces.size() - 1; out++) {
                min = out;
                for(in = out + 1; in < parkingSpaces.size(); in++) {
                    if(parkingSpaces.get(in).getParkingNumber() < parkingSpaces.get(min).getParkingNumber()) {
                        min = in;
                    }
                }
                Collections.swap(parkingSpaces,out,min);
            }
        }

    }


