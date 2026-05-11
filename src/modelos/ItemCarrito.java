/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Ricardo J
 */
public class ItemCarrito {
    
    private Producto producto;
    private int cantidad;
    
    //

    public ItemCarrito(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
    }
    
    
    //

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
    
    //

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        }
    
    }
    
    //calcular el subttal
    public double calcularSubtotal(){
        return producto.getPrecio() * cantidad;
    }
    
    
    //
    @Override
    public String toString() {

        return producto.getNombre()
                + " | Cantidad: "
                + cantidad
                + " | Subtotal: $"
                + calcularSubtotal();
    }

    
}
