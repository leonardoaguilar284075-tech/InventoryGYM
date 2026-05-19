/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;
import modelos.Producto;
import java.util.List;
/**
 *
 * @author sayma
 */

import excepciones.EntidadNoEncontradaException;

public interface IProductoServicio {
    void registrar(Producto producto) throws Exception;
    void actualizar(int id, Producto nuevo) throws EntidadNoEncontradaException;
    void eliminar(int id) throws EntidadNoEncontradaException;
    List<Producto> listarTodos();
    Producto buscarPorId(int id) throws EntidadNoEncontradaException;
    Producto buscarPorNombre(String nombre) throws EntidadNoEncontradaException;
    List<Producto> ordenarPorStock();  
}
