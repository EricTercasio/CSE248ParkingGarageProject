package controller;

import javafx.stage.Stage;
import model.TicketBag;
import view.CustomerPane;
import view.LoginPane;
import view.Pane4Manager;

/**
 * Created by Eric on 6/9/2017.
 */
public class LoginController {

    public LoginController(LoginPane loginPane, CustomerPane customerPane, Pane4Manager pane4Manager, Stage stage){
        loginPane.getCustomerButton().setOnAction(e->{
            stage.setScene(customerPane.getScene());
        });
        loginPane.getManagerButton().setOnAction(e->{
            stage.setScene(pane4Manager.getScene());
        });
    }
}
