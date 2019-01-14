/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Date;

/**
 *
 * @author dam2
 */
public class Ubicacion {

    private int idubicacion;
    private String nombre;
    private String descripcion;
    private Date fechecreacion;

    public Ubicacion(int idubicacion, String nombre, String descripcion, Date fechecreacion) {
        this.idubicacion = idubicacion;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechecreacion = fechecreacion;
    }

    public Ubicacion(String nombre, String descripcion, Date fechecreacion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fechecreacion = fechecreacion;
    }

    public int getIdubicacion() {
        return idubicacion;
    }

    public void setIdubicacion(int idubicacion) {
        this.idubicacion = idubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechecreacion() {
        return fechecreacion;
    }

    public void setFechecreacion(Date fechecreacion) {
        this.fechecreacion = fechecreacion;
    }

    @Override
    public String toString() {
        return "Ubicacion{" + "idubicacion=" + idubicacion + ", nombre=" + nombre + ", descripcion=" + descripcion + ", fechecreacion=" + fechecreacion + '}';
    }

}
