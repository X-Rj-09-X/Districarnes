/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Ricardo J
 */
public class PagoEfectivo extends Pago{

    public PagoEfectivo(double monto) {
        super(monto);
    }
    
    @Override
    public String procesarPago() {

        return "Pago en efectivo realizado por $"
                + monto;
    }
    
}
