/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
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
    
    public void clickEntrar(){
        
    }

    private Stage myStage;
    
    private FXMLPrincipalController principal;
    
    public void setPrincipal(FXMLPrincipalController principal) {
        this.principal = principal;
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
