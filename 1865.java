import java.util.Scanner;

/**
 * Created by mathe on 02/03/2016.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int c = input.nextInt();

        for (int i = 0; i < c; i++) {
            String nome = input.next();
            int newtons = input.nextInt();
            
            if (nome.equals("Thor")) {
                System.out.println("Y");
            } else {
                System.out.println("N");
            }
        }
    }
}