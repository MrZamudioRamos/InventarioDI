package fx.controllers;

import dao.implementaciones.DAOMarcaImpl;
import dao.implementaciones.DAOProductoImpl;
import dao.implementaciones.DAOTipoEstadoImpl;
import dao.implementaciones.DAOTipoUsuarioImpl;
import dao.implementaciones.DAOUbicacionImpl;
import dao.implementaciones.DAOUsuariosImpl;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import model.Marca;
import model.Producto;
import model.TipoUsuario;
import model.Ubicacion;
import model.User;

public class FXMLPrincipalController implements Initializable {

    @FXML
    protected BorderPane fxRoot;

    @FXML
    private MenuBar fxMenu;

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
    private AnchorPane pantallaModificarDatos;
    private FXMLModificarDatosController modificarDatosController;
    private AnchorPane pantallaModificarUser;
    private FXMLModificarUserController modificarUserController;

    private ObservableList<Marca> marcas;
    private ObservableList<Producto> productos;
    private ObservableList<TipoUsuario> tipos;
    private ObservableList<Ubicacion> ubicaciones;
    private ObservableList<User> users;

    DAOMarcaImpl dm = new DAOMarcaImpl();
    DAOProductoImpl dp = new DAOProductoImpl();
    DAOTipoEstadoImpl de = new DAOTipoEstadoImpl();
    DAOTipoUsuarioImpl dt = new DAOTipoUsuarioImpl();
    DAOUbicacionImpl du = new DAOUbicacionImpl();
    DAOUsuariosImpl dus = new DAOUsuariosImpl();

    public ObservableList<Marca> getMarcas() {
        return marcas = FXCollections.observableArrayList(dm.getAll());
    }

    public void setMarcas(ObservableList<Marca> marcas) {
        this.marcas = marcas;
    }

    public ObservableList<Producto> getProductos() {
        return productos = FXCollections.observableArrayList(dp.getAll());
    }

    public void setProductos(ObservableList<Producto> productos) {
        this.productos = productos;
    }

    public ObservableList<TipoUsuario> getTipos() {
        return tipos = FXCollections.observableArrayList(dt.getAll());
    }

    public void setTipos(ObservableList<TipoUsuario> tipos) {
        this.tipos = tipos;
    }

    public ObservableList<Ubicacion> getUbicaciones() {
        return ubicaciones = FXCollections.observableArrayList(du.getAll());
    }

    public void setUbicaciones(ObservableList<Ubicacion> ubicaciones) {
        this.ubicaciones = ubicaciones;
    }

    public ObservableList<User> getUsers() {
        return users = FXCollections.observableArrayList(dus.getAll());
    }

    public void setUsers(ObservableList<User> users) {
        this.users = users;
    }

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
            datosController.setPrincipal(this);
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
            opcionesController.setPrincipal(this);

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
            usuarioController.setPrincipal(this);

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
            marcaController.setPrincipal(this);

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
            registroLugarController.setPrincipal(this);

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
            registroProductoController.setPrincipal(this);

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
            registroUsuarioController.setPrincipal(this);
        } catch (IOException ex) {
            Logger.getLogger(FXMLRegistroUsuarioController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    public void precargarPantallaModificarDatos() {

        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource(
                            "/fxml/FXMLModificarDatos.fxml"));
            pantallaModificarDatos = loaderMenu.load();
            modificarDatosController
                    = loaderMenu.getController();
            modificarDatosController.setPrincipal(this);
        } catch (IOException ex) {
            Logger.getLogger(FXMLModificarDatosController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @FXML
    public void precargarPantallaModificarUser() {

        try {
            FXMLLoader loaderMenu = new FXMLLoader(
                    getClass().getResource(
                            "/fxml/FXMLModificarUser.fxml"));
            pantallaModificarUser = loaderMenu.load();
            modificarUserController
                    = loaderMenu.getController();
            modificarUserController.setPrincipal(this);
        } catch (IOException ex) {
            Logger.getLogger(FXMLModificarUserController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    //CARGAR PANTALLAS
    @FXML
    public void cargarPantallaLogin() {
        fxRoot.setCenter(pantallaLogin);
        fxMenu.setVisible(false);
    }

    @FXML
    public void cargarPantallaDatos() {
        fxRoot.setCenter(pantallaDatos);
        fxMenu.setVisible(true);
    }

    @FXML
    public void cargarPantallaOpciones() {
        fxRoot.setCenter(pantallaOpciones);
        fxMenu.setVisible(true);
    }

    @FXML
    public void cargarPantallaUsuario() {
        fxRoot.setCenter(pantallaUsuario);
        fxMenu.setVisible(true);
    }

    @FXML
    public void cargarPantallaMarca() {
        fxRoot.setCenter(pantallaMarca);
        fxMenu.setVisible(true);
    }

    @FXML
    public void cargarPantallaLugar() {
        fxRoot.setCenter(pantallaRegistroLugar);
        fxMenu.setVisible(true);
    }

    @FXML
    public void cargarPantallaProducto() {
        fxRoot.setCenter(pantallaRegistroProducto);
        fxMenu.setVisible(true);
    }

    @FXML
    public void cargarPantallaRegistroUsuario() {
        fxRoot.setCenter(pantallaRegistroUsuario);
        fxMenu.setVisible(true);
    }

    @FXML
    public void cargarPantallaModificarDatos() {
        fxRoot.setCenter(pantallaModificarDatos);
        fxMenu.setVisible(true);
    }

    @FXML
    public void cargarPantallaModificarUser() {
        fxRoot.setCenter(pantallaModificarUser);
        fxMenu.setVisible(true);
    }

    public void clickOpciones() {
        cargarPantallaOpciones();
        fxMenu.setVisible(true);
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
        precargarPantallaModificarDatos();
        precargarPantallaModificarUser();
        cargarPantallaLogin();

    }

}
