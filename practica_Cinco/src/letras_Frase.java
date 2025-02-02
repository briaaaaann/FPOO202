import java.util.Scanner;
public class letras_Frase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int suma = 0;
        System.out.println("Digite una frase: ");
        String frase = sc.nextLine();
        System.out.println("Digite una letra: ");
        char letra = sc.next().charAt(0);
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) == letra) {
                suma += 1;
            }
        }
        System.out.println("La frase: " + frase + " cuenta con la letra: "+ letra + " " + suma + " veces");
    }
}
