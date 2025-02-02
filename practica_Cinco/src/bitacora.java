import java.util.Scanner;
public class bitacora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saldo = 0;

        System.out.println("Ingrese opcion (D Depositar, R Retirar).");
        System.out.println("Presione Enter sin escribir nada para finalizar.");

        while (true) {
            String linea = sc.nextLine();

            if (linea.isEmpty()) {
                break;
            }

            char operacion = linea.charAt(0);
            int cantidad = Integer.parseInt(linea.substring(2));

            if (operacion == 'D') {
                saldo += cantidad;
            } else if (operacion == 'R') {
                saldo -= cantidad;
            }
        }

        System.out.println("Saldo final: " + saldo);
    }
}
