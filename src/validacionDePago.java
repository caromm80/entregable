import java.util.Scanner;

public class validacionDePago {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Validacion de pago");

        // Definir el valor de la entrada
        final int precioEntrada = 50000;

        // Pedir al usuario que ingrese el monto pagado
        System.out.print("Ingresa el monto pagado: ");
        int montoPagado = sc.nextInt();

        // Verificar si el pago es suficiente
        if (montoPagado >= precioEntrada) {
            System.out.println("Pago completo");
        } else {
            System.out.println("Pago insuficiente");
        }
        System.out.println("para el otro commit");



        sc.close();

    }
}
