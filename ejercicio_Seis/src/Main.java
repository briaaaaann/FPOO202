import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una frase: ");
        String frase = sc.nextLine();
        String invertida = new StringBuilder(frase).reverse().toString();
        System.out.println(invertida);
    }
}

