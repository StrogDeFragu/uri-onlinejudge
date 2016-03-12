import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            int m = input.nextInt();
            int n = input.nextInt();
            
            if (m == 0 || n == 0) return;
            
            int maior = (m > n)? m:n;
            int menor = (m > n)? n:m;
            int soma = 0;
            for (int i = menor; i <= maior; i++) {
                System.out.print(i + " ");
                soma += i;
            }
            System.out.println("Sum=" + soma);
        }
    }
}