/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import java.util.ArrayList;
import modelos.Producto;
/**
 *
 * @author jaredarturosandoval
 */
public class ProductoServicio {
    private final ArrayList<Producto> productos;

    /**
     *
     */
    public ProductoServicio() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public ArrayList<Producto> obtenerProductos() {
        return productos;
    }
}
