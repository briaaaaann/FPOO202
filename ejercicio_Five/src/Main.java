import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("PEDIDO");
        System.out.print("Ingrese el numero de payasos vendidos: ");
        int pay = sc.nextInt();
        System.out.print("Ingrese el numero de muniecas vendidas: ");
        int mun = sc.nextInt();
        int peso = (pay * 112) + (mun * 75);
        System.out.print("Peso total: " + peso + "gr");

    }
}

