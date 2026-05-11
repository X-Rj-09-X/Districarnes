/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Ricardo J
 */
public abstract class Pago {
    
    protected double monto;
    
    
    //cons...

    public Pago(double monto) {
        this.monto = monto;
    }
    
    
    //

    public double getMonto() {
        return monto;
    }
    
    //
    
    public abstract String procesarPago();
    
    
}
