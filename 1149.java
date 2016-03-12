import java.util.Scanner;

/**
 * Created by mathe on 01/03/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int n = input.nextInt();

        while (n <= 0) {
            n = input.nextInt();
        }
        int soma = 0;
        int aux = 0;
        for (int i = a;; i++) {
            soma += i;
            aux++;
            if (aux == n)
                break;
        }

        System.out.println(soma);
    }
}