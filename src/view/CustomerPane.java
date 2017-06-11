package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * Created by Eric on 6/9/2017.
 */
public class CustomerPane {
    private HBox buttonBox;
    private VBox pane;
    private Scene scene;
    private Button buyATicketButton;
    private Button payATicketButton;
    private Button viewReceiptButton;
    private Button backButton;

    public CustomerPane(){
        buttonBox = new HBox();
        pane = new VBox();
        buyATicketButton = new Button("Buy a ticket");
        buyATicketButton.setPrefSize(120,120);
        payATicketButton = new Button("Pay a ticket");
        payATicketButton.setPrefSize(120,120);
        viewReceiptButton = new Button("Past Receipts");
        viewReceiptButton.setPrefSize(120,120);
        backButton = new Button("Back");
        buttonBox.getChildren().addAll(buyATicketButton,payATicketButton,viewReceiptButton);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setSpacing(30);
        pane.getChildren().addAll(buttonBox,backButton);
        pane.setAlignment(Pos.CENTER);
        pane.setSpacing(50);
        scene = new Scene(pane,600,600);


    }
    public Scene getScene(){
        return scene;
    }

    public HBox getButtonBox() {
        return buttonBox;
    }

    public VBox getPane() {
        return pane;
    }

    public Button getBuyATicketButton() {
        return buyATicketButton;
    }

    public Button getPayATicketButton() {
        return payATicketButton;
    }

    public Button getViewReceiptButton() {
        return viewReceiptButton;
    }

    public Button getBackButton() {
        return backButton;
    }
}
