package fx.main;

import fx.controllers.FXMLLoginController;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author dam2
 */
public class FxMainInventario extends Application {

    @Override
    public void start(Stage primaryStage)
            throws IOException {

        FXMLLoader loaderMenu = new FXMLLoader(
                getClass().getResource("/fxml/FXMLLogin.fxml"));
        AnchorPane root = loaderMenu.load();

        FXMLLoginController inicio = loaderMenu.getController();

        inicio.setMyStage(primaryStage);
        Scene scene = new Scene(root);

        //primaryStage.getIcons().add(new Image("/images/icon.png"));
        primaryStage.setTitle("Inventariador");
        primaryStage.setScene(scene);
        primaryStage.show();

        //para no poder maximizar pantalla y
        primaryStage.setResizable(false);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
