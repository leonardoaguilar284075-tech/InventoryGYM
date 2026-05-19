/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import java.util.Objects;

/**
 *
 * @author jaredarturosandoval
 */
public class Producto {
    
    private final int id;
    private final String nombre;
    private final double precio;
    private int stock;
    private final String categoria;

    public Producto(int id, String nombre, double precio, int stock, String categoria) {
        if (precio < 0 || stock < 0){
            throw new IllegalArgumentException("Precio y stock no pueden ser negativos.");
        }
        this.id = id;
        this.nombre = Objects.requireNonNull(nombre, "El nombre no puede ser nulo.");
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }

    public String getCategoria() {
        return categoria;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Producto)) return false;
        Producto producto = (Producto) o;
        return id == producto.id;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id);
    }
    
    public void setStock(int stock) {
    if (stock < 0) {
        throw new IllegalArgumentException("El stock no puede ser negativo.");
    }
    this.stock = stock;
}
}
