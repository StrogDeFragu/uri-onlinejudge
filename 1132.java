import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        
        int soma = 0;
        if (a > b) {
            for (int i = b; i <= a; i++) {
                if (i % 13 != 0) {
                    soma += i;
                }
            }
        } else if (a < b) {
            for (int i = a; i <= b; i++) {
                if (i % 13 != 0) {
                    soma += i;
                }
            }
        }
        System.out.println(soma);
    }
}