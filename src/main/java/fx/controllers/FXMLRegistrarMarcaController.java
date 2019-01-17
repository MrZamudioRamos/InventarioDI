package fx.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FXMLRegistrarMarcaController implements Initializable {
    
    private FXMLPrincipalController principal;
    
    public void setPrincipal(FXMLPrincipalController principal) {
        this.principal = principal;
    }
    @FXML
    private TextField fxNombre;
    @FXML
    private TextField fxDescripcion;
    @FXML
    private Button fxCrear;
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void clickCrear(){
        
    }

    
}
