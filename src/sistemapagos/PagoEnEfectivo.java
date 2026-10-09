/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapagos;

/**
 *
 * @author crist
 */
public class PagoEnEfectivo extends Pago{
    public PagoEnEfectivo(double importe) {
        super(importe);
    }

    @Override
    public void procesarPago() {

        System.out.println("Pago realizado en efectivo.");
        System.out.println("Importe: $" + super.getImporte());
    }
}

























