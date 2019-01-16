package fx.controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class FXMLPrincipalController implements Initializable {

    @FXML
    protected BorderPane fxRoot;

    private AnchorPane pantallaLogin;
    private FXMLLoginController logincontroller;
    private AnchorPane pantallaDatos;
    private FXMLDatosController datosController;
    private AnchorPane pantallaOpciones;
    private FXMLMenuOpcionesController opcionesController;
    private AnchorPane pantallaUsuario;
    private FXMLPantallaUsuariosController usuarioController;
    private AnchorPane pantallaMarca;
    private FXMLRegistrarMarcaController marcaController;
    private AnchorPane pantallaRegistroLugar;
    private FXMLRegistroLugarController registroLugarController;
    private AnchorPane pantallaRegistroProducto;
    private FXMLRegistroProductoController registroProductoController;
    private AnchorPane pantallaRegistroUsuario;
    private FXMLRegistroUsuarioController registroUsuarioController;

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
    
    @FXML
    public void precargarPantallaDatos() {

        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource(
                            "/fxml/FXMLDatos.fxml"));
            pantallaDatos = loaderMenu.load();
            datosController
                    = loaderMenu.getController();
        } catch (IOException ex) {

            Logger.getLogger(FXMLDatosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void precargarPantallaOpciones() {

        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource(
                            "/fxml/FXMLMenuOpciones.fxml"));
            pantallaOpciones = loaderMenu.load();
            opcionesController
                    = loaderMenu.getController();

        } catch (IOException ex) {

            Logger.getLogger(FXMLMenuOpcionesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void precargarPantallaUsuario() {

        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource(
                            "/fxml/FXMLPantallaUsuarios.fxml"));
            pantallaUsuario = loaderMenu.load();
            usuarioController
                    = loaderMenu.getController();

        } catch (IOException ex) {

            Logger.getLogger(FXMLPantallaUsuariosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void precargarPantallaMarca() {

        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource(
                            "/fxml/FXMLRegistrarMarca.fxml"));
            pantallaMarca = loaderMenu.load();
            marcaController
                    = loaderMenu.getController();

        } catch (IOException ex) {

            Logger.getLogger(FXMLRegistrarMarcaController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void precargarPantallaLugar() {

        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource(
                            "/fxml/FXMLRegistroLugar.fxml"));
            pantallaRegistroLugar = loaderMenu.load();
            registroLugarController
                    = loaderMenu.getController();

        } catch (IOException ex) {

            Logger.getLogger(FXMLRegistroLugarController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void precargarPantallaProducto() {

        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource(
                            "/fxml/FXMLRegistroProducto.fxml"));
            pantallaRegistroProducto = loaderMenu.load();
            registroProductoController
                    = loaderMenu.getController();

        } catch (IOException ex) {

            Logger.getLogger(FXMLRegistroProductoController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @FXML
    public void precargarPantallaRegistroUsuario() {

        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource(
                            "/fxml/FXMLRegisterUser.fxml"));
            pantallaRegistroUsuario = loaderMenu.load();
            registroUsuarioController
                    = loaderMenu.getController();
        } catch (IOException ex) {
            Logger.getLogger(FXMLRegistroUsuarioController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //CARGAR PANTALLAS
    @FXML
    public void cargarPantallaLogin() {
        fxRoot.setCenter(pantallaLogin);
    }
    
    @FXML
    public void cargarPantallaDatos() {
        fxRoot.setCenter(pantallaDatos);
    }
    
    @FXML
    public void cargarPantallaOpciones() {
        fxRoot.setCenter(pantallaOpciones);
    }
    
    @FXML
    public void cargarPantallaUsuario() {
        fxRoot.setCenter(pantallaUsuario);
    }
    
    @FXML
    public void cargarPantallaMarca() {
        fxRoot.setCenter(pantallaMarca);
    }
    
    @FXML
    public void cargarPantallaLugar() {
        fxRoot.setCenter(pantallaRegistroLugar);
    }
    
    @FXML
    public void cargarPantallaProducto() {
        fxRoot.setCenter(pantallaRegistroProducto);
    }
    
    @FXML
    public void cargarPantallaRegistroUsuario() {
        fxRoot.setCenter(pantallaRegistroUsuario);
    }
    
    public void clickOpciones(){
        cargarPantallaOpciones();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        precargarPantallaLogin();
        precargarPantallaDatos();
        precargarPantallaLugar();
        precargarPantallaMarca();
        precargarPantallaOpciones();
        precargarPantallaProducto();
        precargarPantallaRegistroUsuario();
        precargarPantallaUsuario();
        cargarPantallaLogin();

    }

}
