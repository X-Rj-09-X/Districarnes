/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;
import modelos.Producto;
import java.util.ArrayList;


/**
 *
 * @author Ricardo J
 */
public class ProductoServicio {
    
    private ArrayList<Producto> productos;

    //costructor
    public ProductoServicio() {
        productos = new ArrayList<>();
    }
    
    //obstencion del producto
    public ArrayList<Producto> getProductos() {

        return productos;
    }

    //buscar producto
    public Producto buscarProducto(int id) {

        for (Producto producto : productos) {

            if (producto.getId() == id) {

                return producto;
            }
        }

        return null;
    }
    
    // eliminar el producto
    public boolean eliminarProducto(int id) {

        Producto producto = buscarProducto(id);

        if (producto != null) {

            productos.remove(producto);

            return true;
        }

        return false;
    }
}
