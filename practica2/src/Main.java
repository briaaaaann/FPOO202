//Importaciones
import java.util.Scanner;
//Clase principal
public class Main {
    //Metodo principal
    public static void main(String[] args) {
        System.out.println("Hello, Brian Camion Barron Arteaga");
        /* COMENARIO
        PERO
        GRANDOTE
         */


        //2. Cadenas
            //Concatenar cadenas
            String cadena = "brian" + "barron" + "arteaga";
            System.out.println(cadena);

            //Longitud de una cadena
            System.out.println(cadena.length());

            //Extraccionn de caracteres de una cadena en base a parametros
            System.out.println(cadena.substring(2,5));
            System.out.println(cadena.substring(2));
            System.out.println(cadena.substring(0,5));

            //3. Variables
            String cadena2 = "333", cadena3, cadena4;
            int entero = 3, entero2, entero3;
            double decimal = 3.3, decimal2, decimal3;

            //Convertir cadena a int
            entero2 = Integer.parseInt(cadena2);
            System.out.println(entero2);

            //Convertir double a int
            entero3 = (int) decimal;
            System.out.println(entero3);

            //Convertir double a cadena
            cadena3 = String.valueOf(decimal);
            System.out.println(cadena3);

            //Convertir int a double
            decimal2 = Double.valueOf(entero);
            System.out.println(decimal2);

            //Conversion implicita
            int i = 12;
            double numd = i;
            System.out.println(numd);


            //4. Solicitud de datos
            Scanner sc = new Scanner(System.in);
            System.out.println("Escribe una cadena: ");
            String cadena1 = sc.nextLine();

            System.out.println("Escribe un numero entero: ");
            int entero1 = sc.nextInt();

            System.out.println("Escribe un numero decimal: ");
            double decimal1 = sc.nextDouble();

            System.out.println("Cadena guardada: " + cadena1);
            System.out.println("Numero entero: " + entero1);
            System.out.println("Numero decimal: " + decimal1);

            //5. Boolean, operadores logico y de comparacion
            //Operadores de comparacion
            System.out.println(10 > 9);
            System.out.println(10 == 9);
            System.out.println(10 < 9);
            System.out.println(10 >= 9);
            System.out.println(10 <= 9);
            System.out.println(10 != 9);

            //Operadores logicos
            int x = 3;
            System.out.println(x < 5 && x > 10);
            System.out.println(x < 5 || x > 10);
            System.out.println(!(x < 5 && x > 10));
            System.out.println(!(x < 5 || x > 10));
    }
}