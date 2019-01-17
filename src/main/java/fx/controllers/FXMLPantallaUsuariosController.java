package fx.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class FXMLPantallaUsuariosController implements Initializable {

    @FXML
    private Button fxRefresh;
    @FXML
    private Button fxDelete;
    @FXML
    private Button fxBack;
    
    private FXMLPrincipalController principal;
    
    public void setPrincipal(FXMLPrincipalController principal) {
        this.principal = principal;
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

}
