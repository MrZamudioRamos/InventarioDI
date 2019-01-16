/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;

/**
 *
 * @author dam2
 */

public interface DAO<T> {

    public int insertar(T a);

    public int modificar(T a);

    public int borrar(T a);

    public int borrarEntero(T a);

    public List<T> getAll();

    public T obtener(int id);

}
