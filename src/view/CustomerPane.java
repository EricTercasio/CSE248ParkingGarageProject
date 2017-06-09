package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;

/**
 * Created by Eric on 6/9/2017.
 */
public class CustomerPane {
    private HBox buttonBox;
    private GridPane pane;
    private Scene scene;
    private Button buyATicketButton;
    private Button payATicketButton;
    private Button viewReceiptButton;
    private Button backButton;

    public CustomerPane(){
        buttonBox = new HBox();
        pane = new GridPane();
        buyATicketButton = new Button("Buy a ticket");
        buyATicketButton.setPrefSize(120,120);
        payATicketButton = new Button("Pay a ticket");
        payATicketButton.setPrefSize(120,120);
        viewReceiptButton = new Button("View past receipts");
        viewReceiptButton.setPrefSize(120,120);
        backButton = new Button("Back");
        buttonBox.getChildren().addAll(buyATicketButton,payATicketButton,viewReceiptButton);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setSpacing(30);
        pane.add(buttonBox,1,2);
        pane.add(backButton,0,3);
        pane.setAlignment(Pos.CENTER);
        pane.setVgap(90);
        scene = new Scene(pane,600,600);


    }
    public Scene getScene(){
        return scene;
    }

    public HBox getButtonBox() {
        return buttonBox;
    }

    public GridPane getPane() {
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
