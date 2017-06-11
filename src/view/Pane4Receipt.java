package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 * Created by Eric on 6/9/2017.
 */
public class Pane4Receipt {
    private VBox pane;
    private Scene scene;
    private Text receiptText;
    private Text carText;
    private Text licenseText;
    private Text parkingSpotText;
    private Text totalText;
    private Text valetParking;
    private Button backButton;

    public Pane4Receipt(){
        receiptText = new Text("Receipt");
        receiptText.setFont(Font.font(30));
        carText = new Text("Car Type : ");
        licenseText = new Text("License Plate Number : ");
        parkingSpotText = new Text("Parking Spot Number : ");
        totalText = new Text("Total : ");
        backButton = new Button("Return");
        valetParking = new Text();
        pane = new VBox();
        pane.getChildren().addAll(receiptText,carText,licenseText,parkingSpotText,valetParking,totalText,backButton);
        pane.setAlignment(Pos.CENTER);
        pane.setSpacing(15);
        scene = new Scene(pane,600,600);
    }

    public VBox getPane() {
        return pane;
    }

    public void setPane(VBox pane) {
        this.pane = pane;
    }

    public Scene getScene() {
        return scene;
    }

    public void setScene(Scene scene) {
        this.scene = scene;
    }

    public Text getReceiptText() {
        return receiptText;
    }

    public void setReceiptText(Text receiptText) {
        this.receiptText = receiptText;
    }

    public Text getCarText() {
        return carText;
    }

    public void setCarText(Text carText) {
        this.carText = carText;
    }

    public Text getLicenseText() {
        return licenseText;
    }

    public void setLicenseText(Text licenseText) {
        this.licenseText = licenseText;
    }

    public Text getParkingSpotText() {
        return parkingSpotText;
    }

    public void setParkingSpotText(Text parkingSpotText) {
        this.parkingSpotText = parkingSpotText;
    }

    public Text getTotalText() {
        return totalText;
    }

    public void setTotalText(Text totalText) {
        this.totalText = totalText;
    }

    public Button getBackButton() {
        return backButton;
    }

    public void setBackButton(Button backButton) {
        this.backButton = backButton;
    }

    public Text getValetParking(){
        return valetParking;
    }
}
