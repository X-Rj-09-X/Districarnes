/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Ricardo J
 */
public class Pedido {
    
    private int id;
    private Cliente cliente;
    private ArrayList<ItemCarrito> items;
    private double total;
    private LocalDate fecha;
    private String estado;
    
    //constructor

    public Pedido(int id, Cliente cliente, ArrayList<ItemCarrito> items, double total, String estado) {
        this.id = id;
        this.cliente = cliente;
        this.items = items;
        this.total = total;
        this.fecha = LocalDate.now();
        this.estado = estado;
    }
    
    //g&s

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ItemCarrito> getItems() {
        return items;
    }

    public void setItems(ArrayList<ItemCarrito> items) {
        this.items = items;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (!estado.isEmpty()) {
            this.estado = estado;
        }
        
    }
    
    @Override
    public String toString() {

        return "Pedido #"
                + id
                + " | Cliente: "
                + cliente.getNombre()
                + " | Total: $"
                + total
                + " | Fecha: "
                + fecha
                + " | Estado: "
                + estado;
    }
}
