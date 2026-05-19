/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import java.time.LocalDateTime;
/**
 *
 * @author sayma
 */
public class Venta {
    private final int id;
    private final int idProducto;
    private final int cantidad;
    private final double total;
    private final LocalDateTime fecha;

    public Venta(int id, int idProducto, int cantidad, double precioUnitario) {
        this.id = id;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.total = cantidad * precioUnitario;
        this.fecha = LocalDateTime.now();
    }

    public int getId() { return id; }
    public int getIdProducto() { return idProducto; }
    public int getCantidad() { return cantidad; }
    public double getTotal() { return total; }
    public LocalDateTime getFecha() { return fecha; }
}
