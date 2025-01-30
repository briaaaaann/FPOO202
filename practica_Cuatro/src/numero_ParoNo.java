import java.util.Scanner;
public class numero_ParoNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();
        if (numero % 2 == 0) {
            System.out.println("Par");
        }else{
            System.out.println("Impar");
        }
    }
}

