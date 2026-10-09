/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemapagos;

/**
 *
 * @author crist
 */
public class SistemaPagos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 1. Crear un pago con tarjeta
//        PagoConTarjeta pagoTarjeta =
//                new PagoConTarjeta(
//                        15000,
//                        "1234567890123456",
//                        "Cristian Corsaro"
//                );
//
//        // 2. Crear un pago en efectivo
//        PagoEnEfectivo pagoEfectivo =
//                new PagoEnEfectivo(8500);
//
//        // 3. Crear un pago por transferencia
//        PagoPorTransferencia pagoTransferencia =
//                new PagoPorTransferencia(
//                        22000,
//                        "0720001234567890123456"
//                );
//
//        // Procesar los pagos
//        System.out.println("=== PAGO CON TARJETA ===");
//        pagoTarjeta.procesarPago();
//
//        System.out.println();
//
//        System.out.println("=== PAGO EN EFECTIVO ===");
//        pagoEfectivo.procesarPago();
//
//        System.out.println();
//
//        System.out.println("=== PAGO POR TRANSFERENCIA ===");
//        pagoTransferencia.procesarPago();
            Pago[] pagos = {

            new PagoConTarjeta(
                    15000,
                    "1234567890123456",
                    "Cristian Corsaro"
            ),

            new PagoEnEfectivo(8500),

            new PagoPorTransferencia(
                    22000,
                    "0720001234567890123456"
            )
        };

        for (Pago pago : pagos) {

            pago.procesarPago();


            System.out.println("----------------------");
        }
    }
    
}
