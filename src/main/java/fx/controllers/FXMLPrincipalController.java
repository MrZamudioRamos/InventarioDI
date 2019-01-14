package fx.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class FXMLPrincipalController implements Initializable {

    @FXML
    protected BorderPane fxRoot;

    private Stage myStage;

    public void setMyStage(Stage myStage) {
        this.myStage = myStage;
    }

    private AnchorPane pantallaLogin;
    private FXMLLoginController logincontroller;

    //PRECARGA DE PANTALLAS
    @FXML
    public void precargarPantallaLogin() {

        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource(
                            "/fxml/FXMLLogin.fxml"));
            pantallaLogin = loaderMenu.load();
            logincontroller
                    = loaderMenu.getController();
            logincontroller.setPrincipal(this);

        } catch (IOException ex) {

            Logger.getLogger(FXMLPrincipalController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //CARGAR PANTALLAS
    @FXML
    public void cargarPantallaLogin() {
        fxRoot.setCenter(pantallaLogin);

    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        precargarPantallaLogin();

        cargarPantallaLogin();

    }

}
