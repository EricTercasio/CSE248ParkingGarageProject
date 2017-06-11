package controller;

import javafx.scene.control.ComboBox;
import javafx.stage.Stage;
import model.*;
import view.LoginPane;
import view.Pane4Manager;

/**
 * Created by Eric on 6/9/2017.
 */
public class ManagerController {
    public ManagerController(Pane4Manager pane4Manager, LoginPane loginPane, TicketBag ticketBag, ParkingSpaceBag parkingSpaceBag, Stage stage){

        pane4Manager.getActiveTicketsButton().setOnAction(e->{
            for(int i = 0; i < ticketBag.getTickets().size(); i++){
                pane4Manager.getActiveTicketsOptions().add("Ticket # " +String.valueOf(ticketBag.getTickets().get(i).getTicketID()));
            }
            pane4Manager.getPane().setCenter(pane4Manager.getTicketBox());
        });
        pane4Manager.getActiveTicketsBox().setOnAction(e->{
            if(pane4Manager.getActiveTicketsBox().getSelectionModel().getSelectedItem() != null) {
                String ticketID = pane4Manager.getActiveTicketsBox().getSelectionModel().getSelectedItem().substring(9);
                Ticket ticket = ticketBag.findByTicketID(Integer.parseInt(ticketID));
                String parkingSpaceType;
                if (ticket.getParkingSpace() instanceof RegularParkingSpace) {
                    parkingSpaceType = "Regular Parking Space";
                } else {
                    parkingSpaceType = "Handicapped Parking Space";
                }
                pane4Manager.getTicketNumber().setText("Ticket # : " + String.valueOf(ticket.getTicketID()));
                pane4Manager.getLicensePlate().setText("License Plate # " + ticket.getVehicle().getLicensePlate());
                pane4Manager.getParkingSpot().setText("Parking Spot type: " + parkingSpaceType);
                pane4Manager.getSpotNumber().setText("Space number: " + ticket.getParkingSpace().getParkingNumber());
                if(ticket.isValetPark() == true){
                    pane4Manager.getValetParking().setText("Parking Type : Valet");
                }else{
                    pane4Manager.getValetParking().setText("Parking Type : Self parked");
                }
                }


        });
        pane4Manager.getEmptySpotsButton().setOnAction(e->{
            for(int i =0; i < parkingSpaceBag.getParkingSpaces().size(); i++){
                pane4Manager.getEmptySpotsOptions().add("Spot # "+parkingSpaceBag.getParkingSpaces().get(i).getParkingNumber());
            }
            pane4Manager.getPane().setCenter(pane4Manager.getSpotsHBox());
        });
        pane4Manager.getSpotsBox().setOnAction(e->{
            if(pane4Manager.getSpotsBox().getSelectionModel().getSelectedItem() != null){
                String spotNumber = pane4Manager.getSpotsBox().getSelectionModel().getSelectedItem().substring(7);
                System.out.println(spotNumber);
                ParkingSpace parkingSpace = parkingSpaceBag.findByParkingNumber(Integer.parseInt(spotNumber));
                if(parkingSpace instanceof RegularParkingSpace){
                    pane4Manager.getParkingSpotType().setText("Regular Parking Spot");
                    pane4Manager.getHourlyRate().setText("Hourly Rate : $" +String.valueOf(((RegularParkingSpace) parkingSpace).getHourlyRate()));
                }else{
                    pane4Manager.getParkingSpotType().setText("Handicapped Parking Spot");
                    pane4Manager.getHourlyRate().setText("Hourly Rate : $" +String.valueOf(((HandicappedParkingSpace) parkingSpace).getHourlyRate()));
                }
                pane4Manager.getAvailibility().setText("Open");
            }

        });

        pane4Manager.getBackButton().setOnAction(e->{
            pane4Manager.getTicketNumber().setText("");
            pane4Manager.getLicensePlate().setText("");
            pane4Manager.getParkingSpot().setText("");
            pane4Manager.getValetParking().setText("");
            pane4Manager.getSpotNumber().setText("");
            pane4Manager.getHourlyRate().setText("");
            pane4Manager.getAvailibility().setText("");
            pane4Manager.getParkingSpotType().setText("");
            pane4Manager.getPane().setCenter(null);
            pane4Manager.getActiveTicketsOptions().clear();
            pane4Manager.getEmptySpotsOptions().clear();
            stage.setScene(loginPane.getScene());
        });
    }
}
