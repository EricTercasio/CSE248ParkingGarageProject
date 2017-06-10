package controller;

import javafx.scene.control.Alert;
import javafx.stage.Stage;
import model.ParkingSpace;
import model.ParkingSpaceBag;
import model.Ticket;
import model.TicketBag;
import view.CustomerPane;
import view.PaymentPane;

/**
 * Created by Eric on 6/9/2017.
 */
public class PaymentController {

    public PaymentController(PaymentPane paymentPane, CustomerPane customerPane, TicketBag ticketBag,TicketBag paidTicketBag, ParkingSpaceBag parkingSpaceBag, Stage stage){

        paymentPane.getSubmitButton().setOnAction(e->{
            Ticket ticket = ticketBag.findByTicketID(Integer.valueOf(paymentPane.getTicketNumberText().getText()));
            paymentPane.getPaymentAmount().setText("");
            paymentPane.getCardField1().clear();
            paymentPane.getCardField2().clear();
            paymentPane.getCardField3().clear();
            paymentPane.getCardField4().clear();
            paymentPane.getTicketNumberText().setText("");
            paymentPane.getNameOnCardField().clear();
            paymentPane.getSecurityField().clear();
            paymentPane.getMonth().getSelectionModel().clearSelection();
            paymentPane.getYear().getSelectionModel().clearSelection();
            ticketBag.remove(ticket);
            paidTicketBag.add(ticket);
            parkingSpaceBag.add(ticket.getParkingSpace());
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setContentText("Payment Complete. Thank you.");
            alert.showAndWait();
            stage.setScene(customerPane.getScene());
        });
        paymentPane.getReturnButton().setOnAction(e->{
            paymentPane.getPaymentAmount().setText("");
            paymentPane.getCardField1().clear();
            paymentPane.getCardField2().clear();
            paymentPane.getCardField3().clear();
            paymentPane.getCardField4().clear();
            paymentPane.getTicketNumberText().setText("");
            paymentPane.getNameOnCardField().clear();
            paymentPane.getSecurityField().clear();
            paymentPane.getMonth().getSelectionModel().clearSelection();
            paymentPane.getYear().getSelectionModel().clearSelection();
            stage.setScene(customerPane.getScene());
        });
    }
}
