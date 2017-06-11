package model;

import java.util.ArrayList;

/**
 * Created by Kitcatski on 6/8/2017.
 */
public class TicketBag {
    private ArrayList<Ticket> tickets;

    public TicketBag(){
        tickets = new ArrayList<Ticket>();
    }

    public void add(Ticket ticket){
        tickets.add(ticket);
    }
    public void remove(Ticket ticket){
        for(int i = 0; i < tickets.size(); i++){
            if(tickets.get(i).equals(ticket)){
                tickets.remove(ticket);
            }
        }
    }
    public Ticket findByLicense(String license){
        for (int i = 0; i < tickets.size(); i++){
            if(tickets.get(i).getVehicle().getLicensePlate().equals(license)){
                return tickets.get(i);
            }

        }
        return null;
    }
    public Ticket findByTicketID(int id){
        for(int i = 0; i < tickets.size();i++){
            if (tickets.get(i).getTicketID() == id){
                return tickets.get(i);
            }
        }
        return null;
    }
    public void display(){
        for (int i = 0; i < tickets.size(); i++){
            System.out.println(tickets.get(i));
        }
    }
    public ArrayList<Ticket> getTickets(){
        return tickets;
    }
}
