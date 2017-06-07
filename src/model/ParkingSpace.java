package model;

/**
 * Created by Kitcatski on 6/6/2017.
 */
public abstract class ParkingSpace {
    private boolean isParked;
    private int amount;
    private Ticket ticket;

    public ParkingSpace(){

    }
    public boolean carPark(Ticket ticket){
        isParked = true;
        return isParked;
    }
    public Ticket unPark(){
        isParked = false;
        Ticket tempTicket = ticket;
        ticket = null;
        return tempTicket;

    }
    public int pay(int payment){
        if (payment >= amount){
            payment = payment - amount;
            amount = 0;
            return payment;
        }else{
            System.out.println("Not enough money");
            return payment;
        }

    }
    public int getAmount(){
        return amount;
    }
    public void setAmount(int amount){
        this.amount = amount;
    }
    public boolean isParked(){
        return isParked;
    }

}
