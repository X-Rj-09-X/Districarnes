/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author Ricardo J
 */
public class PagoTarjeta extends Pago {
    
    private String numeroTarjeta;
    
    //construc...

    public PagoTarjeta(double monto, String numeroTarjeta) {
        super(monto);
        this.numeroTarjeta = numeroTarjeta;
    }
    
    @Override
    public String procesarPago() {

        return "Pago con tarjeta aprobado por $"
                + monto;
    }
}
