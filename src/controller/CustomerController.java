package controller;

import javafx.scene.control.Alert;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
import view.*;

import java.util.Optional;

/**
 * Created by Eric on 6/9/2017.
 */
public class CustomerController {

    public CustomerController(CustomerPane customerPane, BuyATicketPane buyATicketPane, Pane4Receipt pane4Receipt, PaymentPane paymentPane, LoginPane loginPane, Stage stage){
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

            stage.setScene(paymentPane.getScene());
        });
        customerPane.getViewReceiptButton().setOnAction(e->{
            stage.setScene(pane4Receipt.getScene());
        });





    }
}
