package fx.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

public class FXMLRegistroUsuarioController implements Initializable {
    
    
    @FXML
    private TextField fxNombre;
    @FXML
    private TextField fxApellidos;
    @FXML
    private TextField fxTelefono;
    @FXML
    private TextField fxUbicacion;
    @FXML
    private TextField fxMail;
    @FXML
    private PasswordField fxContrasenia;
    @FXML
    private TextField fxDni;
    @FXML
    private RadioButton fxAdministrador;
    @FXML
    private RadioButton fxUsuarioNormal;
    @FXML
    private RadioButton fxInventariador;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

}
