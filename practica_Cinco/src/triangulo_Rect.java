import java.util.Scanner;
public class triangulo_Rect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un numero entero: ");
        int altura = sc.nextInt();
        for (int i = 1; i <= altura; i += 2) {
            for (int j = i; j >= 1; j -= 2) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
