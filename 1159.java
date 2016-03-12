import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        while (n != 0) {
            int cont = 0;
            int j = n;
            
            int soma = 0;
            while (cont < 5) {
                if (j % 2 == 0) {
                    soma += j;
                    cont++;
                }
                j++;
            }
            System.out.println(soma);
            
            n = input.nextInt();
        }
        
    }
}