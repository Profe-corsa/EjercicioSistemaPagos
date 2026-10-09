/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapagos;

/**
 *
 * @author crist
 */
public class PagoPorTransferencia extends Pago {

    private String cbu;

    public PagoPorTransferencia(double importe, String cbu) {
        super(importe);
        this.cbu = cbu;
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    @Override
    public void procesarPago() {

        System.out.println("Pago realizado mediante una transferencia bancaria.");

        System.out.println("CBU: " + this.cbu);
        System.out.println("Importe: $" + super.getImporte());
    }
}


























