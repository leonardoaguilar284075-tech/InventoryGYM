/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import modelos.Producto;
import servicios.ProductoServicio;
import iu.LoginFrame;
/**
 *
 * @author jaredarturosandoval
 */
public class Main {
    
    public static void main(String[] args) {


        ProductoServicio servicio = new ProductoServicio();

        Producto p1 = new Producto(
                1,
                "Mazapan",
                15.0,
                20,
                "Dulce"
        );

        servicio.agregarProducto(p1);

        for (Producto p : servicio.obtenerProductos()) {

            System.out.println(p.getNombre());
        }
       
        LoginFrame login = new LoginFrame();

        login.setVisible(true);

    }

}
    

    

