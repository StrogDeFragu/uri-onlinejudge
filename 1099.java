import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            
            int soma = 0;
            if (x > y) {
                for (int j = x-1; j > y; j--) {
                    if (j % 2 != 0) soma += j;
                }
            } else if (x < y) {
                for (int j = x+1; j < y; j++) {
                    if (j % 2 != 0) soma += j;
                }
            }
            System.out.println(soma);
        }
    }
}