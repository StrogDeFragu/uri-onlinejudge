import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        
        int contador = 0;
        
        while (contador < 6) {
            if (x % 2 != 0) {
                System.out.println(x);
                contador++;
            }
            x++;
        }

    }
}
