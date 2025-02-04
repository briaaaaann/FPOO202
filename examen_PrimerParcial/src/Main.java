import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame 1 palabra: ");
        String palabra1 = sc.nextLine();
        System.out.print("Dame 1 palabra: ");
        String palabra2 = sc.nextLine();

        int long1 = palabra1.length();
        int long2 = palabra2.length();
        if(long1 > long2){
            System.out.print("La palabra 1 es mas larga que la palabra 2 por: " + (long1 - long2) + " letras");
        }else{
            System.out.print("La palabra 2 es mas larga que la palabra 1 por: " + (long2 - long1) + " letras");
        }
    }
}