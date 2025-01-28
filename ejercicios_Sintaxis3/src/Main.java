import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("CALCULA TU SUELDO");
        Scanner sc = new Scanner(System.in);
        System.out.println("Numero de horas trabajadas: ");
        double horasTrabajadas = sc.nextDouble();
        System.out.println("Pago por hora trabajada: ");
        double horaPago = sc.nextDouble();
        double sueldo = horasTrabajadas * horaPago;
        System.out.println("Sueldo $" + sueldo);
    }

}

