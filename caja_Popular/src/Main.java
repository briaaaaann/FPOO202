import javax.swing.JOptionPane;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String cuenta = JOptionPane.showInputDialog("Ingresa el numero de cuenta: ");
        int no_Cuenta = Integer.parseInt(cuenta);

        String titular = JOptionPane.showInputDialog("Titular de la cuenta: ");

        String in_Edad = JOptionPane.showInputDialog("Ingresa la edad: ");
        int edad = Integer.parseInt(in_Edad);

        String in_Saldo = JOptionPane.showInputDialog("Ingresa el saldo inicial: ");
        double saldo = Double.parseDouble(in_Saldo);

        String[] opciones = {"Consultar saldo", "Ingresar efectivo", "Retirar efectivo", "Depositar a una cuenta", "Salir"};

        account Cliente = new account(no_Cuenta, titular, edad, saldo);
        int opcion;

        do {
            opcion = JOptionPane.showOptionDialog(
                    null, "Elige una opcion:", "Caja Popular",
                    JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opciones, opciones[0]
            );

            switch (opcion) {
                case 0:
                    Cliente.consultar_Saldo();
                    break;
                case 1:
                    Cliente.ingresar_Efectivo();
                    break;
                case 2:
                    Cliente.reitrarEfectivo();
                    break;
                case 3:
                    Cliente.depositarCuenta();
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saliendo...");
                    break;
            }
        } while (opcion != 4);
    }
}




