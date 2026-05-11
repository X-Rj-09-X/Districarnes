/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;
import modelos.CarritoCompra;
import modelos.ItemCarrito;
import modelos.Producto;

/**
 *
 * @author Ricardo J
 */
public class CarritoServicio {
    
    private CarritoCompra carrito;
    
    //const....
    public CarritoServicio() {

        carrito = new CarritoCompra();
    }
    
    
    //obtener
    public CarritoCompra getCarrito() {

        return carrito;
    }
    
    //agregar
    public void agregarProducto(Producto producto, int cantidad) {
        if (producto != null && producto.hayStock() && cantidad > 0) {
            
            ItemCarrito item = new ItemCarrito(producto, cantidad);
            carrito.agregarItem(item);
        }
    }
    
    //total
     public double obtenerTotal() {

        return carrito.calcularTotal();
    }

     //limpiar
     public void vaciarCarrito() {

        carrito.vaciarCarrito();
    }
    
}
