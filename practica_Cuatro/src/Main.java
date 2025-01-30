import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pass = "contraseniaDificil";
        System.out.println("Introduzca el password: ");
        String prueba = sc.nextLine();
        if(prueba.equals(pass)){
            System.out.println("El password es correcto");
        }else{
            System.out.println("El password es incorrecto");
        }
    }
}


