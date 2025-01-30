import java.util.Scanner;
public class calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite un valor: ");
        double valor = sc.nextDouble();
        System.out.println("Digite otro valor: ");
        double valor_Dos = sc.nextDouble();
        System.out.println("Elige la operacion a realizar: ");
        System.out.println("1. Sumar");
        System.out.println("2. Multiplicar");
        System.out.println("3. Restar");
        System.out.println("4. Dividir");
        int op = sc.nextInt();
        switch (op){
            case 1:
                System.out.println("La suma de los numeros es: " + (valor + valor_Dos));
                break;
            case 2:
                System.out.println("La multiplica de los numeros es: " + (valor * valor_Dos));
                break;
            case 3:
                System.out.println("La resta de los numeros es: " + (valor - valor_Dos));
                break;
            case 4:
                System.out.println("La division de los numeros es: " + (valor / valor_Dos));
                break;
        }
    }
}
