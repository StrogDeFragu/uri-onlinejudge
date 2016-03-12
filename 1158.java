import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        for (int i = 0; i < n; i++) {
            int x = input.nextInt();
            int y = input.nextInt();
            
            int cont = 0;
            int j = x;
            
            int soma = 0;
            while (cont < y) {
                if (j % 2 != 0) {
                    soma += j;
                    cont++;
                }
                j++;
            }
            System.out.println(soma);
        }
        
    }
}
