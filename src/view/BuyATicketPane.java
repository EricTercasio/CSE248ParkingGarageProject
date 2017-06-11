package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;


/**
 * Created by Eric on 6/9/2017.
 */
public class BuyATicketPane {
    private Scene scene;
    private VBox pane;
    private HBox vehicleHBox;
    private HBox carHBox;
    private HBox parkingHBox;
    private HBox movementHBox;
    private HBox buttonBox;
    private HBox licensePlateBox;
    private Text buyATicket;
    private Text vehicleText;
    private Text carText;
    private Text parkingSpotText;
    private Text typeOfMovement;
    private Text licensePlateText;
    private ComboBox vehicleBox;
    private ComboBox carBox;
    private ComboBox parkBox;
    private ComboBox parkingSpotBox;
    private ComboBox movementBox;
    private TextField licensePlateField;
    private Button returnButton;
    private Button buyTicketButton;
    private ObservableList<String> movementOptions;

    public BuyATicketPane(){
        buyATicket = new Text("Buy a ticket");
        buyATicket.setFont(Font.font(30));
        vehicleText = new Text("Type of vehicle");
        carText = new Text("Type of car");
        typeOfMovement = new Text("How would you like to be parked?");
        parkingSpotText = new Text("Regular or handicapped spot?");
        licensePlateText = new Text("License Plate Number");
        licensePlateField = new TextField();
        ObservableList<String> vehicleOptions =
                FXCollections.observableArrayList(
                        "Car","Bus","Truck"
                );
        vehicleBox = new ComboBox(vehicleOptions);
        ObservableList<String> carOptions =
                FXCollections.observableArrayList(
                        "Audi","Mercedes","Other"
                );
        carBox = new ComboBox(carOptions);

        ObservableList<String> parkingSpotOptions =
                FXCollections.observableArrayList(
                        "Regular (10/hr)","Handicapped (5/hr)"
                );
        parkBox = new ComboBox(parkingSpotOptions);

        movementOptions =
                FXCollections.observableArrayList(
                        "Regular park","Valet (+$5)"
                );
        parkingSpotBox = new ComboBox(movementOptions);

        returnButton = new Button("Back");
        buyTicketButton = new Button("Purchase");
        vehicleHBox = new HBox();
        vehicleHBox.setAlignment(Pos.CENTER);
        vehicleHBox.setSpacing(10);
        vehicleHBox.getChildren().addAll(vehicleText,vehicleBox);
        carHBox = new HBox();
        carHBox.setAlignment(Pos.CENTER);
        carHBox.getChildren().addAll(carText,carBox);
        carHBox.setSpacing(10);
        parkingHBox = new HBox();
        parkingHBox.setAlignment(Pos.CENTER);
        parkingHBox.getChildren().addAll(parkingSpotText,parkBox);
        parkingHBox.setSpacing(10);
        movementHBox = new HBox();
        movementHBox.setAlignment(Pos.CENTER);
        movementHBox.getChildren().addAll(typeOfMovement,parkingSpotBox);
        movementHBox.setSpacing(10);
        licensePlateBox = new HBox();
        licensePlateBox.getChildren().addAll(licensePlateText,licensePlateField);
        licensePlateBox.setAlignment(Pos.CENTER);
        licensePlateBox.setSpacing(10);
        buttonBox = new HBox();
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setSpacing(40);
        buttonBox.getChildren().addAll(returnButton,buyTicketButton);
        pane = new VBox();
        pane.setSpacing(15);
        pane.setAlignment(Pos.CENTER);
        pane.getChildren().addAll(buyATicket,vehicleHBox,parkingHBox,movementHBox,licensePlateBox,buttonBox);
        scene = new Scene(pane,600,600);


    }
    public Scene getScene(){
        return scene;
    }
    public ComboBox getParkingSpotBox(){
        return parkingSpotBox;
    }

    public ComboBox getMovementBox() {
        return movementBox;
    }

    public TextField getLicensePlateField() {
        return licensePlateField;
    }

    public Button getReturnButton() {
        return returnButton;
    }

    public Button getBuyTicketButton() {
        return buyTicketButton;
    }

    public VBox getPane() {
        return pane;
    }

    public HBox getVehicleHBox() {
        return vehicleHBox;
    }

    public HBox getCarHBox() {
        return carHBox;
    }

    public HBox getParkingHBox() {
        return parkingHBox;
    }

    public HBox getMovementHBox() {
        return movementHBox;
    }

    public HBox getButtonBox() {
        return buttonBox;
    }

    public HBox getLicensePlateBox() {
        return licensePlateBox;
    }

    public Text getBuyATicket() {
        return buyATicket;
    }

    public Text getVehicleText() {
        return vehicleText;
    }

    public Text getCarText() {
        return carText;
    }

    public Text getParkingSpotText() {
        return parkingSpotText;
    }

    public Text getTypeOfMovement() {
        return typeOfMovement;
    }

    public Text getLicensePlateText() {
        return licensePlateText;
    }

    public ComboBox getVehicleBox() {
        return vehicleBox;
    }

    public ComboBox getCarBox() {
        return carBox;
    }

    public ComboBox getParkBox() {
        return parkBox;
    }

    public ObservableList<String> getMovementOptions() {
        return movementOptions;
    }
}
