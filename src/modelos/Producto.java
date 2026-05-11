/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Ricardo J
 */
public abstract class Producto {
    
    private int id;
    private String nombre;
    private double precio;
    private double peso;
    private int stock;
    
    
    //constructor

    public Producto(int id, String nombre, double precio, double peso, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.peso = peso;
        this.stock = stock;
    }
    
    
    //getter y setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    
    //
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    //
    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
        this.precio = precio;
        }
        
    }

    
    //
    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso > 0) {
        this.peso = peso;
        }
        
    }

    
    //
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
        this.stock = stock;
        }
        
    }
    
    //metodo
    public boolean hayStock(){
        return stock > 0;
    }
    
    
    //metodo abstracto
    public abstract String getCategoria();
    
    
    //mostrar el producto
    @Override 
    public String toString(){
        
        return id + " | "
                + nombre
                + " | $"
                + precio
                + " | "
                + peso
                + "kg"
                + " | Stock: "
                + stock;
    }
    
}
