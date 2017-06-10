package controller;

import javafx.scene.control.Alert;
import javafx.stage.Stage;
import model.*;
import view.BuyATicketPane;
import view.CustomerPane;

/**
 * Created by Eric on 6/9/2017.
 */
public class BuyATicketController {

    public BuyATicketController(CustomerPane customerPane, BuyATicketPane buyATicketPane, TicketBag ticketBag, ParkingSpaceBag parkingSpaceBag, Stage stage) {
        buyATicketPane.getVehicleBox().setOnAction(e->{
            if(buyATicketPane.getVehicleBox().getSelectionModel().isSelected(0)){
                buyATicketPane.getPane().getChildren().add(2,buyATicketPane.getCarHBox());
            }else if(buyATicketPane.getPane().getChildren().get(2).equals(buyATicketPane.getCarHBox()) && !buyATicketPane.getVehicleBox().getSelectionModel().isSelected(0)){
                buyATicketPane.getPane().getChildren().remove(2);
                buyATicketPane.getCarBox().getSelectionModel().clearSelection();
            }
        });
        buyATicketPane.getCarBox().setOnAction(e->{
            if(buyATicketPane.getCarBox().getSelectionModel().isSelected(0) || buyATicketPane.getCarBox().getSelectionModel().isSelected(1)){
                if(buyATicketPane.getMovementOptions().size() == 2) {
                    buyATicketPane.getMovementOptions().add("Car self-park feature");
                }
            }else if(buyATicketPane.getCarBox().getSelectionModel().isSelected(2) && buyATicketPane.getMovementOptions().get(2) != null){
                if(buyATicketPane.getMovementOptions().size() == 3)
                buyATicketPane.getMovementOptions().remove(2);
            }
        });

            System.out.println(buyATicketPane.getVehicleBox().getSelectionModel().getSelectedItem());

            buyATicketPane.getBuyTicketButton().setOnAction(e -> {
                if(buyATicketPane.getVehicleBox().getSelectionModel().isEmpty()){
                    alert("Type of vehicle");
                }else if(buyATicketPane.getVehicleBox().getSelectionModel().isSelected(0) && buyATicketPane.getCarBox().getSelectionModel().isEmpty()){
                    alert("Type of car");
                }else if(buyATicketPane.getParkBox().getSelectionModel().isEmpty()) {
                    alert("Parking spot type");
                }else if(buyATicketPane.getParkingSpotBox().getSelectionModel().isEmpty()){
                    alert("How you would like to be parked");
                }else if(buyATicketPane.getLicensePlateField().getText().isEmpty()){
                    Alert alert = new Alert(Alert.AlertType.ERROR);
                    alert.setTitle("Error");
                    alert.setContentText("License plate is not filled in");
                    alert.showAndWait();
                }else{
                    if (buyATicketPane.getParkBox().getSelectionModel().isSelected(0) && buyATicketPane.getVehicleBox().getSelectionModel().isSelected(0) && buyATicketPane.getCarBox().getSelectionModel().isSelected(0)){
                        Audi audi = new Audi(buyATicketPane.getLicensePlateField().getText());
                        RegularParkingSpace regularParkingSpace = parkingSpaceBag.getRegularSpot();
                        Ticket ticket = new Ticket(regularParkingSpace,audi);
                        if(buyATicketPane.getParkingSpotBox().getSelectionModel().isSelected(1)){
                            ticket.valetPark();
                        }
                        regularParkingSpace.park();
                        ticketBag.add(ticket);
                        parkingSpaceBag.display();
                        ticketConfirmation(String.valueOf(ticket.getTicketID()),String.valueOf(ticket.getParkingSpace().getParkingNumber()));

                            }
                    else if (buyATicketPane.getParkBox().getSelectionModel().isSelected(0) && buyATicketPane.getVehicleBox().getSelectionModel().isSelected(0) && buyATicketPane.getCarBox().getSelectionModel().isSelected(1)){
                        Mercedes mercedes = new Mercedes(buyATicketPane.getLicensePlateField().getText());
                        RegularParkingSpace regularParkingSpace = parkingSpaceBag.getRegularSpot();
                        Ticket ticket = new Ticket(regularParkingSpace,mercedes);
                        if(buyATicketPane.getParkingSpotBox().getSelectionModel().isSelected(1)){
                            ticket.valetPark();
                        }
                        regularParkingSpace.park();
                        ticketBag.add(ticket);
                        parkingSpaceBag.display();
                        ticketConfirmation(String.valueOf(ticket.getTicketID()),String.valueOf(ticket.getParkingSpace().getParkingNumber()));
                      }
                    else if (buyATicketPane.getParkBox().getSelectionModel().isSelected(0) && buyATicketPane.getVehicleBox().getSelectionModel().isSelected(0) && buyATicketPane.getCarBox().getSelectionModel().isSelected(2)){
                        Car car = new Car(buyATicketPane.getLicensePlateField().getText());
                        RegularParkingSpace regularParkingSpace = parkingSpaceBag.getRegularSpot();
                        Ticket ticket = new Ticket(regularParkingSpace,car);
                        if(buyATicketPane.getParkingSpotBox().getSelectionModel().isSelected(1)){
                            ticket.valetPark();
                        }
                        regularParkingSpace.park();
                        ticketBag.add(ticket);
                        parkingSpaceBag.display();
                        ticketConfirmation(String.valueOf(ticket.getTicketID()),String.valueOf(ticket.getParkingSpace().getParkingNumber()));
                    }
                    else if (buyATicketPane.getParkBox().getSelectionModel().isSelected(1) && buyATicketPane.getVehicleBox().getSelectionModel().isSelected(0) && buyATicketPane.getCarBox().getSelectionModel().isSelected(0)){
                        Audi audi = new Audi(buyATicketPane.getLicensePlateField().getText());
                        HandicappedParkingSpace handicappedParkingSpace = parkingSpaceBag.getHandicappedSpot();
                        Ticket ticket = new Ticket(handicappedParkingSpace,audi);
                        if(buyATicketPane.getParkingSpotBox().getSelectionModel().isSelected(1)){
                            ticket.valetPark();
                        }
                        handicappedParkingSpace.park();
                        ticketBag.add(ticket);
                        parkingSpaceBag.display();
                        ticketConfirmation(String.valueOf(ticket.getTicketID()),String.valueOf(ticket.getParkingSpace().getParkingNumber()));
                    }
                    else if (buyATicketPane.getParkBox().getSelectionModel().isSelected(1) && buyATicketPane.getVehicleBox().getSelectionModel().isSelected(0) && buyATicketPane.getCarBox().getSelectionModel().isSelected(1)){
                        Mercedes mercedes = new Mercedes(buyATicketPane.getLicensePlateField().getText());
                        HandicappedParkingSpace handicappedParkingSpace = parkingSpaceBag.getHandicappedSpot();
                        Ticket ticket = new Ticket(handicappedParkingSpace,mercedes);
                        if(buyATicketPane.getParkingSpotBox().getSelectionModel().isSelected(1)){
                            ticket.valetPark();
                        }
                        handicappedParkingSpace.park();
                        ticketBag.add(ticket);
                        parkingSpaceBag.display();
                        ticketConfirmation(String.valueOf(ticket.getTicketID()),String.valueOf(ticket.getParkingSpace().getParkingNumber()));
                    }
                    else if (buyATicketPane.getParkBox().getSelectionModel().isSelected(1) && buyATicketPane.getVehicleBox().getSelectionModel().isSelected(0) && buyATicketPane.getCarBox().getSelectionModel().isSelected(2)){
                        Car car = new Car(buyATicketPane.getLicensePlateField().getText());
                        HandicappedParkingSpace handicappedParkingSpace = parkingSpaceBag.getHandicappedSpot();
                        Ticket ticket = new Ticket(handicappedParkingSpace,car);
                        if(buyATicketPane.getParkingSpotBox().getSelectionModel().isSelected(1)){
                            ticket.valetPark();
                        }
                        handicappedParkingSpace.park();
                        ticketBag.add(ticket);
                        parkingSpaceBag.display();
                        ticketConfirmation(String.valueOf(ticket.getTicketID()),String.valueOf(ticket.getParkingSpace().getParkingNumber()));
                    }
                    else if (buyATicketPane.getParkBox().getSelectionModel().isSelected(0) && buyATicketPane.getVehicleBox().getSelectionModel().isSelected(1)){
                        Bus bus = new Bus(buyATicketPane.getLicensePlateField().getText());
                        RegularParkingSpace regularParkingSpace = parkingSpaceBag.getRegularSpot();
                        Ticket ticket = new Ticket(regularParkingSpace,bus);
                        if(buyATicketPane.getParkingSpotBox().getSelectionModel().isSelected(1)){
                            ticket.valetPark();
                        }
                        regularParkingSpace.park();
                        ticketBag.add(ticket);
                        //parkingSpaceBag.display();
                        System.out.println(ticket.toString());
                        ticketConfirmation(String.valueOf(ticket.getTicketID()),String.valueOf(ticket.getParkingSpace().getParkingNumber()));
                    }
                    else if (buyATicketPane.getParkBox().getSelectionModel().isSelected(1) && buyATicketPane.getVehicleBox().getSelectionModel().isSelected(1)){
                        Bus bus = new Bus(buyATicketPane.getLicensePlateField().getText());
                        HandicappedParkingSpace handicappedParkingSpace = parkingSpaceBag.getHandicappedSpot();
                        Ticket ticket = new Ticket(handicappedParkingSpace,bus);
                        if(buyATicketPane.getParkingSpotBox().getSelectionModel().isSelected(1)){
                            ticket.valetPark();
                        }
                        handicappedParkingSpace.park();
                        ticketBag.add(ticket);
                        //parkingSpaceBag.display();
                        System.out.println(ticket.toString());
                        ticketBag.display();
                        ticketConfirmation(String.valueOf(ticket.getTicketID()),String.valueOf(ticket.getParkingSpace().getParkingNumber()));
                    }
                    else if (buyATicketPane.getParkBox().getSelectionModel().isSelected(0) && buyATicketPane.getVehicleBox().getSelectionModel().isSelected(2)){
                        Truck truck = new Truck(buyATicketPane.getLicensePlateField().getText());
                        RegularParkingSpace regularParkingSpace = parkingSpaceBag.getRegularSpot();
                        Ticket ticket = new Ticket(regularParkingSpace,truck);
                        if(buyATicketPane.getParkingSpotBox().getSelectionModel().isSelected(1)){
                            ticket.valetPark();
                        }
                        regularParkingSpace.park();
                        ticketBag.add(ticket);
                        parkingSpaceBag.display();
                        ticketConfirmation(String.valueOf(ticket.getTicketID()),String.valueOf(ticket.getParkingSpace().getParkingNumber()));
                    }
                    else if (buyATicketPane.getParkBox().getSelectionModel().isSelected(1) && buyATicketPane.getVehicleBox().getSelectionModel().isSelected(2)){
                        Truck truck = new Truck(buyATicketPane.getLicensePlateField().getText());
                        HandicappedParkingSpace handicappedParkingSpace = parkingSpaceBag.getHandicappedSpot();
                        Ticket ticket = new Ticket(handicappedParkingSpace,truck);
                        if(buyATicketPane.getParkingSpotBox().getSelectionModel().isSelected(1)){
                            ticket.valetPark();
                        }
                        handicappedParkingSpace.park();
                        ticketBag.add(ticket);
                        parkingSpaceBag.display();
                        ticketConfirmation(String.valueOf(ticket.getTicketID()),String.valueOf(ticket.getParkingSpace().getParkingNumber()));
                    }
                }


            });
            buyATicketPane.getReturnButton().setOnAction(e -> {
                stage.setScene(customerPane.getScene());
            });

        }

    private void alert(String input) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setContentText(input + " is not selected");
        alert.showAndWait();
    }
    private void ticketConfirmation(String id, String parkingSpotNumber){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmation");
        alert.setContentText("Purchase complete. Ticket ID number = " +id +" Parking spot # = "+parkingSpotNumber);
        alert.showAndWait();
    }
}
