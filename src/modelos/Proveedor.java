/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import java.util.Objects;

/**
 *
 * @author sayma
 */
public class Proveedor {
    private final int id;
    private final String empresa;
    private final String telefono;

    public Proveedor(int id, String empresa, String telefono) {
        this.id = id;
        this.empresa = empresa;
        this.telefono = telefono;
    }

    public int getId() { return id; }
    public String getEmpresa() { return empresa; }
    public String getTelefono() { return telefono; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Proveedor)) return false;
        Proveedor prov = (Proveedor) o;
        return id == prov.id;
    }

    @Override
    public int hashCode() { return Objects.hash(id); }
}
