import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        

        double media = 0;
        int contador = 0;
        while ( x > 0 ) {
            media += x;
            contador++;
            x = input.nextInt();
        }
        
        media /= contador;
        System.out.printf("%.2f\n", media);
        
    }
}