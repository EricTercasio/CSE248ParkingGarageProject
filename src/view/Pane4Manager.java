package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

/**
 * Created by Eric on 6/9/2017.
 */
public class Pane4Manager {
    private Scene scene;
    private BorderPane pane;
    private HBox buttonsBox;
    private VBox ticketTextBox;
    private VBox ticketBox;
    private VBox spotTextBox;
    private VBox spotsHBox;
    private Button activeTicketsButton;
    private Button emptySpotsButton;
    private ComboBox<String> activeTicketsBox;
    private ObservableList<String> activeTicketsOptions;
    private ComboBox<String> spotsBox;
    private ObservableList<String> emptySpotsOptions;
    private Button backButton;
    //Active tickets text
    private Text ticketNumber;
    private Text licensePlate;
    private Text parkingSpot;
    private Text spotNumber;
    private Text valetParking;
    //Empty Spots text
    private Text parkingSpotType;
    private Text hourlyRate;
    private Text availibility;

    public Pane4Manager() {
        activeTicketsButton = new Button("Active Tickets");
        activeTicketsButton.setPrefSize(100,40);
        emptySpotsButton = new Button("Empty spots");
        emptySpotsButton.setPrefSize(100,40);
        backButton = new Button("Back");
        activeTicketsOptions = FXCollections.observableArrayList();
        emptySpotsOptions = FXCollections.observableArrayList();
        activeTicketsBox = new ComboBox<>(activeTicketsOptions);
        spotsBox = new ComboBox<>(emptySpotsOptions);
        ticketNumber = new Text();
        licensePlate = new Text();
        parkingSpot = new Text();
        spotNumber = new Text();
        valetParking = new Text();
        ticketTextBox = new VBox();
        ticketTextBox.getChildren().addAll(ticketNumber,licensePlate,parkingSpot,spotNumber,valetParking);
        ticketTextBox.setSpacing(15);
        ticketTextBox.setAlignment(Pos.CENTER);
        ticketBox = new VBox();
        ticketBox.getChildren().addAll(activeTicketsBox,ticketTextBox);
        ticketBox.setAlignment(Pos.CENTER);
        ticketBox.setSpacing(70);
        parkingSpotType = new Text();
        hourlyRate = new Text();
        availibility = new Text();
        spotTextBox = new VBox();
        spotTextBox.getChildren().addAll(parkingSpotType,hourlyRate,availibility);
        spotTextBox.setAlignment(Pos.CENTER);
        spotsHBox = new VBox();
        spotsHBox.setSpacing(70);
        spotsHBox.getChildren().addAll(spotsBox,spotTextBox);
        spotsHBox.setAlignment(Pos.CENTER);
        pane = new BorderPane();
        buttonsBox = new HBox(activeTicketsButton,emptySpotsButton);
        buttonsBox.setAlignment(Pos.CENTER);
        buttonsBox.setSpacing(40);
        buttonsBox.setPadding(new Insets(20));
        pane.setAlignment(backButton,Pos.CENTER);
        pane.setTop(buttonsBox);
        pane.setBottom(backButton);
        scene = new Scene(pane,600,600);



    }

    public BorderPane getPane() {
        return pane;
    }

    public HBox getButtonsBox() {
        return buttonsBox;
    }

    public VBox getTicketTextBox() {
        return ticketTextBox;
    }

    public VBox getTicketBox() {
        return ticketBox;
    }

    public VBox getSpotTextBox() {
        return spotTextBox;
    }

    public VBox getSpotsHBox() {
        return spotsHBox;
    }

    public Button getActiveTicketsButton() {
        return activeTicketsButton;
    }

    public Button getEmptySpotsButton() {
        return emptySpotsButton;
    }

    public ComboBox<String> getActiveTicketsBox() {
        return activeTicketsBox;
    }

    public ObservableList<String> getActiveTicketsOptions() {
        return activeTicketsOptions;
    }

    public ComboBox<String> getSpotsBox() {
        return spotsBox;
    }

    public ObservableList<String> getEmptySpotsOptions() {
        return emptySpotsOptions;
    }

    public Button getBackButton() {
        return backButton;
    }

    public Text getTicketNumber() {
        return ticketNumber;
    }

    public Text getLicensePlate() {
        return licensePlate;
    }

    public Text getParkingSpot() {
        return parkingSpot;
    }

    public Text getValetParking() {
        return valetParking;
    }

    public Text getParkingSpotType() {
        return parkingSpotType;
    }

    public Text getHourlyRate() {
        return hourlyRate;
    }

    public Text getAvailibility() {
        return availibility;
    }
    public Text getSpotNumber(){
        return spotNumber;
    }

    public Scene getScene(){
        return scene;
    }
}
