import java.util.Scanner;
public class palindromo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dame una palabra: ");
        String palabra = sc.nextLine();
        String palabra2 = palabra.replaceAll(" ", "");
        String invertida = new StringBuilder(palabra2).reverse().toString();
        if (palabra2.equals(invertida)) {
            System.out.println("Palabra palindroma");
        }else{
            System.out.println("Palabra no palindroma");
        }
    }
}



