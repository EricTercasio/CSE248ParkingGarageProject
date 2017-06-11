package view;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
    private HBox ticketBox;
    private VBox spotTextBox;
    private HBox spotsHBox;
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
    private Text valetParking;
    //Empty Spots text
    private Text parkingSpotType;
    private Text hourlyRate;
    private Text availibility;

    public Pane4Manager() {
        activeTicketsButton = new Button("Active Tickets");
        emptySpotsButton = new Button("Empty spots");
        backButton = new Button("Back");
        activeTicketsOptions = FXCollections.observableArrayList();
        emptySpotsOptions = FXCollections.observableArrayList();
        activeTicketsBox = new ComboBox<>(activeTicketsOptions);
        spotsBox = new ComboBox<>(emptySpotsOptions);
        ticketNumber = new Text();
        licensePlate = new Text();
        parkingSpot = new Text();
        valetParking = new Text();
        ticketTextBox = new VBox();
        ticketTextBox.getChildren().addAll(ticketNumber,licensePlate,parkingSpot,valetParking);
        ticketTextBox.setSpacing(15);
        ticketBox = new HBox();
        ticketBox.getChildren().addAll(activeTicketsBox,ticketTextBox);
        ticketBox.setAlignment(Pos.CENTER);
        parkingSpotType = new Text();
        hourlyRate = new Text();
        availibility = new Text();
        spotTextBox = new VBox();
        spotTextBox.getChildren().addAll(parkingSpotType,hourlyRate,availibility);
        spotsHBox = new HBox();
        spotsHBox.getChildren().addAll(spotsBox,spotTextBox);
        pane = new BorderPane();
        buttonsBox = new HBox(activeTicketsButton,emptySpotsButton);
        buttonsBox.setAlignment(Pos.CENTER);
        pane.setTop(buttonsBox);
        pane.setCenter(ticketBox);
        pane.setBottom(backButton);
        scene = new Scene(pane,600,600);



    }
    public Scene getScene(){
        return scene;
    }
}
