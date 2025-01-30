import java.util.Scanner;
public class tienda_Videojuegos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("BIENVENIDO");
        System.out.print("Cual es tu edad? ");
        int edad = sc.nextInt();
        if (edad < 4) {
            System.out.println("Entra gratis!");
        } else if (edad <= 18) {
            System.out.println("Precio de entrada: $110");
        }else{
            System.out.println("Precio de entrada: $190");
        }
    }
}
