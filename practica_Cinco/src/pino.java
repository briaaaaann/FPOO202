import java.util.Scanner;

public class pino {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la cantidad de * de la base (numero impar): ");
        int base = sc.nextInt();
        if (base % 2 == 0) {
            System.out.println("Por favor, introduce un numero impar.");
            return;
        }

        int nivel = 1;
        int espacios = base / 2;
        while (nivel <= base) {
            int i = 0;
            while (i < espacios) {
                System.out.print(" ");
                i++;
            }
            int j = 0;
            while (j < nivel) {
                System.out.print("*");
                j++;
            }

            System.out.println();
            nivel += 2;
            espacios--;
        }
    }
}
