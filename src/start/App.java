package start;

import javafx.application.Application;
import javafx.stage.Stage;
import view.LoginPane;

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
        LoginPane loginPane = new LoginPane();
        primaryStage.setScene(loginPane.getScene());
        primaryStage.show();
    }
}
