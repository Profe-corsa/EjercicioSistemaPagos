/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemapagos;

/**
 *
 * @author crist
 */
public abstract class Pago {
    private double importe;

    public Pago(double importe) {
        this.importe = importe;
    }

    public double getImporte() {
        return this.importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }

    public abstract void procesarPago();
}






















