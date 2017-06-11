package controller;

import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
import model.RegularParkingSpace;
import model.Ticket;
import model.TicketBag;
import view.*;

import java.util.Optional;

/**
 * Created by Eric on 6/9/2017.
 */
public class CustomerController {

    public CustomerController(CustomerPane customerPane, BuyATicketPane buyATicketPane, Pane4Receipt pane4Receipt, PaymentPane paymentPane, LoginPane loginPane, TicketBag ticketBag,TicketBag paidTicketBag, Stage stage){
        customerPane.getBuyATicketButton().setOnAction(e->{
            stage.setScene(buyATicketPane.getScene());
        });
        customerPane.getBackButton().setOnAction(e->{
            stage.setScene(loginPane.getScene());
        });
        customerPane.getPayATicketButton().setOnAction(e->{
            TextInputDialog alert = new TextInputDialog();
            alert.setContentText("Please enter your license plate number : ");
            alert.setTitle("Confirm");
            Optional<String> result = alert.showAndWait();
            if(result.isPresent()) {
                Ticket ticket = ticketBag.findByLicense(result.get());
                if (ticket != null) {
                    TextInputDialog hoursAlert = new TextInputDialog();
                    hoursAlert.setContentText("Please enter the amount of hours you stayed : ");
                    alert.setTitle("Confirm");
                    Optional<String> hoursResult = hoursAlert.showAndWait();
                    if (hoursResult.get().matches("-?\\d+(.\\d+)?") && Integer.valueOf(hoursResult.get()) > 1) {
                        ticket.getParkingSpace().unPark(Integer.valueOf(hoursResult.get()));
                        System.out.println(ticket.getParkingSpace().getHoursParked());
                        ticket.calculateTotalPrice();
                        paymentPane.getPaymentAmount().setText(String.valueOf(ticket.getTotalPrice()));
                        paymentPane.getTicketNumberText().setText(String.valueOf(ticket.getTicketID()));
                        stage.setScene(paymentPane.getScene());
                    } else {
                        Alert errorAlert = new Alert(Alert.AlertType.ERROR);
                        errorAlert.setContentText("Hours entered is not valid or less than 1");
                        errorAlert.showAndWait();
                    }
                } else {
                    Alert noLicenseAlert = new Alert(Alert.AlertType.ERROR);
                    noLicenseAlert.setContentText("No ticket found");
                    noLicenseAlert.showAndWait();
                }
            }
        });
        customerPane.getViewReceiptButton().setOnAction(e->{
            TextInputDialog textInputDialog = new TextInputDialog();
            textInputDialog.setContentText("Please enter your ticket ID or license plate");
            Optional<String> result = textInputDialog.showAndWait();
            if (result.isPresent()) {
                if (result.get().isEmpty()) {
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setContentText("Please enter a License or Ticket Number");
                    alert.showAndWait();
                    textInputDialog.close();
                } else {
                    Ticket ticket = paidTicketBag.findByLicense(result.get());
                    if (ticket == null) {
                        ticket = paidTicketBag.findByTicketID(Integer.parseInt(result.get()));
                        if (ticket == null) {
                            Alert alert = new Alert(Alert.AlertType.ERROR);
                            alert.setContentText("No tickets found or ticket car is currently parked");
                            alert.showAndWait();
                        } else {
                            pane4Receipt.getCarText().setText("Vehicle Type: " + ticket.getVehicle().getVehicleType());
                            pane4Receipt.getLicenseText().setText("License Plate #: " + ticket.getVehicle().getLicensePlate());
                            pane4Receipt.getTotalText().setText("Total amount : $" + ticket.getTotalPrice());
                            if (ticket.getParkingSpace() instanceof RegularParkingSpace) {
                                pane4Receipt.getParkingSpotText().setText("Parking spot type : Regular | Number : " + ticket.getParkingSpace().getParkingNumber());
                            } else {
                                pane4Receipt.getParkingSpotText().setText("Parking spot type : Handicapped | Number : " + ticket.getParkingSpace().getParkingNumber());
                            }
                            if (ticket.isValetPark() == true) {
                                pane4Receipt.getValetParking().setText("Valet parking : Yes (+$5)");
                            } else {
                                pane4Receipt.getValetParking().setText("Valet Parking : No");
                            }
                            stage.setScene(pane4Receipt.getScene());

                        }


                    } else {
                        pane4Receipt.getCarText().setText("Vehicle Type: " + ticket.getVehicle().getVehicleType());
                        pane4Receipt.getLicenseText().setText("License Plate #: " + ticket.getVehicle().getLicensePlate());
                        pane4Receipt.getTotalText().setText("Total amount : $" + ticket.getTotalPrice());
                        if (ticket.getParkingSpace() instanceof RegularParkingSpace) {
                            pane4Receipt.getParkingSpotText().setText("Parking spot type : Regular | Number : " + ticket.getParkingSpace().getParkingNumber());
                        } else {
                            pane4Receipt.getParkingSpotText().setText("Parking spot type : Handicapped | Number : " + ticket.getParkingSpace().getParkingNumber());
                        }
                        if (ticket.isValetPark() == true) {
                            pane4Receipt.getValetParking().setText("Valet parking : Yes (+$5)");
                        } else {
                            pane4Receipt.getValetParking().setText("Valet Parking : No");
                        }
                        stage.setScene(pane4Receipt.getScene());
                    }
                }
            }
        });





    }
}
