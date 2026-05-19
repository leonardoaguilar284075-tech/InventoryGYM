/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;
import java.util.*;
import modelos.Producto;
import excepciones.EntidadNoEncontradaException;
/**
 *
 * @author jaredarturosandoval
 */


public class ProductoServicio implements IProductoServicio {
    // REQUISITO MAP: Indexación rápida O(1)
    private final Map<Integer, Producto> mapaProductos = new HashMap<>();
    // REQUISITO SET: Garantiza no duplicados
    private final Set<Producto> setProductos = new HashSet<>();

    @Override
    public synchronized void registrar(Producto producto) throws Exception {
        if (mapaProductos.containsKey(producto.getId())) {
            throw new Exception("El ID " + producto.getId() + " ya existe.");
        }
        mapaProductos.put(producto.getId(), producto);
        setProductos.add(producto);
    }

    @Override
    public synchronized void actualizar(int id, Producto nuevo) throws EntidadNoEncontradaException {
        if (!mapaProductos.containsKey(id)) {
            throw new EntidadNoEncontradaException("El producto con ID " + id + " no existe.");
        }
        Producto antiguo = mapaProductos.get(id);
        setProductos.remove(antiguo);
        mapaProductos.put(id, nuevo);
        setProductos.add(nuevo);
    }

    @Override
    public synchronized void eliminar(int id) throws EntidadNoEncontradaException {
        if (!mapaProductos.containsKey(id)) {
            throw new EntidadNoEncontradaException("El ID " + id + " no existe.");
        }
        Producto p = mapaProductos.remove(id);
        setProductos.remove(p);
    }

    @Override
    public List<Producto> listarTodos() {
        // REQUISITO LIST: Retorna un ArrayList con los elementos
        return new ArrayList<>(setProductos);
    }

    @Override
    public Producto buscarPorId(int id) throws EntidadNoEncontradaException {
        Producto p = mapaProductos.get(id);
        if (p == null) throw new EntidadNoEncontradaException("ID " + id + " no registrado.");
        return p;
    }

    @Override
    public Producto buscarPorNombre(String nombre) throws EntidadNoEncontradaException {
        return setProductos.stream()
                .filter(p -> p.getNombre().equalsIgnoreCase(nombre))
                .findFirst()
                .orElseThrow(() -> new EntidadNoEncontradaException("Producto '" + nombre + "' no encontrado."));
    }

    @Override
    public List<Producto> ordenarPorStock() {
        List<Producto> lista = new ArrayList<>(setProductos);
        lista.sort(Comparator.comparingInt(Producto::getStock));
        return lista;
    }
}
