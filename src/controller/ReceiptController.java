package controller;

import javafx.stage.Stage;
import view.CustomerPane;
import view.Pane4Receipt;

/**
 * Created by Eric on 6/9/2017.
 */
public class ReceiptController {
    public ReceiptController(CustomerPane customerPane, Pane4Receipt pane4Receipt, Stage stage){
        pane4Receipt.getBackButton().setOnAction(e->{
            pane4Receipt.getParkingSpotText().setText("");
            pane4Receipt.getTotalText().setText("");
            pane4Receipt.getTotalText().setText("");
            pane4Receipt.getCarText().setText("");
            stage.setScene(customerPane.getScene());
        });
    }
}
