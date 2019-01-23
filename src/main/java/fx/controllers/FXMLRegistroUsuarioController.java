package fx.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author dam2
 */

public class FXMLRegistroUsuarioController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    private FXMLPrincipalController principal;
    
    public void setPrincipal(FXMLPrincipalController principal) {
        this.principal = principal;
    }
    
    @FXML
    private TextField fxNombre;
    
    @FXML
    private TextField fxDescripcion;
    
    @FXML
    private TextField fxModelo;
    
    @FXML
    private TextField fxCategoria;
    
    @FXML
    private TextField fxUbicacion;
    
    @FXML
    private ComboBox fxMarca;
    
    @FXML
    private ComboBox fxResponsable;
    
    @FXML
    private DatePicker fxFechaEntrada;
    
    @FXML
    private DatePicker fxFechaSalida;
    
    @FXML
    private RadioButton fxAlmacenado;
    
    @FXML
    private RadioButton fxVendido;
    
    @FXML
    private RadioButton fxDonado;
    
    @FXML
    private RadioButton fxModificado;

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }   
    
    public void volver(){
        principal.cargarPantallaOpciones();
    }

}
