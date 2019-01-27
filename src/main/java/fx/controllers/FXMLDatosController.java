/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx.controllers;

import dao.implementaciones.DAOMarcaImpl;
import dao.implementaciones.DAOProductoImpl;
import dao.implementaciones.DAOUbicacionImpl;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Marca;
import model.Producto;
import model.Ubicacion;

/**
 * FXML Controller class
 *
 * @author dam2
 */
public class FXMLDatosController implements Initializable {

    @FXML
    private TableView<Producto> fxTableProductos;

    @FXML
    private TableView<Ubicacion> fxTableUbicaciones;

    @FXML
    private TableView<Marca> fxTableMarcas;

    @FXML
    private TableColumn<Producto, Integer> fxId;

    @FXML
    private TableColumn<Producto, String> fxNombre;

    @FXML
    private TableColumn<Producto, Integer> fxMarca;

    @FXML
    private TableColumn<Producto, String> fxModelo;

    @FXML
    private TableColumn<Producto, Integer> fxUbicacion;

    @FXML
    private TableColumn<Producto, Double> fxPrecio;

    @FXML
    private TableColumn<Producto, String> fxDescripcion;

    @FXML
    private TableColumn<Marca, Integer> fxIdMarca;

    @FXML
    private TableColumn<Marca, String> fxNombreMarca;

    @FXML
    private TableColumn<Marca, String> fxDescripcionMarca;

    @FXML
    private TableColumn<Ubicacion, Integer> fxIdLugar;

    @FXML
    private TableColumn<Ubicacion, String> fxNombreLugar;

    @FXML
    private TableColumn<Ubicacion, String> fxDescripcionLugar;

    public void mostrar() {

        fxTableProductos.getItems().addAll(principal.getProductos());
        fxId.setCellValueFactory(c -> new SimpleObjectProperty<>(c.getValue().getIdproducto()));
        fxNombre.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getNombre()));
        fxMarca.setCellValueFactory(c -> new SimpleObjectProperty<>(c.getValue().getMarca()));
        fxModelo.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getModelo()));
        fxDescripcion.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getDescripcion()));
        fxUbicacion.setCellValueFactory(c -> new SimpleObjectProperty<>(c.getValue().getMarca()));
        fxPrecio.setCellValueFactory(c -> new SimpleObjectProperty<>(c.getValue().getPrecio()));

        fxTableMarcas.getItems().addAll(principal.getMarcas());
        fxIdMarca.setCellValueFactory(c -> new SimpleObjectProperty<>(c.getValue().getIdmarca()));
        fxNombreMarca.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getNombre()));
        fxDescripcionMarca.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getDescripcion()));

        fxTableUbicaciones.getItems().addAll(principal.getUbicaciones());
        fxIdLugar.setCellValueFactory(c -> new SimpleObjectProperty<>(c.getValue().getIdubicacion()));
        fxNombreLugar.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getNombre()));
        fxDescripcionLugar.setCellValueFactory(c -> new SimpleStringProperty(c.getValue().getDescripcion()));

    }

    /**
     * Initializes the controller class.
     */
    private Alert alertWarning;
    private Alert alertInfo;
    private Alert alertError;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        alertWarning = new Alert(Alert.AlertType.WARNING);
        alertInfo = new Alert(Alert.AlertType.INFORMATION);
        alertError = new Alert(Alert.AlertType.ERROR);
    }

    public void clickEliminar() {
        if (fxTableProductos.getSelectionModel().getSelectedItem() != null) {

            Producto producto = fxTableProductos.getSelectionModel().getSelectedItem();

            DAOProductoImpl dao = new DAOProductoImpl();

            dao.borrar(producto);

        } else if (fxTableMarcas.getSelectionModel().getSelectedItem() != null) {

            Marca marca = fxTableMarcas.getSelectionModel().getSelectedItem();

            DAOMarcaImpl dao = new DAOMarcaImpl();

            dao.borrar(marca);

        } else if (fxTableUbicaciones.getSelectionModel().getSelectedItem() != null) {

            Ubicacion ub = fxTableUbicaciones.getSelectionModel().getSelectedItem();

            DAOUbicacionImpl dao = new DAOUbicacionImpl();

            dao.borrar(ub);
        } else {

            alertInfo.setContentText("Seleccione un producto o una marca o un lugar.");
            alertInfo.showAndWait();

        }

    }

    public void clickActualizar() {

    }

    public void clickVolver() {
        principal.cargarPantallaOpciones();
    }

    private FXMLPrincipalController principal;

    public void setPrincipal(FXMLPrincipalController principal) {
        this.principal = principal;
    }

}
