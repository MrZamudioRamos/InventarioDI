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
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author carlu
 */
public class FXMLLoginController implements Initializable {
    
    public void setMyStage(Stage myStage) {
        this.myStage = myStage;
    }

    private Stage myStage;
    
    private FXMLPrincipalController principal;
    
    public void setPrincipal(FXMLPrincipalController principal) {
        this.principal = principal;
    }
    
    //MÉTODOS
    
        
    //variables Login
    private TextField fxUsuario;
    private PasswordField fxContrasenia;

  
    public void clickEntrar() {
        principal.cargarPantallaOpciones();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    public void check(){
        
    }

}
