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
import javafx.stage.Stage;
import javafx.scene.control.Button;
public class FXMLMenuOpcionesController implements Initializable {
    
    public void setMyStage(Stage myStage) {
        this.myStage = myStage;
    }

    private Stage myStage;
    
    private FXMLPrincipalController principal;

    public void setPrincipal(FXMLPrincipalController principal) {
        this.principal = principal;
    }
    
    public void modificarProduct(){
        principal.cargarPantallaProducto();
    }

    public void listarProduct() {
        principal.cargarPantallaDatos();
    }
    
    public void registrarProduct() {
        principal.cargarPantallaProducto();
    }
    
    public void modificarUser(){
        principal.cargarPantallaRegistroUsuario();
    }

    public void listarUser() {
        principal.cargarPantallaUsuario();
    }
    
    public void registrarUser() {
        principal.cargarPantallaRegistroUsuario();
    }
    
    public void modificarLugar(){
        principal.cargarPantallaLugar();
    }

    public void listarLugar() {
        principal.cargarPantallaDatos();
    }
    
    public void registrarLugar() {
        principal.cargarPantallaLugar();
    }
    
    public void salir() {
        principal.cargarPantallaLogin();
    }
    
    public void cerrarSesion() {
        principal.cargarPantallaLogin();
    }
  
    @FXML
    private Button fxListUser;
    @FXML
    private Button fxAddUser;
    @FXML
    private Button fxEditUser;
    @FXML
    private Button fxListProducts;
    @FXML
    private Button fxAddProducts;
    @FXML
    private Button fxEditProducts;
    @FXML
    private Button fxListPlace;
    @FXML
    private Button fxAddPlace;
    @FXML
    private Button fxEditPlace;
    @FXML
    private Button fxCloseSession;
    @FXML
    private Button fxExit;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

}
