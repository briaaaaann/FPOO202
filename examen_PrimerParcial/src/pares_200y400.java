import java.util.Scanner;
public class pares_200y400 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Dame un numero par comprendido entre 200 y 400: ");
        int num = sc.nextInt();
        for(int i = num; i <= 400; i = i + 2){
            System.out.print(i + ", ");
        }
    }
}
