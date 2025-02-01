import java.util.Scanner;
public class tablas_Mult {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for(int i = 1;i <= 10 ;i++){
            for(int j = 1;j <= 10 ;j++){
                System.out.print(i + " X " + j + " = " + (i*j) + "\n");
            }
            System.out.print("\n");
        }
    }
}
