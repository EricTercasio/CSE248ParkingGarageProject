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
            }else if(buyATicketPane.getCarBox().getSelectionModel().isSelected(2) || buyATicketPane.getMovementOptions().get(2) != null){
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
                    if (buyATicketPane.getParkingSpotBox().getSelectionModel().isSelected(0) && buyATicketPane.getVehicleBox().getSelectionModel().isSelected(0) && buyATicketPane.getCarBox().getSelectionModel().isSelected(0)){
                        Audi audi = new Audi(buyATicketPane.getLicensePlateField().getText());
                        RegularParkingSpace regularParkingSpace = parkingSpaceBag.getRegularSpot();
                        Ticket ticket = new Ticket(regularParkingSpace,audi);
                        //if(buyATicketPane.getMovementBox().getSelectionModel().isSelected(1)){
                                  //  ticket.valetPark();
                               // }
                        System.out.println(ticket.toString());
                        parkingSpaceBag.display();
                            }
                    if (buyATicketPane.getParkingSpotBox().getSelectionModel().isSelected(0) && buyATicketPane.getVehicleBox().getSelectionModel().isSelected(0) && buyATicketPane.getCarBox().getSelectionModel().isSelected(1)){
                        Mercedes mercedes = new Mercedes(buyATicketPane.getLicensePlateField().getText());
                        RegularParkingSpace regularParkingSpace = parkingSpaceBag.getRegularSpot();
                        Ticket ticket = new Ticket(regularParkingSpace,mercedes);
                        if(buyATicketPane.getMovementBox().getSelectionModel().isSelected(1)){
                            ticket.valetPark();
                        }
                        System.out.println(ticket.toString());
                      }
                    if (buyATicketPane.getParkingSpotBox().getSelectionModel().isSelected(0) && buyATicketPane.getVehicleBox().getSelectionModel().isSelected(0) && buyATicketPane.getCarBox().getSelectionModel().isSelected(2)){
                        Car car = new Car(buyATicketPane.getLicensePlateField().getText());
                        RegularParkingSpace regularParkingSpace = parkingSpaceBag.getRegularSpot();
                        Ticket ticket = new Ticket(regularParkingSpace,car);
                        if(buyATicketPane.getMovementBox().getSelectionModel().isSelected(1)){
                            ticket.valetPark();
                        }
                        System.out.println(ticket.toString());
                    }
                    if (buyATicketPane.getParkingSpotBox().getSelectionModel().isSelected(1) && buyATicketPane.getVehicleBox().getSelectionModel().isSelected(0) && buyATicketPane.getCarBox().getSelectionModel().isSelected(0)){
                        Audi audi = new Audi(buyATicketPane.getLicensePlateField().getText());
                        HandicappedParkingSpace handicappedParkingSpace = new HandicappedParkingSpace();
                        Ticket ticket = new Ticket(handicappedParkingSpace,audi);
                        if(buyATicketPane.getMovementBox().getSelectionModel().isSelected(1)){
                            ticket.valetPark();
                        }
                        System.out.println(ticket.toString());
                    }
                    if (buyATicketPane.getParkingSpotBox().getSelectionModel().isSelected(1) && buyATicketPane.getVehicleBox().getSelectionModel().isSelected(0) && buyATicketPane.getCarBox().getSelectionModel().isSelected(1)){
                        Mercedes mercedes = new Mercedes(buyATicketPane.getLicensePlateField().getText());
                        HandicappedParkingSpace handicappedParkingSpace = new HandicappedParkingSpace();
                        Ticket ticket = new Ticket(handicappedParkingSpace,mercedes);
                        if(buyATicketPane.getMovementBox().getSelectionModel().isSelected(1)){
                            ticket.valetPark();
                        }
                        System.out.println(ticket.toString());
                    }
                    if (buyATicketPane.getParkingSpotBox().getSelectionModel().isSelected(1) && buyATicketPane.getVehicleBox().getSelectionModel().isSelected(0) && buyATicketPane.getCarBox().getSelectionModel().isSelected(2)){
                        Car car = new Car(buyATicketPane.getLicensePlateField().getText());
                        HandicappedParkingSpace handicappedParkingSpace = new HandicappedParkingSpace();
                        Ticket ticket = new Ticket(handicappedParkingSpace,car);
                        if(buyATicketPane.getMovementBox().getSelectionModel().isSelected(1)){
                            ticket.valetPark();
                        }
                        System.out.println(ticket.toString());
                    }
                    if (buyATicketPane.getParkingSpotBox().getSelectionModel().isSelected(0) && buyATicketPane.getVehicleBox().getSelectionModel().isSelected(1)){
                        Bus bus = new Bus(buyATicketPane.getLicensePlateField().getText());
                        RegularParkingSpace regularParkingSpace = new RegularParkingSpace();
                        Ticket ticket = new Ticket(regularParkingSpace,bus);
                        if(buyATicketPane.getMovementBox().getSelectionModel().isSelected(1)){
                            ticket.valetPark();
                        }
                        System.out.println(ticket.toString());
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
}
