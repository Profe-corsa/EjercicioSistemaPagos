/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapagos;

/**
 *
 * @author crist
 */
public class PagoConTarjeta extends Pago {
    private String numeroTarjeta;
    private String nombreTitular;

    public PagoConTarjeta(double importe, String numeroTarjeta,
                          String nombreTitular) {

        super(importe);
        this.numeroTarjeta = numeroTarjeta;
        this.nombreTitular = nombreTitular;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNombreTitular() {
        return this.nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    @Override
    public void procesarPago() {

        System.out.println("Pago realizado utilizando una tarjeta.");
        System.out.println("Titular: " + this.nombreTitular);
        System.out.println("Importe: $" + super.getImporte());
    }
}






















