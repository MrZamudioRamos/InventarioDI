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
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import model.Marca;
import model.TipoEstado;
import model.Ubicacion;
import model.User;

/**
 * FXML Controller class
 *
 * @author dam2
 */
public class FXMLRegistroProductoController implements Initializable {

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
    private TextField fxCategoria;
    
    @FXML
    private TextField fxMarca;
    
    @FXML
    private TextField fxModelo;
    
    @FXML
    private TextField fxDescripcion;
    
    @FXML
    private ComboBox<Marca> marcas;
    
    @FXML
    private ComboBox<Ubicacion> ubicacioness;
    
    @FXML
    private ComboBox<User> responsables;
    
    @FXML
    private ComboBox<TipoEstado> estados;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    public void clickGuardar(){
        
    }
    
    public void volver(){
        principal.cargarPantallaOpciones();
    }

}
