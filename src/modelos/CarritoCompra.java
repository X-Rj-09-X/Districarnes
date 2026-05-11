/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import java.util.ArrayList;

/**
 *
 * @author Ricardo J
 */
public class CarritoCompra {
    
    private ArrayList<ItemCarrito> items;
    
    //cosntructor

    public CarritoCompra(){
        this.items = new ArrayList<>();
    }
    
    //agregar producto
    public void agregarItem(ItemCarrito item) {
        items.add(item);
    }
    
    //item
    public ArrayList<ItemCarrito> getItems() {
        return items;
    }
    
    //calcular total
    public double calcularTotal() {

        double total = 0;

        for (ItemCarrito item : items) {

            total += item.calcularSubtotal();
        }

        return total;
    }
    
    //vaciar el carro
    public void vaciarCarrito() {

        items.clear();
    }
    
}
