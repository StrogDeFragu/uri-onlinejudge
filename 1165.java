import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            
            int cont = 0;
            for (int j = 1; j <= x / 2; j++) {
                if (x % j == 0) {
                    cont++;
                }
            }
            
            if (cont == 1) {
                System.out.println(x + " eh primo");
            } else {
                System.out.println(x + " nao eh primo");
            }
        }
    }
}