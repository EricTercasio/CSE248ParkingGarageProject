package view;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

/**
 * Created by Eric on 6/8/2017.
 */
public class LoginPane {
    private Scene scene;
    private HBox buttonBox;
    private VBox pane;
    private Text welcomeText;
    private Text selectionText;
    private Text orText;
    private Button customerButton;
    private Button managerButton;

    public LoginPane() {
        welcomeText = new Text("Welcome");
        welcomeText.setFont(Font.font(30));
        selectionText = new Text("Are you a ");
        selectionText.setFont(Font.font(20));
        orText = new Text("or");
        orText.setFont(Font.font(20));
        customerButton = new Button("Customer");
        managerButton = new Button("Manager");
        buttonBox = new HBox();
        buttonBox.getChildren().addAll(customerButton,orText,managerButton);
        buttonBox.setAlignment(Pos.CENTER);
        buttonBox.setSpacing(30);
        pane = new VBox();
        pane.getChildren().addAll(welcomeText,selectionText,buttonBox);
        pane.setAlignment(Pos.CENTER);
        pane.setSpacing(40);
        scene = new Scene(pane,600,600);


    }
    public Scene getScene(){
        return scene;
    }

    public Button getCustomerButton() {
        return customerButton;
    }

    public Button getManagerButton() {
        return managerButton;
    }
}
