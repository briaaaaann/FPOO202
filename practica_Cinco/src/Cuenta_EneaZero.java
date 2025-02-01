import java.util.Scanner;
public class Cuenta_EneaZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame un numero entero: ");
        int numero = sc.nextInt();
        for (int i = numero; i >= 0; i--) {
            System.out.print(i + ", ");
        }
    }
}
