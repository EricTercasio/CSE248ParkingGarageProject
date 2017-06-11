package start;

import controller.*;
import javafx.application.Application;
import javafx.stage.Stage;
import model.HandicappedParkingSpace;
import model.ParkingSpaceBag;
import model.RegularParkingSpace;
import model.TicketBag;
import view.*;

import static javafx.application.Application.launch;

/**
 * Created by Eric on 6/8/2017.
 */
    public class App extends Application {
        public static void main(String[] args) {
            launch(args);
        }

    @Override
    public void start(Stage primaryStage) throws Exception {
        TicketBag ticketBag = new TicketBag();
        TicketBag paidTicketBag = new TicketBag();
        ParkingSpaceBag parkingSpaceBag = new ParkingSpaceBag();
        for(int i = 0; i < 18; i++){
            parkingSpaceBag.add(new RegularParkingSpace());
        }
        parkingSpaceBag.add(new HandicappedParkingSpace());
        parkingSpaceBag.add(new HandicappedParkingSpace());
        System.out.println(parkingSpaceBag.findByParkingNumber(20));
        parkingSpaceBag.display();
        LoginPane loginPane = new LoginPane();
        CustomerPane customerPane = new CustomerPane();
        PaymentPane paymentPane = new PaymentPane();
        BuyATicketPane buyATicketPane = new BuyATicketPane();
        Pane4Receipt pane4Receipt = new Pane4Receipt();
        Pane4Manager pane4Manager = new Pane4Manager();
        LoginController loginController = new LoginController(loginPane,customerPane,pane4Manager,primaryStage);
        CustomerController customerController = new CustomerController(customerPane,buyATicketPane,pane4Receipt,paymentPane,loginPane,ticketBag,paidTicketBag,primaryStage);
        BuyATicketController buyATicketController = new BuyATicketController(customerPane,buyATicketPane,ticketBag,parkingSpaceBag,primaryStage);
        PaymentController paymentController = new PaymentController(paymentPane,customerPane,ticketBag,paidTicketBag,parkingSpaceBag,primaryStage);
        ReceiptController receiptController = new ReceiptController(customerPane,pane4Receipt,primaryStage);
        ManagerController managerController = new ManagerController(pane4Manager,loginPane,ticketBag,parkingSpaceBag,primaryStage);
        primaryStage.setScene(loginPane.getScene());
        primaryStage.show();
    }
}
