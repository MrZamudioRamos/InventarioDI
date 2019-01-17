/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author dam2
 */
public class FXMLRegistroLugarController implements Initializable {

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
    private TextField fxUbicacion;
    
    @FXML
    private DatePicker fxFecha;
    
    @FXML
    private RadioButton fxAlmacenado;
    
    @FXML
    private RadioButton fxModificado;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    
}
