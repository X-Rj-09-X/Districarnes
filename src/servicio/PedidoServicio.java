/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;
import java.util.ArrayList;
import modelos.CarritoCompra;
import modelos.Cliente;
import modelos.ItemCarrito;
import modelos.Pedido;

/**
 *
 * @author Ricardo J
 */
public class PedidoServicio {
    
    
    private ArrayList<Pedido> pedidos;
    
    //const...
    public PedidoServicio() {

        pedidos = new ArrayList<>();
    }
    
    //crear
    public Pedido crearPedido(int id, Cliente cliente, CarritoCompra carrito) {

        ArrayList<ItemCarrito> items = carrito.getItems();

        double total = carrito.calcularTotal();

        Pedido pedido = new Pedido(id, cliente, items, total, "PENDIENTE");

        pedidos.add(pedido);

        return pedido;
    }
    
    //obtener
    public ArrayList<Pedido> getPedidos() {

        return pedidos;
    }

    // Buscar pedido
    public Pedido buscarPedido(int id) {
        for (Pedido pedido : pedidos) {
            if (pedido.getId() == id) {
                return pedido;
            }
        }
        return null;
    }
    
}
