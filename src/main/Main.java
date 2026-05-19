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
// 1. Creamos el inventario global ÚNICO de la app
        ProductoServicio servicio = new ProductoServicio();

        Producto p1 = new Producto(
                1,
                "Mazapan",
                15.0,
                20,
                "Dulce"
        );

        try {
            servicio.registrar(p1);
        } catch (Exception e) {
            System.out.println("Error al registrar producto inicial: " + e.getMessage());
        }

        for (Producto p : servicio.listarTodos()) {
            System.out.println("Producto cargado: " + p.getNombre());
        }
        
        LoginFrame login = new LoginFrame(); // 👈 Si tu login necesita el inventario, cambiar a: new LoginFrame(servicio);
        login.setLocationRelativeTo(null); // Esto centrará tu ventana de login en la pantalla
        login.setVisible(true);
    }

}
    

    

