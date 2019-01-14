/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author dam2
 */
public class User {

    private int idUsuario;
    private String user;
    private String nombre;
    private String apellido;
    private String telefono;
    private String mail;
    private String dni;
    private int tipo;

    public User(int idUsuario, String user, String nombre, String apellido, String telefono, String mail, String dni, int tipo) {
        this.idUsuario = idUsuario;
        this.user = user;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
        this.dni = dni;
        this.tipo = tipo;
    }

    public User(String user, String nombre, String apellido, String telefono, String mail, String dni, int tipo) {
        this.user = user;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
        this.dni = dni;
        this.tipo = tipo;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "User{" + "idUsuario=" + idUsuario + ", user=" + user + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", mail=" + mail + ", dni=" + dni + ", tipo=" + tipo + '}';
    }
    
    
}
