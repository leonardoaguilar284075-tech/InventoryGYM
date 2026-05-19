/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;
import java.util.Arrays;

/**
 *
 * @author sayma
 */
public class AutenticacionServicio {
    public boolean verificarCredenciales(String usuario, char[] password) {
        char[] passwordCorrecto = {'1', '2', '3', '4'};
        if (!"admin".equals(usuario)) {
            return false;
        }
        boolean esValido = Arrays.equals(password, passwordCorrecto);
        Arrays.fill(passwordCorrecto, '0'); // Seguridad en RAM
        return esValido;
    }
}
