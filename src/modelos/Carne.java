/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Ricardo J
 */
public class Carne extends Producto {

    private String tipoCorte;
    private String tipoCarne;
    
    
    //constructor

    public Carne(int id, String nombre, double precio, double peso, int stock, String tipoCorte, String tipoCarne) {
        
        super(id, nombre, precio, peso, stock);
        
        this.tipoCorte = tipoCorte;
        this.tipoCarne = tipoCarne;
    }
    
    
    //getter setter

    public String getTipoCorte() {
        return tipoCorte;
    }

    public void setTipoCorte(String tipoCorte) {
        
        if (!tipoCorte.isEmpty()){
            this.tipoCorte = tipoCorte;
        }
    }
    
    //

    public String getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(String tipoCarne) {
        if (!tipoCarne.isEmpty()) {
            this.tipoCarne = tipoCarne;
        }
    }
    
    
    //polimorfismo
    @Override
    public String getCategoria(){
        return "Carnes";
    }
    
    //mostrar info
    @Override
    public String toString() {

        return super.toString()
                + " | Tipo: "
                + tipoCarne
                + " | Corte: "
                + tipoCorte;
    }
}
